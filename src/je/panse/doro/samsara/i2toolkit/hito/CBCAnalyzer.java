package je.panse.doro.samsara.i2toolkit.hito;


import java.util.Scanner;

public class CBCAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input WBC count
        System.out.print("Enter white blood cell count (cells/mcL): ");
        double wbcCount = scanner.nextDouble();
        if (wbcCount < 4500 || wbcCount > 11000) {
            System.out.println("WARNING: White blood cell count is abnormal!");
        }
        
        // Input Hemoglobin level
        System.out.print("Enter hemoglobin level (gm/dL): ");
        double hemoglobin = scanner.nextDouble();
        boolean isMale = false;
        System.out.print("Is the patient male (y/n)? ");
        String gender = scanner.next();
        if (gender.equalsIgnoreCase("y")) {
            isMale = true;
        }
        if ((isMale && (hemoglobin < 14 || hemoglobin > 17.5)) ||
            (!isMale && (hemoglobin < 12.3 || hemoglobin > 15.3))) {
            System.out.println("WARNING: Hemoglobin level is abnormal!");
        }
        
        // Input platelet count
        System.out.print("Enter platelet count (platelets/mcL): ");
        double plateletCount = scanner.nextDouble();
        if (plateletCount < 150000 || plateletCount > 450000) {
            System.out.println("WARNING: Platelet count is abnormal!");
        }
        
        System.out.println("CBC analysis complete.");
    }
}
