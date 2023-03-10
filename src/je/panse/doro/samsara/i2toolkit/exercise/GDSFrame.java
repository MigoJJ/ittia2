package je.panse.doro.samsara.i2toolkit.exercise;

import javax.swing.*;
import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GDSFrame extends JFrame {
    public GDSFrame() {
    	 setTitle("GDS EMR Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1800, 1800/12*9);
        setLocationRelativeTo(null);
        setLayout(null);

        JPanel panel1 = createPanel("CCPIROS");
        JPanel panel2 = createPanel("PMHSUJOBJ");
        JPanel panel3 = createPanel("ASSPLAN");
        JPanel panel4 = createPanel("OTHER");
        
//        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        setLayout(new GridLayout(2, 2));
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
               
        setVisible(true);
    }

    private JPanel createPanel(String panelName) {
			JPanel panel = new JPanel(new BorderLayout());
//			panel.setBorder(BorderFactory.createTitledBorder(panelName));
			
			JLabel label = new JLabel(panelName);
			panel.add(label, BorderLayout.NORTH);

			JTextField textField = new JTextField(20);
			textField.setText("This is a text :   ");
			textField.setBackground(Color.orange);
			JTextArea textArea = new JTextArea(30, 20);
			JScrollPane scrollPane = new JScrollPane(textArea);

			String returnedStr="";
			if (panelName == "CCPIROS") {
				returnedStr= ReturnPages.mainEnter();
			}else if (panelName == "PMHSUJOBJ") {
				returnedStr= ReturnPages.emrSOAP();
			}else {
			}
			textArea.setBackground(new Color(255, 255, 204));
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setEditable(false);
			textArea.append(returnedStr);
			
			textField.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
//			    	textArea.setText("");
						String getT = textField.getText();
						textArea.append(getT +"\n");
					textArea.append(panelName +">    " + textField.getText() + "\n");
					textArea.setCaretPosition(textArea.getDocument().getLength());
					textField.setText(textField.getText());
					textField.setText("");
			    }
			});

			Font font = new Font("Consolas", Font.PLAIN, 12);
			textField.setFont(font);
			textArea.setFont(font);
			panel.setFont(font);
			label.setFont(font);

	        JPanel panel5 = new JPanel();
	        for (int i = 1; i <= 9; i++) {
	            JButton button = new JButton("Button " + i);
	            panel5.add(button);
	        }
	       panel.add(panel5, "North");

	       
			panel.add(textField, BorderLayout.CENTER);
			panel.add(scrollPane, BorderLayout.SOUTH);
        return panel;
    }

    public static void main(String[] args) {
        new GDSFrame();
    }
}
