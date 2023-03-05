package je.panse.doro.samsara.i2toolkit.hito;

import javax.swing.*;

public class ThyroidChecklist extends JFrame {

    public ThyroidChecklist() {
        setTitle("Thyroid Physical Examination Check List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        String[] items = {"Inspection of the neck", "Palpation of the thyroid gland", "Lymph node examination",
                "Vital signs", "Skin changes", "Hair and nail changes", "Ocular examination",
                "Neurological examination", "Cardiovascular examination", "Respiratory examination"};

        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(50, 50, 300, 30);
        add(comboBox);

        JLabel label = new JLabel("Enter 'y' for each item completed:");
        label.setBounds(50, 100, 300, 30);
        add(label);

        JButton button = new JButton("Calculate");
        button.setBounds(150, 200, 100, 30);
        add(button);

        button.addActionListener(e -> {
            String selected = (String) comboBox.getSelectedItem();
            char result = JOptionPane.showInputDialog(this, selected).charAt(0);
            JOptionPane.showMessageDialog(this, selected + ": " + result);
        });

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ThyroidChecklist();
    }

}
