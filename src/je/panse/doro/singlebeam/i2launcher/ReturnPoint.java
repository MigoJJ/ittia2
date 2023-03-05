package je.panse.doro.singlebeam.i2launcher;

import java.io.IOException;

import je.panse.doro.samsara.i2dirandfile.DirectoryCopy;

public class ReturnPoint {
	public static void copyDirFromTo(String fromdir, String todir) {
		String eS = Entrypoint.I2DATAFILES;
		
		try {
			DirectoryCopy.main(eS + fromdir, eS + todir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
