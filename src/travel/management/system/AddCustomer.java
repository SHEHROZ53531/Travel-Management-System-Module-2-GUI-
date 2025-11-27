package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class AddCustomer extends JFrame implements ActionListener{
     // Global Decalaration
    JLabel labelusername, labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress , tfemail, tfphone;
    JRadioButton rmale, rfemale;
    JButton add, back;
    
         AddCustomer(String username){
                
        setBounds(450,200,850,550);
        setLocationRelativeTo(null);  //  to place in center of window
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        // label for username
        
        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        // for answer that we will fetch from database
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        // label for id
        
        JLabel lblid = new JLabel("Id");
        lblid .setBounds(30,90,150,25);
        add(lblid );
        
        // now we add drop down using JComboBox Class
        
        comboid = new JComboBox(new String[]{"Passport", "Driving License", "National ID Card", "Student ID Card"});
        comboid .setBounds(220,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        // now want number for upper id's
        
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
        add(labelname);
        
        // label for gender
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        // now we add radio button for gender
        
        // for Male
        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);
        
        // for Female
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);
        
        // Now we group these two number to Select only one
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        
        // label for country
        JLabel lblcountry = new JLabel("Country");
        lblcountry .setBounds(30,250,150,25);
        add(lblcountry );
        
        // text field for country
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);
        
        // label for address
        JLabel lbladdress = new JLabel("Address");
        lbladdress .setBounds(30,290,150,25);
        add(lbladdress );
        
        // text field for address
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);
        
        // label for phone number
        JLabel lblphone = new JLabel("Phone");
        lblphone .setBounds(30,330,150,25);
        add(lblphone );
        
        // text field for phone nuumber
        
        tfphone = new JTextField();
        tfphone.setBounds(220,330,150,25);
        add(tfphone);
        
        // label for email
        JLabel lblemail = new JLabel("Email");
        lblemail .setBounds(30,370,150,25);
        add(lblemail );
        
        // text field for address
        
        tfemail = new JTextField();
         tfemail.setBounds(220,370,150,25);
        add( tfemail);
        
        
        // Creating Add button
        add = new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70,430,100,25);
        add.addActionListener(this); // to perform some action
        add(add);
        
         // Creating back button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        // now we add Image on ritght side of frame
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
       Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 420);
        add(image);
        
        // now we fetch 'name' and 'username' from backend directly when frame was open.
        
        try{ 
            // create a obj of connection class
            Conn c = new Conn();
            ResultSet rs= c.s.executeQuery("select * from account where username = '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()== add){
           
           String username = labelusername.getText();
           String id = (String)comboid.getSelectedItem();  // typecast
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
           
           // Now we store all these value's into datbase
           
           try{
               Conn c = new Conn();
               String query = "insert into customer values('"+username+"', '"+id+"', '"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Customer details added successfully");
               setVisible(false);
           }catch(Exception e){
               e.printStackTrace();
           }
           
           
       } else{
           setVisible(false);
       }
   }
    
    public static void main(String[]args){
        new AddCustomer("Shahroz");
    }
}