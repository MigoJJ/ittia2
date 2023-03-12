package je.panse.doro.samsara.i2toolkit.exercise;


import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import je.panse.doro.samsara.i2frame.consoleTextArea.ReturnAreaForm;

public class ConsoleBoxJframe extends JFrame {
    public JFrame f = new JFrame();
    public JTextField inputTextField = new JTextField();
    public JTextArea consoleTextArea = new JTextArea();
    public JPanel panel = new JPanel();
    public JLabel label = new JLabel("Enter data:>>> ");
    public Font font = new Font("Consolas", Font.PLAIN, 12);

    public ConsoleBoxJframe(String args) {
        f.setTitle("GDS EMR Interface");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200, 1200 / 12 * 9);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        JPanel panel1 = createPanel("CCPIROS");
        inputTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consoleTextArea.append(">    " + inputTextField.getText() + "\n");
                consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
                inputTextField.setText("");
            }
        });
        panel1.add(inputTextField);

        JPanel panel2 = createPanel("PMHSUJOBJ");
        inputTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consoleTextArea.append(">    " + inputTextField.getText() + "\n");
                consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
                inputTextField.setText("");
            }
        });
        panel2.add(inputTextField);

        JPanel panel3 = createPanel("ASSESSPLAN");
        inputTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consoleTextArea.append(">    " + inputTextField.getText() + "\n");
                consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
                inputTextField.setText("");
            }
        });
        panel3.add(inputTextField);

        JPanel panel4 = createPanel("OTHER");
        inputTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consoleTextArea.append(">    " + inputTextField.getText() + "\n");
                consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
                inputTextField.setText("");
            }
        });
        panel4.add(inputTextField);

        f.setLayout(new GridLayout(2, 2));
        f.add(panel1);
        f.add(panel2);
        f.add(panel3);
        f.add(panel4);
        f.setVisible(true);
    }

    public JPanel createPanel(String panelName) {
		panel = new JPanel(new FlowLayout());
       panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       getContentPane().add(panel, BorderLayout.NORTH);
       
       JPanel panel5 = new JPanel();
		   for (int i = 1; i <= 9; i++) {
		       JButton button = new JButton("Button " + i);
		       button.setFont(font);
		       panel5.add(button);
		   }

		label = new JLabel(panelName);
			label.setFont(font);
		
			inputTextField =new JTextField(panelName);
			inputTextField.setFont(font);
			inputTextField.setText("");
			inputTextField.setBackground(Color.orange);
			inputTextField.setPreferredSize(new Dimension(30,60));
			
			inputTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consoleTextArea.append(">    " + inputTextField.getText() + "\n");
				consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
				inputTextField.setText("");
			    }
			});
						
			consoleTextArea = new JTextArea();
			consoleTextArea.setPreferredSize(new Dimension(600, 1400)); 
			consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());						
			consoleTextArea.setFont(font);
			consoleTextArea.setBackground(new Color(255, 255, 204));
			consoleTextArea.setLineWrap(true);
			consoleTextArea.setWrapStyleWord(true);
			consoleTextArea.setEditable(true);
				String returnList = ReturnAreaForm.returnList(panelName);
			consoleTextArea.append(returnList);
			

			panel.add(label);
			panel.add(panel5, "North");
			panel.add(inputTextField);
			panel.add(new JScrollPane(consoleTextArea));
			
			
			
		return panel;
    }
	
		public static void main(String args) {
			ConsoleBoxJframe consoleBox = new ConsoleBoxJframe(args);
		}

	}
