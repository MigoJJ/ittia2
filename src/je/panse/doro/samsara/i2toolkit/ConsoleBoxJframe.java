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

	        JScrollPane scrollPane = new JScrollPane(consoleTextArea);

	        inputTextField = new JTextField();
	        inputTextField.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                consoleTextArea.append(">    " + inputTextField.getText() + "\n");
	                inputTextField.setText("");
	            }
	        });

	        add(scrollPane, BorderLayout.CENTER);
	        add(inputTextField, BorderLayout.SOUTH);

	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	    	ConsoleBoxJframe consoleBox = new ConsoleBoxJframe();
	    }
	}
