package je.panse.doro.samsara.i2frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import je.panse.doro.samsara.i2frame.consoleTextArea.ReturnAreaForm;
	
public class ConsoleBoxJframe extends JFrame {
	public JFrame f =new JFrame();
	public JTextField inputTextField =new JTextField();
	public JTextArea consoleTextArea = new JTextArea();
	public JPanel panel = new JPanel();
	public JLabel label = new JLabel("Enter data:>>> ");
	public JScrollPane scrollPane = new JScrollPane(consoleTextArea);
	public Font font = new Font("Consolas", Font.PLAIN, 12);
		
	public ConsoleBoxJframe(String args) {
		f.setTitle("GDS EMR Interface");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1200, 1200/12*9);
		f.setLocationRelativeTo(null);
		f.setLayout(null);

		JPanel panel1 = createPanel("CCPIROS");
		JPanel panel2 = createPanel("PMHSUJOBJ");
		JPanel panel3 = createPanel("ASSESSPLAN");
		JPanel panel4 = createPanel("OTHER");
		
		f.setLayout(new GridLayout(2, 2));
		f.add(panel1);
		f.add(panel2);
		f.add(panel3);
		f.add(panel4);
		
		
		
	       scrollPane.setViewportView(panel1);
	       f.add(scrollPane);
		f.setVisible(true);
	}

	public JPanel createPanel(String panelName) {
		panel = new JPanel(new FlowLayout());
       panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       getContentPane().add(panel, BorderLayout.NORTH);
//       scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

       JScrollPane scrollPane = new JScrollPane();
       scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       // Add the panels to the scroll pane
       scrollPane.setViewportView(panel);
       
       // Add the scroll pane to the JFrame

       
       
       
       JPanel panel5 = new JPanel();
		   for (int i = 1; i <= 9; i++) {
		       JButton button = new JButton("Button " + i);
		       button.setFont(font);
		       panel5.add(button);
		   }
		   panel.add(panel5, "North");

		label = new JLabel(panelName);
			label.setFont(font);
			panel.add(label);
		
		inputTextField =new JTextField();
			inputTextField.setFont(font);
			inputTextField.setText("");
			inputTextField.setBackground(Color.orange);
			inputTextField.setPreferredSize(new Dimension(30,60));
			panel.add(inputTextField);
			
		consoleTextArea = new JTextArea(30, 30);
			JScrollPane scrollPane = new JScrollPane(consoleTextArea);
			consoleTextArea.setFont(font);
			consoleTextArea.setBackground(new Color(255, 255, 204));
			consoleTextArea.setLineWrap(true);
			consoleTextArea.setWrapStyleWord(true);
			consoleTextArea.setEditable(true);
				String returnList = ReturnAreaForm.returnList(panelName);
			consoleTextArea.append(returnList);


			panel.add(consoleTextArea);
			
			
			inputTextField.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
//			    	consoleTextArea.setText("");
						String getT = inputTextField.getText();
						System.out.println(getT);
						consoleTextArea.append(getT +"\n");
						consoleTextArea.append(panelName +">    " + getT + "\n");
						consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());						
						inputTextField.setText(getT);
						inputTextField.setText("");
						}
			});
		
		return panel;
    }
	
		public static void main(String args) {
			ConsoleBoxJframe consoleBox = new ConsoleBoxJframe(args);
		}

	}
