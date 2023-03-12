package je.panse.doro.samsara.i2frame;

import javax.swing.*;	
import java.awt.*;
	
	public class ConsoleBoxJframe extends JFrame {
		private JFrame f =new JFrame();
		private JTextField inputTextField =new JTextField();
		private JTextArea consoleTextArea = new JTextArea();
		private JPanel panel = new JPanel();
		private JLabel label = new JLabel("Enter data:>>> ");
		private JScrollPane scrollPane = new JScrollPane(consoleTextArea);
		private Font font = new Font("Consolas", Font.PLAIN, 16);
	
	public ConsoleBoxJframe(String args) {
		f.setTitle("GDS EMR Interface");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1800, 1600/12*9);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		 
		JPanel panel1 = createPanel("CCPIROS");
		JPanel panel2 = createPanel("PMHSUJOBJ");
		JPanel panel3 = createPanel("ASSPLAN");
		JPanel panel4 = createPanel("OTHER");
		
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
       
       JPanel panel5 = new JPanel();
		   for (int i = 1; i <= 9; i++) {
		       JButton button = new JButton("Button " + i);
		       panel5.add(button);
		   }
       panel.add(panel5, "North");

		label = new JLabel(panelName);
		panel.add(label);
		
		inputTextField =new JTextField();
		inputTextField.setText("This is a text :   ");
		inputTextField.setBackground(Color.orange);
		inputTextField.setPreferredSize(new Dimension(60,160));
		panel.add(inputTextField);
       panel.add(Box.createRigidArea(new Dimension(0, 20)));
		
		consoleTextArea = new JTextArea(30, 20);
		JScrollPane scrollPane = new JScrollPane(consoleTextArea);
		consoleTextArea.setBackground(new Color(255, 255, 204));
		consoleTextArea.setLineWrap(true);
		consoleTextArea.setWrapStyleWord(true);
		consoleTextArea.setEditable(true);
//		consoleTextArea.append(returnedStr);
		panel.add(consoleTextArea);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		inputTextField.setFont(font);
		consoleTextArea.setFont(font);
		label.setFont(font);
		
		return panel;
    }
	
		public static void main(String args) {
			ConsoleBoxJframe consoleBox = new ConsoleBoxJframe(args);
		}

	}
