package je.panse.doro.samsara.i2toolkit.exercise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InsertButtons extends GDSFrame{

    public static void main(String[] args) {
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Button " + i);
            panel5.add(button);
        }

        for (int i = 10; i <= 18; i++) {
            JButton button = new JButton("Button " + i);
            panel6.add(button);
        }
        
        frame.add(panel5, "North");
        frame.add(panel6, "South");
        
    }
}
