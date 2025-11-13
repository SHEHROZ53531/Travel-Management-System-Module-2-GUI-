package travel.management.system;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;


public class Signup extends JFrame implements ActionListener{ 
    JButton create , back;
    JTextField tfname, tfusername, tfanswer;
    JPasswordField tfpassword;
    Choice security;
    
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // creating a panel (Left Blue Panel)
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);
        
     
        
        // Username
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(50,20,125,25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(190, 20, 180, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        // Name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50,60,125,25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(190, 60, 180, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        // Password
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(50,100,125,25);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword .setBounds(190, 100, 180, 25);
        tfpassword .setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword );
        
        // Security Question Label
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setBounds(50,140,125,25);
        lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(lblsecurity);
        
       
        
        // Choice for Security Questions (Dropdown)
        security = new Choice();
        security.add("Your Last Name");
        security.add("Your Partner Name");
        security.add("Your Lucky Number");
        security.add("Your childhood Superhero");
        security.setBounds(190,140,180,25);
        p1.add(security);
        
        // Answer
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(50,180,125,25);
        lblanswer.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(lblanswer);
        
        tfanswer = new JTextField();
        tfanswer .setBounds(190, 180, 180, 25);
        tfanswer .setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer );
        
        // --- Buttons (Event Handlers Attached) ---
        
        // Create Button
        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133, 193,233));
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this); // Event Handler Attached
        p1.add(create);
        
        // Back Button
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133, 193,233));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(250,250,100,30);
        back.addActionListener(this); // Event Handler Attached
        p1.add(back);
        
        // Image on Right
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 100, 250, 250);
        add(image);
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== create){
            // Data collection (Retained)
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();
            
            
            
            // Temporary Success Message for Week 2
            JOptionPane.showMessageDialog(null, "Account Creation Success! (Database skipped for Week 2)");
            setVisible(false);
            new Login(); // Navigate to Login Screen
            
        }else if (ae.getSource()== back){
            // Back button functionality
            setVisible(false);
            new Login(); // Navigate to Login Screen
        }
    }
    
    public static void main(String[]args){
        
        new Signup();  // signup class object
        
        
    }
}