package je.panse.doro.samsara.i2frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import je.panse.doro.singlebeam.i2datafilescombobox.ReturnPages;

public class PanelReturn extends ConsoleBoxJframe{

	public PanelReturn(String args) {
		super(args);
		// TODO Auto-generated constructor stub
	}

	public JPanel createPanel(String panelName) {
	
	JPanel panel = new JPanel(new BorderLayout());
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
//	    	textArea.setText("");
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
}