package string;

public class SringExample {
	    public static void main(String[] args) {
	        // Create a string
	        String str = "Hello, world!";
	        
	        // Concatenate two strings
	        String newStr = str + " Welcome to Java programming.";
	        System.out.println(newStr);
	        
	        // Get the length of a string
	        int strLength = str.length();
	        System.out.println("Length of the string is " + strLength);
	        
	        // Convert a string to uppercase
	        String upperStr = str.toUpperCase();
	        System.out.println("Uppercase string is " + upperStr);
	        
	        // Create a StringBuffer
	        StringBuffer buffer = new StringBuffer();
	        
	        // Append strings to the buffer
	        buffer.append("This is ");
	        buffer.append("a string buffer. ");
	        buffer.append("It can be used to ");
	        buffer.append("modify strings efficiently.");
	        
	        // Get the string from the buffer
	        String bufferStr = buffer.toString();
	        System.out.println(bufferStr);
	        
	        // Create a StringBuilder
	        StringBuilder builder = new StringBuilder();
	        
	        // Append strings to the builder
	        builder.append("This is ");
	        builder.append("a string builder. ");
	        builder.append("It can be used to ");
	        builder.append("modify strings efficiently.");
	        
	        // Get the string from the builder
	        String builderStr = builder.toString();
	        System.out.println(builderStr);
	    }
	}


