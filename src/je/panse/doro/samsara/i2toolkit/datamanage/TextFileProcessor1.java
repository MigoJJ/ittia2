package je.panse.doro.samsara.i2toolkit.datamanage;

	import java.io.*;
	import java.util.*;

	public class TextFileProcessor1 {
	    
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
	    
	    // Method to replace a specified word in each line of a text file
	    public static void replaceWordInFile(String fileName, String searchWord, String replaceWord) {
	        ArrayList<String> lines = readLinesFromFile(fileName);
	        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
	            for (String line : lines) {
	                line = line.replace(searchWord, replaceWord);
	                pw.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }
	    }
	    
	    // Test the methods
	    public static void main(String[] args) {
	        // Read lines from file
	        ArrayList<String> lines = readLinesFromFile("example.txt");
	        System.out.println("Lines read from file: " + lines);
	        
	        // Replace word in file
	        replaceWordInFile("example.txt", "[   ]", "[12345]");
	        
	        // Read modified lines from file
	        ArrayList<String> modifiedLines = readLinesFromFile("example.txt");
	        System.out.println("Modified lines: " + modifiedLines);
	    }
	}
