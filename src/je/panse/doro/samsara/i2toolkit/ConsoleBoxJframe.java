package je.panse.doro.samsara.i2toolkit;

	import javax.swing.*;	
	import java.awt.*;
	import java.awt.event.*;

	public class ConsoleBoxJframe extends JFrame {
	    private JTextArea consoleTextArea;
	    private JTextField inputTextField;

		public ConsoleBoxJframe() {
			super("Console Box Example");
			consoleTextArea = new JTextArea();
			consoleTextArea.setEditable(false);
			consoleTextArea.setFont(new Font("Arial", Font.PLAIN,16));
			consoleTextArea.setLineWrap(true);
			JScrollPane scrollPane = new JScrollPane(consoleTextArea);
		
			inputTextField = new JTextField();
			inputTextField.setFont(new Font("Arial", Font.PLAIN,16));
			
			inputTextField.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        consoleTextArea.append(">    " + inputTextField.getText() + "\n");
			    	  System.out.println("inputTextField.getText()" +inputTextField.getText());
			        inputTextField.setText("");
			    }
			});
			
			add(scrollPane, BorderLayout.CENTER);
			add(inputTextField, BorderLayout.SOUTH);
			setSize(600, 450);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}


	    public static void main(String[] args) {
	    	ConsoleBoxJframe consoleBox = new ConsoleBoxJframe();
	    }
	}
