package accessspecifier;

public class access {

	public static void main(String[] args) {
		        // create an object of the Test class
		        Test obj = new Test();
		        
		        // access the public method
		        obj.publicMethod();
		        
		        // access the protected method
		        obj.protectedMethod();
		        
		        // access the default method
		        obj.defaultMethod();
		        
		        // the private method cannot be accessed from outside the class
		    }
		}

		class Test {
		    public void publicMethod() {
		        System.out.println("This is a public method.");
		    }
		    
		    protected void protectedMethod() {
		        System.out.println("This is a protected method.");
		    }
		    
		    void defaultMethod() {
		        System.out.println("This is a default method.");
		    }
		    
		    private void privateMethod() {
		        System.out.println("This is a private method.");
		    }
		}


