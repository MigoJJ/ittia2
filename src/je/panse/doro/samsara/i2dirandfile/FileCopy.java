package je.panse.doro.samsara.i2dirandfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopy {
    public static void main(String filesource, String filedest) {
    	
    	
        File source = new File(filesource);
        File dest = new File(filedest);
        
        try {
            Files.copy(source.toPath(), dest.toPath());
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
