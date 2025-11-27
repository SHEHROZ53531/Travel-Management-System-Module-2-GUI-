package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class ViewCustomer extends JFrame implements ActionListener{
    JButton back;
    
    ViewCustomer(String username){
         // frame of this class
        setBounds(450,180,870,625);
        setLocationRelativeTo(null);  //  to place in center of window
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Now we create label
        
        // for username
        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
         // in which name will filled
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        // for id
        JLabel lblid = new JLabel("id");
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
         // in which id will filled
        JLabel labelid = new JLabel();
        labelid.setBounds(220,110,150,25);
        add(labelid);
        
         // for number
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        add(lblnumber);
        
         // in which number will filled
        JLabel labelnumber = new JLabel();
        labelnumber .setBounds(220,170,150,25);
        add(labelnumber );
        
        // for name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
         // in which name will filled
        JLabel labelname = new JLabel();
        labelname .setBounds(220,230,150,25);
        add(labelname );
        
        // for gender
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
         // in which gender will filled
        JLabel labelgender = new JLabel();
        labelgender .setBounds(220,290,150,25);
        add(labelgender );
        
          // for country
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(500,50,150,25);
        add(lblcountry);
        
         // in which country will filled
        JLabel labelcountry = new JLabel();
        labelcountry  .setBounds(690,50,150,25);
        add(labelcountry);
        
          // for address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(500,110,150,25);
        add(lbladdress);
        
         // in which address will filled
        JLabel labeladdress = new JLabel();
        labeladdress  .setBounds(690,110,150,25);
        add(labeladdress);
        
        
         // for phone number
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(500,170,150,25);
        add(lblphone);
        
         // in which phone number will filled
        JLabel labelphone = new JLabel();
        labelphone  .setBounds(690,170,150,25);
        add(labelphone);
        
         // for email
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        add(lblemail);
        
         // in which email will filled
        JLabel labelemail = new JLabel();
        labelemail  .setBounds(690,230,150,25);
        add(labelemail);
        
        
        // now we create a back button
        
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
        
        // now we add image in down of frame
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
        
        
        // now we get all data from backend MySQL Workbench
        
        try{
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
           ResultSet rs = conn.s.executeQuery(query);
           
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelid.setText(rs.getString("id"));
               labelnumber.setText(rs.getString("number"));
               labelname.setText(rs.getString("name"));
               labelgender.setText(rs.getString("gender"));
               labelcountry.setText(rs.getString("country"));
               labeladdress.setText(rs.getString("address"));
               labelphone.setText(rs.getString("phone"));
               labelemail.setText(rs.getString("email"));
               
           }
            
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
        
      
        setVisible(true);       
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        setVisible(false);
    }
    public static void main(String[]args){
        
        new ViewCustomer("shahroz");
        
    }
}