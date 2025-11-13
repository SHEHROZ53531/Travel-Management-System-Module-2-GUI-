package travel.management.system;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class DeleteDetails extends JFrame implements ActionListener{
    JButton deleteButton; // Renamed 'back' to 'deleteButton' for clarity
    String username;
    
    DeleteDetails(String username){
        this.username=username;
        // frame of this class
        setBounds(450,180,870,625);
        setLocationRelativeTo(null); 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); // Retained for original GUI design
        
       
        
        // for username
        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        // in which name will filled (Dummy Data)
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setText(username); // Using the passed username
        add(labelusername);
        
        // for id
        JLabel lblid = new JLabel("ID Type");
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
        // in which id will filled (Dummy Data)
        JLabel labelid = new JLabel();
        labelid.setBounds(220,110,150,25);
        labelid.setText("National ID Card"); 
        add(labelid);
        
        // for number
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        add(lblnumber);
        
        // in which number will filled (Dummy Data)
        JLabel labelnumber = new JLabel();
        labelnumber .setBounds(220,170,150,25);
        labelnumber.setText("123456789");
        add(labelnumber );
        
        // for name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
        // in which name will filled (Dummy Data)
        JLabel labelname = new JLabel();
        labelname .setBounds(220,230,150,25);
        labelname.setText("Shahroz Ali");
        add(labelname );
        
        // for gender
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
        // in which gender will filled (Dummy Data)
        JLabel labelgender = new JLabel();
        labelgender .setBounds(220,290,150,25);
        labelgender.setText("Male");
        add(labelgender );
        
        // for country
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(500,50,150,25);
        add(lblcountry);
        
        // in which country will filled (Dummy Data)
        JLabel labelcountry = new JLabel();
        labelcountry .setBounds(690,50,150,25);
        labelcountry.setText("Pakistan");
        add(labelcountry);
        
        // for address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(500,110,150,25);
        add(lbladdress);
        
        // in which address will filled (Dummy Data)
        JLabel labeladdress = new JLabel();
        labeladdress .setBounds(690,110,150,25);
        labeladdress.setText("H#123 Street");
        add(labeladdress);
        
        
        // for phone number
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(500,170,150,25);
        add(lblphone);
        
        // in which phone number will filled (Dummy Data)
        JLabel labelphone = new JLabel();
        labelphone .setBounds(690,170,150,25);
        labelphone.setText("0300-1234567");
        add(labelphone);
        
        // for email
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        add(lblemail);
        
        // in which email will filled (Dummy Data)
        JLabel labelemail = new JLabel();
        labelemail .setBounds(690,230,150,25);
        labelemail.setText("shahroz@example.com");
        add(labelemail);
        
        
        // --- Delete Button (Event Handler Attached) ---
        deleteButton = new JButton("Delete");
        deleteButton.setBackground(Color.black);
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setBounds(350,350,100,25);
        deleteButton.addActionListener(this); // Event Handler Attached
        add(deleteButton);
        
        
        // image in down of frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, 400, 600, 200);
        add(image);
        
        // duplicate the same image
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(600, 400, 600, 200);
        add(image2);
        
        
        
        
        setVisible(true); 
    }
    
    // --- Event Handler: actionPerformed (Event-Driven Programming) ---
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deleteButton){
           
            // Temporary Action for Week 2
            JOptionPane.showMessageDialog(null, "User Account and Data Deleted Suessfully (Database skipped for Week 2).");
            System.exit(0); // Exit the application, simulating final deletion
        }
    }
    
    public static void main(String[]args){
        
        new DeleteDetails("shahroz");
        
    }
}