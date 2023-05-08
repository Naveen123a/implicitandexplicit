
public class Constructordemo {
	public static class ConstructorDemo {
	    private String name;
	    private int age;
	    
	    // default constructor
	    public ConstructorDemo() {
	        name = "John Doe";
	        age = 18;
	    }
	    
	    // parameterized constructor with two parameters
	    public ConstructorDemo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    
	    // copy constructor
	    public ConstructorDemo(ConstructorDemo obj) {
	        name = obj.name;
	        age = obj.age;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public int getAge() {
	        return age;
	    }
	    
	    public static void main(String[] args) {
	        // create an object using the default constructor
	        ConstructorDemo obj1 = new ConstructorDemo();
	        System.out.println("Name: " + obj1.getName());
	        System.out.println("Age: " + obj1.getAge());
	        
	        // create an object using the parameterized constructor
	        ConstructorDemo obj2 = new ConstructorDemo("Alice", 25);
	        System.out.println("Name: " + obj2.getName());
	        System.out.println("Age: " + obj2.getAge());
	        
	        // create an object using the copy constructor
	        ConstructorDemo obj3 = new ConstructorDemo(obj2);
	        System.out.println("Name: " + obj3.getName());
	        System.out.println("Age: " + obj3.getAge());
	    }
	}

}
