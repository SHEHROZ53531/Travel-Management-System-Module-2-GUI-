package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // For Event Handling

// Implement ActionListener for button clicks
public class CheckPackage extends JFrame implements ActionListener { 
    
    // Store the username, needed for new BookPackage(username)
    String username; 
    
    CheckPackage(){
        // Using a dummy username as this constructor doesn't receive one
        this("TestUser"); 
    }
    
    // Updated constructor to accept username (best practice)
    CheckPackage(String username){
        this.username = username;
        
        setBounds(450,200,900,600);
        setLocationRelativeTo(null); 
        
        String[] package1 = {"GOLD PACKAGE","6 Days and 7 Nights","Airport Assestance","Half day city Tour","Daily Buffet","Soft Drinks Free","Full Day 3 Island Cruise","Englis Speaking Guid","BOOK PACKAGE","SUMMER SPECIAL","Rs 12000/-","package1.jpg"};
        String[] package2 = {"SILVER PACKAGE","5 Days and 6 Nights","Toll Free", "Entrance Free Tickets","Meet and Greet at Airport","Free arrival Drinks","Night Safari","Cruise with Dinner","BOOK NOW","WINTER SPECIAL","Rs 24000/-","package2.jpg"};
        String[] package3 = {"BRONZE PACKAGE","4 Days and 5 Nights","Return Airfare","Free Clubing, Horse Riding & other Games","Hard Drinks Free","River Rafting","Daily Buffet","BBQ Dinner","BOOK NOW","WINTER SPECIAL","Rs 32000/-","package3.jpg"};
        
        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);
        add(tab);
        
        setVisible(true);
    }
    
    // Method for creating each package panel
    public JPanel createPackage(String[]pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        // l1 (Package Name)
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setForeground(new Color(0, 102, 204));
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(l1);
        
        // l2 to l8 (Features)
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30,60,300,30);
        l2.setForeground(new Color(51, 51, 51));
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30,110,300,30);
        l3.setForeground(new Color(0, 153, 153));
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30,160,300,30);
        l4.setForeground(new Color(51, 51, 51));
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30,210,300,30);
        l5.setForeground(new Color(0, 153, 153));
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30,260,300,30);
        l6.setForeground(new Color(51, 51, 51));
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30,310,300,30);
        l7.setForeground(new Color(0, 153, 153));
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30,360,300,30);
        l8.setForeground(new Color(51, 51, 51));
        l8.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l8);
        
        // --- WEEK 2 CHANGE: BOOK PACKAGE LABEL TO BUTTON ---
        JButton bBook = new JButton(pack[8]); // pack[8] is "BOOK PACKAGE" or "BOOK NOW"
        bBook.setBounds(60,430,250,30); // Changed bounds and size for button
        bBook.setBackground(new Color(0, 153, 153));
        bBook.setForeground(Color.WHITE);
        bBook.setFont(new Font("Tahoma",Font.BOLD,20));
        bBook.addActionListener(this); // Attach Event Handler
        // Set the action command to the package name for easy identification in actionPerformed
        bBook.setActionCommand(pack[0]); 
        p1.add(bBook);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(80,480,300,30);
        l10.setForeground(new Color(51, 51, 51));
        l10.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(500,480,300,30);
        l11.setForeground(new Color(255, 102, 0));
        l11.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l11);
        
        // Image on Right
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350, 20, 500, 300);
        p1.add(l12);
        
        return p1;
    }
    
    // --- WEEK 2: Event Handler ---
    @Override
    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        if (command.contains("PACKAGE")) {
            // new BookPackage(username); // Requires BookPackage.java
            JOptionPane.showMessageDialog(this, "Proceeding to book " + command + " (Functionality disabled for Week 2)");
            // setVisible(false); // Close current window
        } else {
             setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new CheckPackage();
    }
}