package je.panse.doro.samsara.i2toolkit.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleFrame extends JFrame {

    public ExampleFrame() {
        setTitle("Example JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JPanel panel1 = createPanel("Panel 1");
        JPanel panel2 = createPanel("Panel 2");
        JPanel panel3 = createPanel("Panel 3");
        JPanel panel4 = createPanel("Panel 4");

        setLayout(new GridLayout(2, 2));
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        setVisible(true);
    }

    private JPanel createPanel(String panelName) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(panelName));

        JLabel label = new JLabel(panelName);
        panel.add(label, BorderLayout.NORTH);

        JTextField textField = new JTextField(20);
        panel.add(textField, BorderLayout.CENTER);
        Dimension textFieldSize = textField.getPreferredSize();
        textFieldSize.height = 10;
        textField.setPreferredSize(textFieldSize);
        panel.add(textField, BorderLayout.CENTER);

        JTextArea textArea = new JTextArea(12, 9);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.SOUTH);
        
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(">    " + textField.getText() + "\n");
                textArea.setCaretPosition(textArea.getDocument().getLength());
                textField.setText("");
            }
        });

        return panel;
    }

    public static void main(String[] args) {
        new ExampleFrame();
    }
}
