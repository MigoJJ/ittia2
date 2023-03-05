package je.panse.doro.samsara.i2common.i2JFrame;

import javax.swing.*;
import je.panse.doro.samsara.i2toolkit.GeditOpenFile;
import je.panse.doro.singlebeam.i2launcher.Entrypoint;

import java.awt.*;
import java.awt.event.*;

public class i2JFrameMain extends JFrame {

	public static final String TITLE = "ITTIA2 Project";
	public static final int WIDTH = 1600;
	public static final int HEIGHT = 1200;

	public enum ButtonLabel {
        BUTTON_1("Prologue") {
            @Override
            void onClick() {
                System.out.println("Button 1 clicked");
                GeditOpenFile.main(Entrypoint.I2DATAFILES + "/ittia2info/i2Prologue");
            }
        },
        BUTTON_2("Version Information") {
            @Override
            void onClick() {
                System.out.println("Button 2 clicked");
                GeditOpenFile.main(Entrypoint.I2DATAFILES + "/ittia2info/i2VersionInfo");
            }
        },
        BUTTON_3("Button 3") {
            @Override
            void onClick() {
                System.out.println("Button 3 clicked");
            }
        },
        BUTTON_4("Button 4") {
            @Override
            void onClick() {
                System.out.println("Button 4 clicked");
            }
        },
        BUTTON_5("Button 5") {
            @Override
            void onClick() {
                System.out.println("Button 5 clicked");
            }
        };

		public String label;

        ButtonLabel(String label) {
            this.label = label;
        }

        abstract void onClick();

        public String getLabel() {
            return label;
        }
    }

	public JTextField textField;

    public i2JFrameMain() {
        super(TITLE);
        setSize(WIDTH, HEIGHT);
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
//        JPanel buttonPanel = new JPanel(new GridLayout(1, 5, 10, 0));
        JPanel buttonPanel = new JPanel(new GridLayout(5, 1, 0, 10));
        for (ButtonLabel button : ButtonLabel.values()) {
            JButton jButton = new JButton(button.getLabel());
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    button.onClick();
                }
            });
            buttonPanel.add(jButton);
        }
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 30));

        // Layout components
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(buttonPanel);
        panel.add(textField);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new i2JFrameMain();
    }
}
