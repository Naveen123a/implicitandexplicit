package maps;
import java.util.HashMap;
import java.util.Map;

	public class MapExample {
	    public static void main(String[] args) {
	        // Create a HashMap to store the populations of countries
	        Map<String, Integer> populations = new HashMap<>();
	        
	        // Add some entries to the map
	        populations.put("China", 1439323776);
	        populations.put("India", 1380004385);
	        populations.put("United States", 331002651);
	        populations.put("Indonesia", 273523615);
	        populations.put("Pakistan", 220892340);
	        
	        // Get the population of a specific country
	        int chinaPopulation = populations.get("China");
	        System.out.println("The population of China is " + chinaPopulation);
	        
	        // Check if a country is in the map
	        boolean isIndiaInMap = populations.containsKey("India");
	        System.out.println("Is India in the map? " + isIndiaInMap);
	        
	        // Iterate over the keys in the map
	        System.out.println("List of countries in the map:");
	        for (String country : populations.keySet()) {
	            System.out.println(country);
	        }
	        
	        // Iterate over the values in the map
	        System.out.println("List of populations in the map:");
	        for (int population : populations.values()) {
	            System.out.println(population);
	        }
	        
	        // Remove an entry from the map
	        populations.remove("United States");
	        System.out.println("Removed United States from the map.");
	    }
	}

