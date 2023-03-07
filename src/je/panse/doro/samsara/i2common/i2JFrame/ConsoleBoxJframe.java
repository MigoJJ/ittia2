package je.panse.doro.samsara.i2common.i2JFrame;

import javax.swing.*;	
import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;
import java.awt.*;
import java.awt.event.*;

	public class ConsoleBoxJframe extends JFrame {
	    private JTextArea consoleTextArea = new JTextArea();
	    private JTextField inputTextField =new JTextField(20);
	    private JPanel panel = new JPanel();
	    private JLabel label = new JLabel("Enter data:>>> ");
	    private JScrollPane scrollPane = new JScrollPane(consoleTextArea);
	    
	    public ConsoleBoxJframe(String args) {
			super("Console Box Example");
			Font font = new Font("Consolas", Font.PLAIN, 16);
			inputTextField.setFont(font);
			consoleTextArea.setFont(font);
		    panel.setFont(font);
			label.setFont(font); // set font for JLabel
			
			consoleTextArea.setEditable(false);
			String returnedStr= ReturnPages.startPageText();
			consoleTextArea.append(returnedStr);

			inputTextField.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
					consoleTextArea.append(">    " + inputTextField.getText() + "\n");
					consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
					inputTextField.setText("");
			    }
			});
			
			panel.add(label);
			panel.add(inputTextField);
			add(panel, BorderLayout.SOUTH);
			add(scrollPane, BorderLayout.CENTER);
			
			setSize(600, 600/12*9);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	    }

	    public static void main(String args) {
	    	ConsoleBoxJframe consoleBox = new ConsoleBoxJframe(args);
	    }
	}
