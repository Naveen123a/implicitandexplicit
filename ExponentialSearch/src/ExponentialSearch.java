import java.util.Scanner;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0; // Return 0 if the target element is found at the first position
        }

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i *= 2;
        }

        return binarySearch(arr, target, i / 2, Math.min(i, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index if the target element is found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the array elements in sorted order:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to search: ");
        int target = scanner.nextInt();

        scanner.close();

        int result = exponentialSearch(array, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
