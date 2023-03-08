package je.panse.doro.samsara.i2toolkit.exercise;

import javax.swing.*;
import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleFrame2 extends JFrame {
    public ExampleFrame2() {
        setTitle("GDS EMR Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1800, 1600/12*9);
        setLocationRelativeTo(null);

        JPanel panel1 = createPanel("CCPIROS");
        JPanel panel2 = createPanel("PMHSUJOBJ");
        JPanel panel3 = createPanel("ASSPLAN");
        JPanel panel4 = createPanel("OTHER");

        setLayout(new GridLayout(2, 2));
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
               
        setVisible(true);
    }

    private JPanel createPanel(String panelName) {
			JPanel panel = new JPanel(new BorderLayout());
//			panel.setBorder(BorderFactory.createTitledBorder(panelName));
			
			JLabel label = new JLabel(panelName);
			panel.add(label, BorderLayout.NORTH);

			JTextField textField = new JTextField(20);
			JTextArea textArea = new JTextArea(20, 9);
			JScrollPane scrollPane = new JScrollPane(textArea);
			String returnedStr= ReturnPages.mainEnter();

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

			Font font = new Font("Consolas", Font.PLAIN, 16);
				textField.setFont(font);
				textArea.setFont(font);
				panel.setFont(font);
				label.setFont(font); 
			panel.add(textField, BorderLayout.CENTER);
			panel.add(scrollPane, BorderLayout.SOUTH);
        return panel;
    }

    public static void main(String[] args) {
        new ExampleFrame2();
    }
}
