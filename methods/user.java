package methods;
import java.io.*;
public class user {

		// Java Program to Illustrate User-Defined Methods

		// Importing essential input output classes


			// Method 1
			// Method of this class
			void hello()
			{
				// Print statement whenever this method s called
				System.out.println("This is the userDefinedMethod");
			}

			// Method 2
			// Main driver method
			public static void main(String[] args)
			{
				// Creating instance of the class
				// inside the main() method
			    user ob = new user();

				// Calling the method of class 1
				// inside class 2
				ob.hello();
			}
}