package je.panse.doro.samsara.i2common.i2JFrame;

import javax.swing.*;	
import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;
import java.awt.*;
import java.awt.event.*;

	public class ConsoleBoxJframe extends JFrame {
		private JTextArea consoleTextArea = new JTextArea();
		private JScrollPane scrollPane = new JScrollPane(consoleTextArea);
		private JTextField inputTextField =new JTextField(20);
		private JPanel panel = new JPanel();
		private JLabel label = new JLabel("Enter data:>>> ");
		private Font font = new Font("Consolas", Font.PLAIN, 16);
	    
		public ConsoleBoxJframe(String args) {
			super("Console Box Example");
		
			inputTextField.setFont(font);
			consoleTextArea.setFont(font);
			panel.setFont(font);
			label.setFont(font); 
			
			consoleTextArea.setEditable(false);
			String returnedStr= ReturnPages.emrSOAP();
			consoleTextArea.append(returnedStr);
			
			inputTextField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					consoleTextArea.append("\t>    " + inputTextField.getText() + "\n");
					consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
					inputTextField.setText("");
				    }
				});
				
			panel.add(label);
			panel.add(inputTextField);
			add(panel, BorderLayout.SOUTH);
			panel.add(scrollPane, BorderLayout.CENTER);
			
			setSize(800, 600/12*9);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
		
		public static void main(String args) {
			ConsoleBoxJframe consoleBox = new ConsoleBoxJframe(args);
		}
	}
