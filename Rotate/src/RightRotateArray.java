import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array: " + Arrays.toString(array));

        rightRotateArray(array, 5);

        System.out.println("Rotated Array: " + Arrays.toString(array));
    }

    public static void rightRotateArray(int[] array, int steps) {
        int length = array.length;
        steps = steps % length; // Adjust steps if it exceeds array length

        // Reverse the entire array
        reverseArray(array, 0, length - 1);

        // Reverse the first 'steps' elements
        reverseArray(array, 0, steps - 1);

        // Reverse the remaining elements
        reverseArray(array, steps, length - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
