
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;

	public class CollectionDemo {
	    public static void main(String[] args) {
	        // create an ArrayList of strings
	        ArrayList<String> names = new ArrayList<>();
	        names.add("Naveen");
	        names.add("Arun");
	        names.add("Bharath");
	        System.out.println("ArrayList of names: " + names);
	        
	        // create a HashSet of integers
	        HashSet<Integer> numbers = new HashSet<>();
	        numbers.add(3);
	        numbers.add(7);
	        numbers.add(5);
	        System.out.println("HashSet of numbers: " + numbers);
	        
	        // create a HashMap of key-value pairs
	        HashMap<String, Integer> ages = new HashMap<>();
	        ages.put("Naveen", 25);
	        ages.put("Arun", 23);
	        ages.put("Bharath", 24);
	        System.out.println("HashMap of ages: " + ages);
	    }
	}


