package array;

public class ArrayExample {

	    public static void main(String[] args) {
	        // Create an array of integers
	        int[] numbers = new int[5];
	        
	        // Assign values to the array
	        numbers[0] = 10;
	        numbers[1] = 20;
	        numbers[2] = 30;
	        numbers[3] = 40;
	        numbers[4] = 50;
	        
	        // Print the values of the array
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element " + i + ": " + numbers[i]);
	        }
	        
	        // Create an array of strings
	        String[] names = {"Naveen", "Arun", "Bharath", "Murali"};
	        
	        // Print the values of the array
	        for (int i = 0; i < names.length; i++) {
	            System.out.println("Element " + i + ": " + names[i]);
	        }
	    }
	}

