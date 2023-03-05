package je.panse.doro.samsara.i2dirandfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class DirectoryCopy {

    public static void main(String dirorigin, String dirtarget) throws IOException {
        String originalDir = dirorigin;
        String otherDir = dirtarget;

        // Get the name of the original directory
        String dirName = new File(originalDir).getName();

        // Delete all files and subdirectories in the original directory
        File[] files = new File(originalDir).listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                deleteDirectory(file);
            } else {
                file.delete();
            }
        }

        // Copy all files from the other directory to the original directory
        File[] otherFiles = new File(otherDir).listFiles();
        for (File otherFile : otherFiles) {
            File newFile = new File(originalDir + "/" + otherFile.getName());
            Files.copy(otherFile.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    // Helper method to recursively delete a directory and all its contents
    private static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        directory.delete();
    }
}
