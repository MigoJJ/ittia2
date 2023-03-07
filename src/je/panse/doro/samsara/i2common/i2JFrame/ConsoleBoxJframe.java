package je.panse.doro.samsara.i2common.i2JFrame;

import javax.swing.*;
import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;
import java.awt.*;
import java.awt.event.*;

	public class ConsoleBoxJframe extends JFrame {

	    private JTextArea consoleTextArea;
	    private JTextField inputTextField;

	    public ConsoleBoxJframe(String args) {
			super("Console Box Example");
			
			consoleTextArea = new JTextArea();
			consoleTextArea.setEditable(false);
			
			String returnedStr= ReturnPages.startPageText();
			consoleTextArea.append(returnedStr);
			
			JScrollPane scrollPane = new JScrollPane(consoleTextArea);
			
			inputTextField = new JTextField("test :>>>");
			
			inputTextField.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        consoleTextArea.append(">    " + inputTextField.getText() + "\n");
			        inputTextField.setText("");
			    }
			});

	        add(scrollPane, BorderLayout.CENTER);
	        add(inputTextField, BorderLayout.SOUTH);

	        setSize(600, 600/12*9);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }

	    public static void main(String args) {
	    	ConsoleBoxJframe consoleBox = new ConsoleBoxJframe(args);
	    }
	}
