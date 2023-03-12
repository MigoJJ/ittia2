package je.panse.doro.singlebeam.i2launcher;

import je.panse.doro.samsara.i2frame.i2JFrameMain;

public class Entrypoint {
		public static final String HOME_D = System.getProperty("user.dir");
		public static final String HOME_H = System.getProperty("user.home");
		public static final String HOME_DIR = HOME_D + "/src";
		//----Home Directory Branch
		public static final String JE_PANSE_DORO = HOME_DIR + "/je/panse/doro";
		public static final String FOURGATE = JE_PANSE_DORO + "/fourgate";
		public static final String SAMSARA = JE_PANSE_DORO + "/samsara";
		public static final String SINGLEBEAM = JE_PANSE_DORO + "/singlebeam";
		//----Singlebeam branch
		public static final String I2LAUNCHER = SINGLEBEAM + "/i2launcher";
		public static final String I2DATAFILES = SINGLEBEAM + "/i2datafiles";
		public static final String I2BACKUP = I2DATAFILES + "/backup";
		public static final String I2DATAFILESTXT = I2DATAFILES + "/i2datafilestxt";
		//----Samsara Directory Branch
		public static final String I2COMMON = SAMSARA + "/i2common";
		public static final String I2JFRAME = I2COMMON + "/i2JFrame";
		public static final String I2DIRANDFILE = SAMSARA + "/i2dirandfile";
		public static final String I2TOOLKIT = SAMSARA + "/i2toolkit";
		public static final String I2UTIL = SAMSARA + "/i2util";
		
    public static void main(String[] args) {
        System.out.println(HOME_D);
        System.out.println(HOME_H);
        i2JFrameMain.main("starting...migowj^^");
        
    }
    
}
