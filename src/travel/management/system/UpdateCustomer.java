package travel.management.system;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class UpdateCustomer extends JFrame implements ActionListener{
    // Global Decalaration
    JLabel labelusername, labelname;
    JTextField tfnumber, tfcountry, tfaddress , tfemail, tfphone, tfid, tfgender;
    JButton update, back; // Renamed 'add' to 'update' for clarity
    
    // Constructor
    UpdateCustomer(String username){
                
        setBounds(500,200,850,550);
        setLocationRelativeTo(null); 
        setLayout(null); // Retained for original GUI design
        getContentPane().setBackground(Color.WHITE);
        
        // Heading of this frame
        JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,0,300,25);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);
        
        
        
        // label for username
        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        // for answer that we will fetch from database
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setText(username); // Set username directly since we skip DB fetching
        add(labelusername);
        
        // label for id
        JLabel lblid = new JLabel("Id");
        lblid .setBounds(30,90,150,25);
        add(lblid );
        
        // text field for id
        tfid = new JTextField();
        tfid.setBounds(220,90,150,25);
        tfid.setText("NID-12345"); // Dummy data
        add( tfid);
        
        // now want number for upper id's
        JLabel lblnumber = new JLabel("Number");
        lblnumber .setBounds(30,130,150,25);
        add(lblnumber );
        
        // text field for number
        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        tfnumber.setText("0000"); // Dummy data
        add(tfnumber);
        
        // label for name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220,170,150,25);
        labelname.setText("Default Name"); // Dummy name
        add(labelname);
        
        // label for gender
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        // text field for gender
        tfgender = new JTextField();
        tfgender.setBounds(220,210,150,25);
        tfgender.setText("Male"); // Dummy data
        add(tfgender);
        
        // label for country
        JLabel lblcountry = new JLabel("Country");
        lblcountry .setBounds(30,250,150,25);
        add(lblcountry );
        
        // text field for country
        tfcountry = new JTextField();
        tfcountry.setBounds(220,250,150,25);
        tfcountry.setText("Pakistan"); // Dummy data
        add(tfcountry);
        
        // label for address
        JLabel lbladdress = new JLabel("Address");
        lbladdress .setBounds(30,290,150,25);
        add(lbladdress );
        
        // text field for address
        tfaddress = new JTextField();
        tfaddress.setBounds(220,290,150,25);
        tfaddress.setText("H#123"); // Dummy data
        add(tfaddress);
        
        // label for phone number
        JLabel lblphone = new JLabel("Phone");
        lblphone .setBounds(30,330,150,25);
        add(lblphone );
        
        // text field for phone nuumber
        tfphone = new JTextField();
        tfphone.setBounds(220,330,150,25);
        tfphone.setText("0300"); // Dummy data
        add(tfphone);
        
        // label for email
        JLabel lblemail = new JLabel("Email");
        lblemail .setBounds(30,370,150,25);
        add(lblemail );
        
        // text field for address
        tfemail = new JTextField();
        tfemail.setBounds(220,370,150,25);
        tfemail.setText("test@example.com"); // Dummy data
        add( tfemail);
        
        
        
        // Creating Update button (Renamed from 'add')
        update = new JButton("Update");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(70,430,100,25);
        update.addActionListener(this); // Event Handler Attached
        add(update);
        
        // Creating back button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        // Image on right side of frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 100, 450, 350);
        add(image);
        
 
        setVisible(true);
    }
    
    // --- Event Handler: actionPerformed (Event-Driven Programming) ---
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== update){ // Handle Update button
            // --- DATA COLLECTION LOGIC (Retained) ---
            String username = labelusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            // ... (Other fields collected) ...
            
           
            // Temporary Success Message for Week 2
            JOptionPane.showMessageDialog(null, "Customer details Updated successfully (Database skipped for Week 2).");
            setVisible(false);
            
        } else if(ae.getSource()== back){ // Handle Back button
            setVisible(false);
        }
    }
    
    public static void main(String[]args){
        new UpdateCustomer("Shahroz");
    }
}