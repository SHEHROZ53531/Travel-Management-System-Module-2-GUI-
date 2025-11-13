package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    JButton pay , back;
    
    Payment(){
        
        setBounds(500,200,800,600);
        setLocationRelativeTo(null); 
        setLayout(null);
        
        // --- GUI Structure Setup ---
        
        // Background Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/pay.png"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        
        // Pay Button (Event Handler Attached)
        pay = new JButton("Pay");
        pay.setBounds(320, 500, 150, 50); 
        pay.addActionListener(this);
        pay.setBackground(Color.BLACK); 
        pay.setForeground(Color.WHITE); 
        pay.setFont(new Font("Arial", Font.BOLD, 16)); 
        pay.setBorderPainted(false); 
        pay.setFocusPainted(false); 
        image.add(pay);
        
        // Back Button (Event Handler Attached)
        back = new JButton("Back");
        back.setBounds(480, 500, 150, 50); 
        back.addActionListener(this);
        back.setBackground(new Color(255, 87, 34)); 
        back.setForeground(Color.WHITE); 
        back.setFont(new Font("Arial", Font.BOLD, 16)); 
        back.setBorderPainted(false); 
        back.setFocusPainted(false); 
        image.add(back);
        
        setVisible(true);
    }
    
    // --- Event Handler: actionPerformed (Event-Driven Programming) ---
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==pay){
            // Pay button calls the next screen (Pay.java)
            setVisible(false);
            new Pay(); // Requires Pay.java to be present
            
        }else if(ae.getSource()==back){
            // Back button simply closes this window
            setVisible(false);
        }
    }
    
    public static void main(String[]args){
        new Payment();
    }
}