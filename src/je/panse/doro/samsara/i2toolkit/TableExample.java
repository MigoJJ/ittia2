package je.panse.doro.samsara.i2toolkit;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class TableExample extends JFrame {
    
    private JTable table;
    
    public TableExample() {
        // Create the table model
        DefaultTableModel model = new DefaultTableModel(10, 10);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                model.setValueAt("Cell " + i + "," + j, i, j);
            }
        }
        
        // Create the table and add it to a scroll pane
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        // Add a mouse listener to the table to get the selected cell
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                int col = table.getSelectedColumn();
                Object value = table.getValueAt(row, col);
                System.out.println("Selected cell: " + value);
            }
        });
        
        // Set the size and show the frame
        setSize(500, 500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new TableExample();
    }
}
