package je.panse.doro.samsara.i2common.i2JFrame;

import javax.swing.*;
import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;
import java.awt.*;
import java.awt.event.*;

	public class ConsoleBoxJframe extends JFrame {
	    private JTextArea consoleTextArea;
	    private JTextField inputTextField;
	    private JPanel panel;
	    private JLabel label;
	    
	    public ConsoleBoxJframe(String args) {
			super("Console Box Example");
			
			consoleTextArea = new JTextArea();
			consoleTextArea.setEditable(false);
			
			String returnedStr= ReturnPages.startPageText();
			consoleTextArea.append(returnedStr);
			
			JScrollPane scrollPane = new JScrollPane(consoleTextArea);
			inputTextField = new JTextField(20);

			inputTextField.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        consoleTextArea.append(">    " + inputTextField.getText() + "\n");
			        inputTextField.setText("");
			    }
			});

	        Font font = new Font("Arial", Font.BOLD, 18);
	        inputTextField.setFont(font);
	        consoleTextArea.setFont(font);
	        
			panel = new JPanel();
			label = new JLabel("Enter data:>>>");
			panel.add(label);
			panel.add(inputTextField);

			add(panel, BorderLayout.SOUTH);
//	        add(inputTextField, BorderLayout.SOUTH);
	        add(scrollPane, BorderLayout.CENTER);
	        setSize(600, 600/12*9);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }

	    public static void main(String args) {
	    	ConsoleBoxJframe consoleBox = new ConsoleBoxJframe(args);
	    }
	}
