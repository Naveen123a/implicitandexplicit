package implicitandexplicit;
import java.util.Scanner;

public class ImplicitandExplixit {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Implicit Type Casting
		        System.out.println("Enter an integer: ");
		        int myInt = sc.nextInt();
		        double myDouble = myInt; // implicit casting from integer to double
		        System.out.println("Implicit Type Casting Example:");
		        System.out.println("Value of myInt: " + myInt);
		        System.out.println("Value of myDouble: " + myDouble);
	
		        // Explicit Type Casting
		        System.out.println("\nEnter a double: ");
		        double anotherDouble = sc.nextDouble();
		        int anotherInt = (int) anotherDouble; // explicit casting from double to integer
		        System.out.println("\nExplicit Type Casting Example:");
		        System.out.println("Value of anotherDouble: " + anotherDouble);
		        System.out.println("Value of anotherInt: " + anotherInt);
		    }
	}


