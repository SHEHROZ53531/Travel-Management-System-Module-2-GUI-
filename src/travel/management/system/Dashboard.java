package travel.management.system;

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
    
    String username; 

    public Dashboard(String username) {
        this.username = username;
        
        setTitle("Travel and Tourism Management System - Dashboard");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // **Main Frame Layout: Border Layout**
        setLayout(new BorderLayout(0, 0)); // No gaps

        // --- 1. NORTH PANEL (Header Panel: Dashboard text/icon) ---
        JPanel headerPanel = createHeaderPanel();
        add(headerPanel, BorderLayout.NORTH);

        // --- 2. WEST PANEL (Menu/Sidebar Panel) ---
        JPanel menuPanel = createMenuPanel();
        
        // --- 3. CENTER PANEL (Main Content Area) ---
        // We use a new panel to hold the image and the main heading panel
        JPanel mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new BorderLayout());

        // --- 3a. IMAGE PANEL (Center's Center) ---
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new BorderLayout());

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        imagePanel.add(image, BorderLayout.CENTER);
        
        // --- 3b. HEADING PANEL (Placed OVER the Image Panel using BorderLayout.NORTH) ---
        // This simulates your old white panel at the top of the main content area.
        JPanel headingPanel = new JPanel();
        headingPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        headingPanel.setBackground(Color.WHITE); 
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setForeground(new Color(0, 0, 102)); // Dark Blue
        text.setFont(new Font("Raleway", Font.BOLD, 45)); // Made BOLD and larger
        headingPanel.add(text);

        // Add the image panel and the heading panel to the mainContentPanel
        mainContentPanel.add(headingPanel, BorderLayout.NORTH);
        mainContentPanel.add(imagePanel, BorderLayout.CENTER);

        // Add the menu and the main content panel to the Frame
        add(menuPanel, BorderLayout.WEST);
        add(mainContentPanel, BorderLayout.CENTER); 

        setVisible(true);
    }
    
    // Helper method to create the Header Panel
    private JPanel createHeaderPanel() {
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 0, 102));
        p1.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10)); 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
        JLabel icon = new JLabel(new ImageIcon(i2));
        p1.add(icon);

        JLabel l1 = new JLabel("Dashboard");
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setForeground(Color.WHITE);
        p1.add(l1);
        return p1;
    }

    // Helper method to create the Menu Panel (uses GridLayout)
    private JPanel createMenuPanel() {
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(0, 0, 102));
        
        // MODULE 2: APPLY GRIDLAYOUT for Menu Buttons
        p2.setLayout(new GridLayout(buttonLabels.length + 2, 1, 0, 10)); 
        p2.setPreferredSize(new Dimension(250, 700)); 

        int buttonIndex = 0;
        for (int i = 0; i < buttonLabels.length; i++) {
            String label = buttonLabels[i];
            
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

    // --- WEEK 2 FUNCTIONALITY: ACTIONPERFORMED (ACTIVE) ---
    @Override
    public void actionPerformed(ActionEvent ae) {
        String clickedLabel = ((JButton) ae.getSource()).getText();
        
        if(clickedLabel.equals("Add Details")) { 
            new AddCustomer(username);
        }
        else if(clickedLabel.equals("View Details"))
        {
            new ViewCustomer(username);
        }
        else if(clickedLabel.equals("Update Details"))
        {
            new UpdateCustomer(username);
        }
        else if(clickedLabel.equals("Check Package")) 
        {
            new CheckPackage();
        }
        else if(clickedLabel.equals("Book Package"))
        {
            new BookPackage(username);
        }
        else if(clickedLabel.equals("View Package"))
        {
            new ViewPackage(username);
        }
        else if(clickedLabel.equals("View Hotels"))
        {
            new CheckHotels();
        }
        else if(clickedLabel.equals("Destinations"))
        {
            new Destinations();
        }
        else if(clickedLabel.equals("Book Hotel"))
        {
            new BookHotel(username);
        }
        else if(clickedLabel.equals("View Booked Hotel"))
        {
            new ViewBookedHotel(username);
        }
        else if(clickedLabel.equals("Payments"))
        {
            new Payment();
        }
        else if(clickedLabel.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            } 
        }
        else if(clickedLabel.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(clickedLabel.equals("About")){
            new About();
        }
        else if(clickedLabel.equals("Delete Details")){
            new DeleteDetails(username);
        }
    }
    
    public static void main(String[] args) {
        new Dashboard("TestUser"); 
    }
}