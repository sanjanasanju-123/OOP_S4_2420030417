package strings;

public class StringMethods {

	public static void main(String[] args) {
		        String str = "  Hello World!  ";

		        System.out.println("Original String: '" + str + "'");
		        System.out.println("Length: " + str.length());
		        System.out.println("Trimmed: '" + str.trim() + "'");
		        System.out.println("Uppercase: " + str.toUpperCase());
		        System.out.println("Lowercase: " + str.toLowerCase());
		        System.out.println("Substring (6, 11): " + str.substring(6, 11));
		        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
		        System.out.println("Contains 'Hello': " + str.contains("Hello"));
		        System.out.println("Starts with '  Hello': " + str.startsWith("  Hello"));
		        System.out.println("Ends with 'World!  ': " + str.endsWith("World!  "));
		    }
		


	}


