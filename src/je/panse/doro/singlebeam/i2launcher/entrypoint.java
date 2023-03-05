package je.panse.doro.singlebeam.i2launcher;

public class entrypoint {

    // Base directory
    private static final String BASE_DIR = "/je/panse/doro/";
        // Directory shortcuts
    private static final String ITTIA2_DIR = BASE_DIR + "ittia2/";
    private static final String FOURGATE_DIR = ITTIA2_DIR + "fourgate/";
    private static final String SAMSARA_DIR = ITTIA2_DIR + "samsara/";
    private static final String SINGLEBEAM_DIR = ITTIA2_DIR + "singlebeam/";
    private static final String DATAFILES_DIR = SINGLEBEAM_DIR + "i2datafiles/";
    
    // Package shortcuts
    private static final String I2COMMON_PKG = "je.panse.doro.ittia2.samsara.i2common.";
    private static final String I2DIRANDFILE_PKG = "je.panse.doro.ittia2.samsara.i2dirandfile.";
    private static final String I2TOOLKIT_PKG = "je.panse.doro.ittia2.samsara.i2toolkit.";
    private static final String I2UTIL_PKG = "je.panse.doro.ittia2.samsara.i2util.";
    private static final String I2BACKUP_PKG = "je.panse.doro.ittia2.singlebeam.i2backup.";
    private static final String I2LAUNCHER_PKG = "je.panse.doro.ittia2.singlebeam.i2launcher.";
    private static final String I2RESCUE_PKG = "je.panse.doro.ittia2.singlebeam.i2rescue.";
    
    public static void main(String[] args) {
        
        // Use shortcut strings
        String file = DATAFILES_DIR + "example.txt";
        String commonClass = I2COMMON_PKG + "Common";
        String dirAndFileClass = I2DIRANDFILE_PKG + "DirAndFile";
        String toolkitClass = I2TOOLKIT_PKG + "Toolkit";
        String utilClass = I2UTIL_PKG + "Util";
        String backupClass = I2BACKUP_PKG + "Backup";
        String launcherClass = I2LAUNCHER_PKG + "Launcher";
        String rescueClass = I2RESCUE_PKG + "Rescue";
        
        // Do something with the shortcut strings
        System.out.println("Reading file: " + file);
        System.out.println("Using common class: " + commonClass);
        System.out.println("Using dirAndFile class: " + dirAndFileClass);
        System.out.println("Using toolkit class: " + toolkitClass);
        System.out.println("Using util class: " + utilClass);
        System.out.println("Using backup class: " + backupClass);
        System.out.println("Using launcher class: " + launcherClass);
        System.out.println("Using rescue class: " + rescueClass);
        
    }
    
}
