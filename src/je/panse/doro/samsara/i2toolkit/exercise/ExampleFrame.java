package je.panse.doro.samsara.i2toolkit.exercise;

import javax.swing.*;

import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleFrame extends JFrame {

    public ExampleFrame() {
        setTitle("Example JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1800, 1600/12*9);

        JPanel panel1 = createPanel("Panel 1 starting");
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
			//        panel.add(label, BorderLayout.NORTH);
			
			JTextField textField = new JTextField(20);
			JTextArea textArea = new JTextArea(28, 9);
			JScrollPane scrollPane = new JScrollPane(textArea);
			String returnedStr= ReturnPages.startPageText();

			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setEditable(false);
			textArea.append(returnedStr);
			textField.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        textArea.append(">    " + textField.getText() + "\n");
			    textArea.setCaretPosition(textArea.getDocument().getLength());
			    textField.setText("");
			    }
			});
			panel.add(textField, BorderLayout.CENTER);
			panel.add(scrollPane, BorderLayout.SOUTH);
        return panel;
    }

    public static void main(String[] args) {
        new ExampleFrame();
    }
}
