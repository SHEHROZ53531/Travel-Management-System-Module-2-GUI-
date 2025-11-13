package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
    JButton login,singup,password;
    JTextField tfusername ;
    JPasswordField tfpassword;
    
    Login(){
        
        setSize(900,400);
        setLocation(350,200);
        setLayout(null); 
        getContentPane().setBackground(Color.WHITE);
        
        // Panel p1 (Image Panel)
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);
        
        // Image/Logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p1.add(image);
        
        // Panel p2 (Form Panel)
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 2, 550, 400);
        add(p2);
        
        // Username, Password Labels and Fields
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60,30,100,25);
        lblusername.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60,110,100,25);
        lblpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        // Buttons: Event Handling is active
        login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(new Color(133, 193, 233));
        login.setForeground(Color.WHITE);
        login.setBorder(BorderFactory.createEmptyBorder());
        login.addActionListener(this); // Event Handler Attached
        p2.add(login);
        
        singup = new JButton("Signup");
        singup.setBounds(230, 200, 130, 30);
        singup.setBackground(new Color(133, 193, 233));
        singup.setForeground(Color.WHITE);
        singup.setBorder(BorderFactory.createEmptyBorder());
        singup.addActionListener(this); // Event Handler Attached
        p2.add(singup);
        
        password = new JButton("Forget Password");
        password.setBounds(130, 250, 130, 30);
        password.setBackground(new Color(133, 193, 233));
        password.setForeground(Color.WHITE);
        password.setBorder(BorderFactory.createEmptyBorder());
        password.addActionListener(this); // Event Handler Attached
        p2.add(password);
        
        // Copyright and Trouble Label
        JLabel copyright = new JLabel(" Copyright © 2025 (Shahroz) All rights reserved.");
        copyright.setBounds(60, 290, 300, 20);
        copyright.setFont(new Font("SAN_SERIF", Font.PLAIN, 11));
        copyright.setForeground(Color.GRAY);
        p2.add(copyright);
        
        JLabel text = new JLabel("Trouble in Login.........");
        text.setBounds(300,250,150,20);
        text.setForeground(Color.RED);
        p2.add(text);
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== login){
            // --- LOGIN LOGIC: Database code REMOVED. ---
            String username = tfusername.getText();
            
            setVisible(false);
            
            // --- FINAL FIX: Calling Loading Screen ---
            // Loading screen will handle the thread and automatically open the Dashboard.
            new Loading(username); 
            
        }else if (ae.getSource()== singup){
            setVisible(false);
            new Signup(); // <--- Requires Signup.java
            
        }else if(ae.getSource()== password){
            setVisible(false);
            new ForgetPassword(); // <--- Requires ForgetPassword.java
        }
    }
    
    public static void main(String[] args){
        new Login();
   } 
}