package je.panse.doro.samsara.i2toolkit.exercise;

import javax.swing.*;
import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleFrame extends JFrame {
    public ExampleFrame() {
        setTitle("GDS EMR Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 1200/12*9);
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
			textField.setBackground(Color.orange);
			textField.setText("This is a text :   ");
			JTextArea textArea = new JTextArea(20, 9);
			JScrollPane scrollPane = new JScrollPane(textArea);

			String returnedStr="";
			if (panelName == "CCPIROS") {
				returnedStr= ReturnPages.mainEnter();
			}else if (panelName == "PMHSUJOBJ") {
				returnedStr= ReturnPages.emrSOAP();
			}else {
			}
			
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setEditable(false);
			textArea.append(returnedStr);
			
			textField.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
//					textArea.setText("");
						String getT = textField.getText();
						textArea.append(getT +"\n");
					textArea.append(panelName +">    " + textField.getText() + "\n");
					textArea.setCaretPosition(textArea.getDocument().getLength());
					textField.setText(textField.getText());
					textField.setText("");
			    }
			});

			Font font = new Font("Consolas", Font.PLAIN, 12);
				textField.setFont(font);
				textArea.setFont(font);
				panel.setFont(font);
				label.setFont(font); 
			panel.add(textField, BorderLayout.CENTER);
			panel.add(scrollPane, BorderLayout.SOUTH);
        return panel;
    }

    public static void main(String[] args) {
        new ExampleFrame();
    }
}
