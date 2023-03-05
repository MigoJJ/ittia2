package je.panse.doro.singlebeam.i2launcher;

import java.io.*;

public class ChartPlateWriter {

    public static void main(String[] args) {
    	String eS = Entrypoint.I2DATAFILES;
    	
        // Create a File object representing the file to be deleted
        File fileToDelete = new File(eS + "/chartplate/Chartplate");
        
        // Attempt to delete the file
        boolean success = fileToDelete.delete();
        
        if (success) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File deletion failed.");
        }
    	
    	
    	
        // Define the directory containing the text files
        File directory = new File(eS + "/chartplate/");
        
        // Define the file extension to filter by
//        String fileExtension = ".txt";
        String fileExtension = "";
        // Get a list of all the text files in the directory
        File[] files = directory.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(fileExtension);
            }
        });
        
        // Create an array to hold the contents of the text files
        String[] contents = new String[files.length];
        
        // Read the contents of each text file into the array
        for (int i = 0; i < files.length; i++) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(files[i]));
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                
                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                
                contents[i] = sb.toString();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // Write the contents of the array to a ChartPlate file
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(eS + "/chartplate/ChartPlate"));
            
            for (int i = 0; i < contents.length; i++) {
                bw.write(contents[i]);
                bw.newLine();
            }
            
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("ChartPlate file written successfully!");
    }

}
