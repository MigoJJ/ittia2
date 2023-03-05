package je.panse.doro.samsara.i2toolkit.datamanage;

import java.io.*;
import java.util.*;

public class TextFileProcessor {
    
    // Method to read a text file line by line
    public static ArrayList<String> readLinesFromFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return lines;
    }
    
    // Method to remove empty lines from an ArrayList
    public static ArrayList<String> removeEmptyLines(ArrayList<String> lines) {
        ArrayList<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!line.isEmpty()) {
                result.add(line);
            }
        }
        return result;
    }
    
    // Method to remove duplicate lines from an ArrayList
    public static ArrayList<String> removeDuplicateLines(ArrayList<String> lines) {
        Set<String> set = new LinkedHashSet<>(lines);
        return new ArrayList<>(set);
    }
    
    // Method to open a file in gedit
    public static void openFileInGedit(String fileName) {
        try {
            Runtime.getRuntime().exec("gedit " + fileName);
        } catch (IOException e) {
            System.out.println("Error opening file in gedit: " + e.getMessage());
        }
    }
    
    // Test the methods
    public static void main(String[] args) {
        // Read lines from file
        ArrayList<String> lines = readLinesFromFile("example.txt");
        System.out.println("Lines read from file: " + lines);
        
        // Remove empty lines
        ArrayList<String> nonEmptyLines = removeEmptyLines(lines);
        System.out.println("Non-empty lines: " + nonEmptyLines);
        
        // Remove duplicate lines
        ArrayList<String> uniqueLines = removeDuplicateLines(nonEmptyLines);
        System.out.println("Unique lines: " + uniqueLines);
        
        // Write unique lines to file
        try (PrintWriter pw = new PrintWriter(new FileWriter("unique_lines.txt"))) {
            for (String line : uniqueLines) {
                pw.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Open file in gedit
        openFileInGedit("unique_lines.txt");
    }
}
