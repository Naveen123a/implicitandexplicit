import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        int[] array = {8, 2, 10, 7, 5, 1, 9, 3, 6, 4};

        int fourthSmallest = findFourthSmallest(array);

        System.out.println("Fourth Smallest Element: " + fourthSmallest);
    }

    public static int findFourthSmallest(int[] array) {
        if (array.length < 4) {
            throw new IllegalArgumentException("Array should have at least 4 elements.");
        }

        Arrays.sort(array); // Sort the array in ascending order

        return array[3]; // Return the fourth element (index 3)
    }
}
