package je.panse.doro.samsara.i2dirandfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileReadInput {

    public static void main(String[] args) {
        String filename = "example.txt";
        BufferedReader reader = null;

        try {
            // Open the file and create a BufferedReader object
            reader = new BufferedReader(new FileReader(filename));

            // Read the file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            // Close the BufferedReader if it was opened successfully
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing file: " + e.getMessage());
                }
            }
        }

        // Prompt the user to input a numeric value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        if (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            System.out.println("You entered: " + value);
        } else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }

}
