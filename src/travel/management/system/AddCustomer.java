package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddCustomer extends JFrame implements ActionListener{
    // Global Decalaration
    JLabel labelusername, labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress , tfemail, tfphone;
    JRadioButton rmale, rfemale;
    JButton add, back;
    
    // Constructor
    AddCustomer(String username){
                
        setBounds(450,200,850,550);
        setLocationRelativeTo(null); 
        setLayout(null); // Retained for original GUI design
        getContentPane().setBackground(Color.WHITE);
        
        
        
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
        
        // dropdown using JComboBox Class
        comboid = new JComboBox(new String[]{"Passport", "Driving License", "National ID Card", "Student ID Card"});
        comboid .setBounds(220,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        // number for upper id's
        JLabel lblnumber = new JLabel("Number");
        lblnumber .setBounds(30,130,150,25);
        add(lblnumber );
        
        // text field for number
        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        // label for name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220,170,150,25);
        labelname.setText("Default Name"); // Dummy name since we skip DB fetching
        add(labelname);
        
        // label for gender and radio buttons
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        // label for country and field
        JLabel lblcountry = new JLabel("Country");
        lblcountry .setBounds(30,250,150,25);
        add(lblcountry );
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);
        
        // label for address and field
        JLabel lbladdress = new JLabel("Address");
        lbladdress .setBounds(30,290,150,25);
        add(lbladdress );
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);
        
        // label for phone number and field
        JLabel lblphone = new JLabel("Phone");
        lblphone .setBounds(30,330,150,25);
        add(lblphone );
        
        tfphone = new JTextField();
        tfphone.setBounds(220,330,150,25);
        add(tfphone);
        
        // label for email and field
        JLabel lblemail = new JLabel("Email");
        lblemail .setBounds(30,370,150,25);
        add(lblemail );
        
        tfemail = new JTextField();
        tfemail.setBounds(220,370,150,25);
        add( tfemail);
        
        // --- Buttons (Event Handlers Attached) ---
        
        // Creating Add button
        add = new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70,430,100,25);
        add.addActionListener(this); // Event Handler Attached
        add(add);
        
        // Creating back button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        // Image on right side of frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 420);
        add(image);
        
        
        
        setVisible(true);
    }
    
 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== add){
            // --- DATA COLLECTION LOGIC (Retained) ---
            String username = labelusername.getText();
            String id = (String)comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender= null;
            if(rmale.isSelected()){
                gender = "Male";
            } else{
                gender = "Female";
            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            
           
            // Temporary Success Message for Week 2
            JOptionPane.showMessageDialog(null, "Customer details form submitted successfully (Database skipped for Week 2).");
            setVisible(false);
            
        } else if(ae.getSource()== back){
            setVisible(false);
        }
    }
    
    public static void main(String[]args){
        new AddCustomer("Shahroz");
    }
}