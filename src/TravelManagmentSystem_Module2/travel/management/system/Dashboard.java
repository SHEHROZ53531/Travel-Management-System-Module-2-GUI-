package TravelManagmentSystem_Module2.travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    
    // All buttons defined here
    JButton[] menuButtons = new JButton[15]; 
    String[] buttonLabels = {
        "Add Details", "View Details", "Update Details", "Check Package", 
        "Book Package", "View Package", "View Hotels", "Book Hotel", 
        "View Booked Hotel", "Destinations", "Payments", "Calculator", 
        "Notepad", "About", "Delete Details"
    };

    public Dashboard() {
        setTitle("Travel and Tourism Management System - Dashboard");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // **MODULE 2: APPLY BORDERLAYOUT to the main frame**
        setLayout(new BorderLayout(10, 10)); // 10px gaps for better look

        // --- 1. NORTH PANEL (Header) ---
        JPanel headerPanel = createHeaderPanel();
        add(headerPanel, BorderLayout.NORTH);

        // --- 2. WEST PANEL (Menu/Sidebar) ---
        JPanel menuPanel = createMenuPanel();
        add(menuPanel, BorderLayout.WEST);

        // --- 3. CENTER PANEL (Main Content Area) ---
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.LIGHT_GRAY);
        contentPanel.setLayout(new GridBagLayout()); // Using GridBagLayout to center text
        contentPanel.add(new JLabel("<html><h1 style='color: #000066;'>Welcome to the Management System</h1><p>Select an option from the left menu.</p></html>"));
        add(contentPanel, BorderLayout.CENTER);

        setVisible(true);
    }
    
    private JPanel createHeaderPanel() {
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 0, 102));
        p1.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10)); // FlowLayout
        
        JLabel l1 = new JLabel("Management Dashboard");
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setForeground(Color.WHITE);
        p1.add(l1);
        return p1;
    }

    private JPanel createMenuPanel() {
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(0, 0, 102));
        
        // **MODULE 2: APPLY GRIDLAYOUT for Menu Buttons**
        p2.setLayout(new GridLayout(buttonLabels.length + 2, 1, 0, 10)); // Rows = Buttons + separators
        p2.setPreferredSize(new Dimension(250, 700)); // Fixed width for sidebar

        int buttonIndex = 0;
        for (int i = 0; i < buttonLabels.length; i++) {
            String label = buttonLabels[i];
            
            // Add Separator for visual grouping (like after Update Details)
            if (label.equals("Check Package") || label.equals("Calculator")) {
                 p2.add(new JSeparator());
            }

            JButton button = new JButton(label);
            button.setBackground(new Color(0, 0, 102));
            button.setForeground(Color.WHITE);
            button.setFont(new Font("Tahoma", Font.PLAIN, 18));
            button.setMargin(new Insets(0, 0, 0, 0));
            button.addActionListener(this);
            p2.add(button);
            menuButtons[buttonIndex++] = button;
        }

        return p2;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Functionality: NOT IMPLEMENTED YET (Will be added in later weeks)
        JButton clicked = (JButton) ae.getSource();
        JOptionPane.showMessageDialog(this, clicked.getText() + " feature is coming soon!");
    }

    public static void main(String[] args) {
        new Dashboard(); 
    }
}