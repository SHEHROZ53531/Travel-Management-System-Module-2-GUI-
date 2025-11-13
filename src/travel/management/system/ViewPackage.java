package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ViewPackage extends JFrame implements ActionListener{
    JButton back;
    
    ViewPackage(String username){
        // frame of this class
        setBounds(450,200,900,450);
        setLocationRelativeTo(null); 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Haeding or label of this frame
        JLabel text = new JLabel("VIEW PACKAGE DETAILS");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,300,30);
        add(text);
        
        // --- GUI Components Setup (Retained for structure) ---
        
        // for username
        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        // in which name will filled (Dummy Data)
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setText(username);
        add(labelusername);
        
        // for package
        JLabel lblpackage = new JLabel("Package");
        lblpackage.setBounds(30,90,150,25);
        add(lblpackage);
        
        // in which package will filled (Dummy Data)
        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220,90,150,25);
        labelpackage.setText("Gold Package"); 
        add(labelpackage);
        
        // for Total Persons
        JLabel lblnumber = new JLabel("Total Persons");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        // in which persons will filled (Dummy Data)
        JLabel labelpersons = new JLabel();
        labelpersons .setBounds(220,130,150,25);
        labelpersons.setText("2");
        add(labelpersons );
        
        // for id
        JLabel lblname = new JLabel("ID Type");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        // in which id will filled (Dummy Data)
        JLabel labelid = new JLabel();
        labelid .setBounds(220,170,150,25);
        labelid.setText("Passport");
        add(labelid );
        
        // for id number
        JLabel lblgender = new JLabel("ID Number");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        // in which id number will filled (Dummy Data)
        JLabel labelnumber = new JLabel();
        labelnumber .setBounds(220,210,150,25);
        labelnumber.setText("A1234567");
        add(labelnumber );
        
        // for Phone number
        JLabel lblcountry = new JLabel("Phone");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        // in which phone number will filled (Dummy Data)
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220,250,150,25);
        labelphone.setText("0300-1234567");
        add(labelphone);
        
        // for price
        JLabel lbladdress = new JLabel("Price");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        // in which price will filled (Dummy Data)
        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,290,150,25);
        labelprice.setText("Rs 24000");
        add(labelprice);
        
        
       
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.setBounds(130,360,100,25);
        back.addActionListener(this); // Event Handler Attached
        add(back);
        
        
        // image in down of frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 20, 500, 400);
        add(image);
        
        
        
        
        setVisible(true); 
    }
    
    
    public void actionPerformed(ActionEvent ae){
        // Back button functionality
        setVisible(false);
    }
    
    public static void main(String[]args){
        
        new ViewPackage("shahroz");
        
    }
}