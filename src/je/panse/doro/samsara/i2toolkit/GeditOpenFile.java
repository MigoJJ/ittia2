package je.panse.doro.samsara.i2toolkit;

import java.io.IOException;

public class GeditOpenFile {
	public static void geditOpenFile(String string) {
        try {
            // Open the file using the default text editor
        	 Process p = Runtime.getRuntime().exec("gedit " + string);
            
            // Wait for 12 seconds
            Thread.sleep( 5000);
            
            // Close the text editor
            p.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
