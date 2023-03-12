package je.panse.doro.samsara.i2toolkit.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class ScrollablePanelsExample extends JFrame {
	public JFrame f =new JFrame();
	public JTextField inputTextField =new JTextField();
	public JTextArea consoleTextArea = new JTextArea();
	public JPanel panel = new JPanel();
	public JLabel label = new JLabel("Enter data:>>> ");
	public Font font = new Font("Consolas", Font.PLAIN, 12);
	
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame();
	        frame.setTitle("GDS EMR Interface");
	        frame.setSize(600, 600/12*9);
	        frame.setLocationRelativeTo(null);
//	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        

	        JPanel panel1 = new JPanel();
	        panel1.add(new JLabel("Panel 1"));
	        JScrollPane scrollPane1 = new JScrollPane(panel1);
	        
			 panel1 = new JPanel(new FlowLayout());
	        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
	        getContentPane().add(panel1, BorderLayout.NORTH);
	        

	        JPanel panel2 = new JPanel();
	        panel2.add(new JLabel("Panel 2"));
	        JScrollPane scrollPane2 = new JScrollPane(panel2);

	        JPanel panel3 = new JPanel();
	        panel3.add(new JLabel("Panel 3"));
	        JScrollPane scrollPane3 = new JScrollPane(panel3);

	        JPanel panel4 = new JPanel();
	        panel4.add(new JLabel("Panel 4"));
	        JScrollPane scrollPane4 = new JScrollPane(panel4);

	        JPanel mainPanel = new JPanel();
	        mainPanel.setLayout(new GridLayout(2, 2));
	        mainPanel.add(scrollPane1);
	        mainPanel.add(scrollPane2);
	        mainPanel.add(scrollPane3);
	        mainPanel.add(scrollPane4);

	        frame.getContentPane().add(mainPanel);
	        frame.setVisible(true);
	    }
	}



