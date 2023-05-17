import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the starting index (L): ");
        int L = scanner.nextInt();

        System.out.print("Enter the ending index (R): ");
        int R = scanner.nextInt();

        int sum = findSumInRange(array, L, R);

        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);
    }

    public static int findSumInRange(int[] array, int L, int R) {
        if (L < 0 || R >= array.length || L > R) {
            throw new IllegalArgumentException("Invalid range.");
        }

        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += array[i];
        }

        return sum;
    }
}
