package je.panse.doro.samsara.i2toolkit;

import java.io.*;

public class TextFileHandler {
    
    // Method to read a text file and display its contents in the console
    public static void readTextFile(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Method to write a line of text to a specific text file
    public static void writeLineToFile(String filePath, String line) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(line);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Method to append the contents of one text file to another
    public static void appendTextFile(String sourceFilePath, String destinationFilePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath, true));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Method to open a text file with gedit
    public static void openWithGedit(String filePath) {
        try {
            ProcessBuilder builder = new ProcessBuilder("gedit", filePath);
            builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        String filePath = "/path/to/text/file.txt";
        String line = "This is a new line of text";
        String sourceFilePath = "/path/to/source/text/file.txt";
        String destinationFilePath = "/path/to/destination/text/file.txt";
        
        // Read a text file and display its contents in the console
        TextFileHandler.readTextFile(filePath);
        
        // Write a line of text to a specific text file
        TextFileHandler.writeLineToFile(filePath, line);
        
        // Append the contents of one text file to another
        TextFileHandler.appendTextFile(sourceFilePath, destinationFilePath);
        
        // Open a text file with gedit
        TextFileHandler.openWithGedit(filePath);
    }

    
}
