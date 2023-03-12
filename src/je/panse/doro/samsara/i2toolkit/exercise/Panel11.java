package je.panse.doro.samsara.i2toolkit.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;

public class Panel11 extends JFrame {
	public static JPanel main(String args) {
		JTextArea consoleTextArea = new JTextArea();
//		JScrollPane scrollPane = new JScrollPane(consoleTextArea);
		JTextField inputTextField =new JTextField(30);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter data:>>> ");
		Font font = new Font("Consolas", Font.PLAIN, 16);
		panel.setFont(font);
		label.setFont(font); 
	    
		try {
			Panel11 consoleBox = new Panel11();

			consoleTextArea.setFont(font);
			consoleTextArea.setBackground(Color.PINK);
			consoleTextArea.setLayout(new BoxLayout(consoleTextArea,BoxLayout.Y_AXIS));
			consoleTextArea.setPreferredSize(new Dimension(800,800/12*9));
			consoleTextArea.setEditable(false);
			String returnedStr= ReturnPages.mainEnter();
			consoleTextArea.append(returnedStr);
			
			inputTextField.setFont(font);
			inputTextField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					consoleTextArea.append(">    " + inputTextField.getText() + "\n");
					consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
					inputTextField.setText("");
				    }
				});
			panel.add(label);
			panel.add(inputTextField);
			panel.add(consoleTextArea);
			panel.add(new JScrollPane(consoleBox));


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panel;
	}
}