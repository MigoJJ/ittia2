package je.panse.doro.samsara.i2toolkit.datamanage;

import java.util.*;

public class TypeConverter {
    
    // Method to convert a String to a double
    public static double toDouble(String input) {
        double result = 0;
        try {
            result = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Error converting input to double.");
        }
        return result;
    }
    
    // Method to convert a String to an int
    public static int toInt(String input) {
        int result = 0;
        try {
            result = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error converting input to int.");
        }
        return result;
    }
    
    // Overloaded method to convert an array of Strings to an array of doubles
    public static double[] toDouble(String[] input) {
        double[] result = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = toDouble(input[i]);
        }
        return result;
    }
    
    // Overloaded method to convert an array of Strings to an array of ints
    public static int[] toInt(String[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = toInt(input[i]);
        }
        return result;
    }
    
    // Method to read lines of input from the console and add them to an ArrayList
    public static ArrayList<String> readLines() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        String line;
        do {
            line = scanner.nextLine();
            lines.add(line);
        } while (!line.isEmpty());
        return lines;
    }
    
    // Overloaded method to convert an ArrayList of Strings to an ArrayList of doubles
    public static ArrayList<Double> toDouble(ArrayList<String> input) {
        ArrayList<Double> result = new ArrayList<>();
        for (String str : input) {
            result.add(toDouble(str));
        }
        return result;
    }
    
    // Overloaded method to convert an ArrayList of Strings to an ArrayList of ints
    public static ArrayList<Integer> toInt(ArrayList<String> input) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String str : input) {
            result.add(toInt(str));
        }
        return result;
    }
    
    // Test the methods
    public static void main(String[] args) {
        // Test the toDouble and toInt methods
        String str1 = "3.14";
        String str2 = "42";
        System.out.println(toDouble(str1));
        System.out.println(toInt(str2));
        
        String[] strArray = {"3.14", "42", "hello"};
        System.out.println(Arrays.toString(toDouble(strArray)));
        System.out.println(Arrays.toString(toInt(strArray)));
        
        // Test the readLines, toDouble, and toInt methods
        System.out.println("Enter some lines of input (enter a blank line to stop):");
        ArrayList<String> lines = readLines();
        System.out.println("Lines entered: " + lines);
        
        ArrayList<Double> doubleList = toDouble(lines);
        System.out.println("Double list: " + doubleList);
        
        ArrayList<Integer> intList = toInt(lines);
        System.out.println("Integer list: " + intList);
    }
}
