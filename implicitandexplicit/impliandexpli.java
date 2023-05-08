package implicitandexplicit;
import java.util.Scanner;

public class impliandexpli {
	
	    public static void main(String[] args) {
	        // Implicit Type Casting
	        int myInt = 10;
	        double myDouble = myInt; // implicit casting from int to double
	        System.out.println("Implicit Type Casting Example:");
	        System.out.println("Value of myInt: " + myInt);
	        System.out.println("Value of myDouble: " + myDouble);

	        // Explicit Type Casting
	        double anotherDouble = 10.5;
	        int anotherInt = (int) anotherDouble; // explicit casting from double to int
	        System.out.println("\nExplicit Type Casting Example:");
	        System.out.println("Value of anotherDouble: " + anotherDouble);
	        System.out.println("Value of anotherInt: " + anotherInt);
	    }
	}


