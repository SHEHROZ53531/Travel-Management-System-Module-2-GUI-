package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class UpdateCustomer extends JFrame implements ActionListener{
     // Global Decalaration
    JLabel labelusername, labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress , tfemail, tfphone, tfid, tfgender;
    JRadioButton rmale, rfemale;
    JButton add, back;
    
        UpdateCustomer(String username){
                
        setBounds(500,200,850,550);
        setLocationRelativeTo(null);  //  to place in center of window
        setLayout(null);
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
        add(labelusername);
        
        // label for id
        
        JLabel lblid = new JLabel("Id");
        lblid .setBounds(30,90,150,25);
        add(lblid );
        
       
        // text field for id
        tfid = new JTextField();
        tfid.setBounds(220,90,150,25);
        add( tfid);
        
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
        
         // text field for gender
        
        tfgender = new JTextField();
        tfgender.setBounds(220,210,150,25);
        add(tfgender);
       
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
        
        
        // Creating Update button
        add = new JButton("Update");
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
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
       Image i2 = i1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
        image.setBounds(350, 100, 450, 350);
        add(image);
        
        // now we fetch 'name' and 'username' from backend directly when frame was open.
        
        try{ 
            // create a obj of connection class
            Conn c = new Conn();
            ResultSet rs= c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()== add){
           
           String username = labelusername.getText();
           String id = tfid.getText();
           String number = tfnumber.getText();
           String name = labelname.getText();
           String gender= tfgender.getText();
           String country = tfcountry.getText();
           String address = tfaddress.getText();
           String phone = tfphone.getText();
           String email = tfemail.getText();
           
           // Now we store all these value's into datbase
           
           try{
               Conn c = new Conn();
               String query = "update customer set username = '"+username+"', id = '"+id+"', number='"+number+"',name='"+name+"', gender='"+gender+"', country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
               
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Customer details Updated successfully");
               setVisible(false);
           }catch(Exception e){
               e.printStackTrace();
           }
           
           
       } else{
           setVisible(false);
       }
   }
    
    public static void main(String[]args){
        new UpdateCustomer("Shahroz");
    }
}