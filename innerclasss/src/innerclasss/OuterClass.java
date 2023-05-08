package innerclasss;

	public class OuterClass {
	    private int x = 10;
	    
	    // Inner class
	    public class InnerClass {
	        public int getX() {
	            System.out.println("Accessing x from inner class.");
	            return x;
	        }
	    }
	    
	    public static void main(String[] args) {
	        // Create an instance of the outer class
	        OuterClass outer = new OuterClass();
	        
	        // Create an instance of the inner class
	        OuterClass.InnerClass inner = outer.new InnerClass();
	        
	        // Access the value of x from the inner class
	        int xValue = inner.getX();
	        System.out.println("Value of x from outer class: " + xValue);
	    }
	}

	
