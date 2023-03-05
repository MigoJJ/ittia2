package je.panse.doro.singlebeam.i2datafiles.ittia2info;


/**
 * ITTIA2 - A program for reading a text file and prompting the user for a numeric value.
 * 
 * This program reads the contents of a text file and displays it in the console.
 * It then prompts the user to input a numeric value and prints the value to the console.
 * 
 * Usage:
 *   java ITTIA2 [filename]
 * 
 * Arguments:
 *   [filename]: The name of the file to read. If not specified, the program reads "example.txt".
 * 
 * Output:
 *   The program displays the contents of the file in the console, one line at a time.
 *   It then prompts the user to input a numeric value. If the user enters a valid numeric value,
 *   the program displays the value in the console. Otherwise, it displays an error message.
 * 
 * Error Handling:
 *   If the file cannot be opened or read, the program displays an error message and terminates.
 *   If the user enters an invalid numeric value, the program displays an error message and terminates.
 * 
 * Example Usage:
 *   java ITTIA2
 *   java ITTIA2 input.txt
 * 
 * Author: [Your Name]
 * Date: [Current Date]
 * Version: 1.0
 */
 
 // Import statements
 import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.Scanner;
 
 public class ITTIA2 {
     
     public static void main(String[] args) {
         
         // Prologue
         System.out.println("ITTIA2 - A program for reading a text file and prompting the user for a numeric value.");
         System.out.println();
         
         // Check if the filename argument was provided
         String filename = "example.txt";
         if (args.length > 0) {
             filename = args[0];
         }
         System.out.println("Reading file: " + filename);
         
         // Open the file and create a BufferedReader object
         BufferedReader reader = null;
         try {
             reader = new BufferedReader(new FileReader(filename));
         } catch (IOException e) {
             System.err.println("Error: could not open file " + filename);
             System.exit(1);
         }
         
         // Read the file line by line and print to console
         String line;
         try {
             while ((line = reader.readLine()) != null) {
                 System.out.println(line);
             }
         } catch (IOException e) {
             System.err.println("Error: could not read file " + filename);
             System.exit(1);
         } finally {
             // Close the BufferedReader
             try {
                 reader.close();
             } catch (IOException e) {
                 System.err.println("Error: could not close file " + filename);
                 System.exit(1);
             }
         }
         
         // Prompt the user for a numeric value and print to console
         System.out.println();
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a numeric value: ");
         if (scanner.hasNextDouble()) {
             double value = scanner.nextDouble();
             System.out.println("You entered: " + value);
         } else {
             System.err.println("Error: invalid input");
             System.exit(1);
         }
         scanner.close();
         
         // Epilogue
         System.out.println();
         System.out.println("Program completed successfully.");
     }
     
 }
