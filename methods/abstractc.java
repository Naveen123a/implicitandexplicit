package methods;

// Java Program to Illustrate Abstract Methods

// Class 1
// Helper class acting as Abstract class
abstract class GFGhelp {

	// Creating abstract method
	abstract void check(String name);
}

// Class 2
// Main class extending to helper class
public class abstractc extends GFGhelp {

	// main driver method
	public static void main(String[] args)
	{
		// Creating the instance of the class
		abstractc ob = new abstractc();

		// Accessing the abstract method
		ob.check("GFG");
	}

	// Extends the abstract method
	@Override void check(String name)
	{
		System.out.println(name);
	}
}
