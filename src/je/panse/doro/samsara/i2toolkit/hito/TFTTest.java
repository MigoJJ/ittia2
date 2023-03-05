package je.panse.doro.samsara.i2toolkit.hito;

import java.util.Scanner;

public class TFTTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define normal ranges for TFT test results
        double t3Low = 0.97;
        double t3High = 1.69;
        double t4Low = 5.53;
        double t4High = 11.0;
        double tshLow = 0.465;
        double tshHigh = 4.68;
        
        // Prompt user to enter TFT test results
        System.out.print("Enter T3 test result in ng/mL: ");
        double t3 = scanner.nextDouble();
        System.out.print("Enter T4 test result in μg/dL: ");
        double t4 = scanner.nextDouble();
        System.out.print("Enter TSH test result in mIU/L: ");
        double tsh = scanner.nextDouble();
        
        // Check if TFT test results are within normal ranges
        boolean t3Normal = t3 >= t3Low && t3 <= t3High;
        boolean t4Normal = t4 >= t4Low && t4 <= t4High;
        boolean tshNormal = tsh >= tshLow && tsh <= tshHigh;
        
        // Print results to console
        System.out.println("The normal range of TFT for an average adult is mentioned below: ");
        System.out.println("The normal range of T3 - Triiodothyronine is between " + t3Low + " - " + t3High + " ng/mL");
        System.out.println("The normal range of T4 - Thyroxine is between " + t4Low + " - " + t4High + " μg/dL");
        System.out.println("The normal range of TSH - Thyroid stimulating hormone is between " + tshLow + " - " + tshHigh + " mIU/L");
        System.out.println();
        System.out.println("Your test results are:");
        System.out.println("T3: " + t3 + " ng/mL (normal: " + (t3Normal ? "yes" : "no") + ")");
        System.out.println("T4: " + t4 + " μg/dL (normal: " + (t4Normal ? "yes" : "no") + ")");
        System.out.println("TSH: " + tsh + " mIU/L (normal: " + (tshNormal ? "yes" : "no") + ")");
    }
}
