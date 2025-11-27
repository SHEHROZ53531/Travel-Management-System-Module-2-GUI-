package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    JButton pay , back;
    Payment(){
        
        setBounds(500,200,800,600);
       setLocationRelativeTo(null);  //  to place in center of window
       setLayout(null);
       
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.png"));
      Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0, 0, 800, 600);
      add(image);
      
      
      // now we add pay button and back button
      
      // Now we add pay button and back button
        pay = new JButton("Pay");
        pay.setBounds(320, 500, 150, 50); // Centered and larger size
        pay.addActionListener(this);
        pay.setBackground(Color.BLACK); 
        pay.setForeground(Color.WHITE); 
        pay.setFont(new Font("Arial", Font.BOLD, 16)); 
        pay.setBorderPainted(false); // Remove border
        pay.setFocusPainted(false); // Remove focus outline
        image.add(pay);
        
        
       back = new JButton("Back");
       back.setBounds(480, 500, 150, 50); // Centered and larger size
       back.addActionListener(this);
       back.setBackground(new Color(255, 87, 34)); 
       back.setForeground(Color.WHITE); 
       back.setFont(new Font("Arial", Font.BOLD, 16)); 
       back.setBorderPainted(false); // Remove border
       back.setFocusPainted(false); // Remove focus outline
        image.add(back);
      
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==pay){
            setVisible(false);
            new Pay();
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[]args){
        new Payment();
    }
}