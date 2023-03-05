package je.panse.doro.samsara.i2toolkit.datamanage;
	import java.util.*;

	public class StringProcessor {
	    
	    enum LinePrefix {
	        SEMICOLON(";"),
	        BRACKET_RIGHT("]"),
	        ANGLE_RIGHT(">"),
	        ELLIPSIS("..."),
	        HASH("#");

	        private final String value;
	        
	        private LinePrefix(String value) {
	            this.value = value;
	        }
	        
	        public String getValue() {
	            return value;
	        }
	    }
	    
	    // Method to check if a string starts with a line prefix
	    public static boolean startsWithLinePrefix(String str) {
	        for (LinePrefix prefix : LinePrefix.values()) {
	            if (str.startsWith(prefix.getValue())) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    // Method to process a string and return a line string
	    public static String processString(String str) {
	        if (startsWithLinePrefix(str)) {
	            return str.substring(str.indexOf(" ") + 1);
	        } else {
	            return str;
	        }
	    }
	    
	    // Method to test the string processing methods
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String inputString;
	        
	        System.out.print("Enter a string: ");
	        inputString = scanner.nextLine();
	        
	        System.out.println("Input string: " + inputString);
	        if (startsWithLinePrefix(inputString)) {
	            System.out.println("String starts with line prefix");
	        } else {
	            System.out.println("String does not start with line prefix");
	        }
	        String outputString = processString(inputString);
	        System.out.println("Processed string: " + outputString);
	    }
	}
