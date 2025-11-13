package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ViewBookedHotel extends JFrame implements ActionListener{
    JButton back;
    
    ViewBookedHotel(String username){
        // frame of this class
        setBounds(400,200,1000,600);
        setLocationRelativeTo(null); 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Haeding or label of this frame
        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,400,30);
        add(text);
        
      
        
        // for username
        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        // in which name will filled (Dummy Data)
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setText(username);
        add(labelusername);
        
        // for hotel name 
        JLabel lblid = new JLabel("Hotel Name");
        lblid.setBounds(30,90,150,25);
        add(lblid);
        
        // in which package will filled (Dummy Data)
        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220,90,150,25);
        labelpackage.setText("Raddisson Blue Hotel");
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
        
        // for Total Days
        JLabel lbldays = new JLabel("Total Days");
        lbldays.setBounds(30,170,150,25);
        add(lbldays);
        
        // in which days will filled (Dummy Data)
        JLabel labeldays = new JLabel();
        labeldays .setBounds(220,170,150,25);
        labeldays.setText("3");
        add( labeldays );
        
        // for room ac or not 
        JLabel lblac = new JLabel("AC/ Non-AC");
        lblac .setBounds(30,210,150,25);
        add(lblac );
        
        // in which ac will filled (Dummy Data)
        JLabel labelac = new JLabel();
        labelac .setBounds(220,210,150,25);
        labelac.setText("AC");
        add( labelac );
        
        // for food included or not 
        JLabel lblfood = new JLabel("Food Included?");
        lblfood .setBounds(30,250,150,25);
        add(lblfood );
        
        // in which food will filled (Dummy Data)
        JLabel labelfood = new JLabel();
        labelfood .setBounds(220,250,150,25);
        labelfood.setText("Yes");
        add( labelfood );
        
        
        // for id
        JLabel lblname = new JLabel("ID Type");
        lblname.setBounds(30,290,150,25);
        add(lblname);
        
        // in which id will filled (Dummy Data)
        JLabel labelid = new JLabel();
        labelid .setBounds(220,290,150,25);
        labelid.setText("National ID Card");
        add(labelid );
        
        // for id number
        JLabel lblgender = new JLabel("ID Number");
        lblgender.setBounds(30,330,150,25);
        add(lblgender);
        
        // in which id number will filled (Dummy Data)
        JLabel labelnumber = new JLabel();
        labelnumber .setBounds(220,330,150,25);
        labelnumber.setText("A1234567");
        add(labelnumber );
        
        // for Phone number
        JLabel lblcountry = new JLabel("Phone");
        lblcountry.setBounds(30,370,150,25);
        add(lblcountry);
        
        // in which phone number will filled (Dummy Data)
        JLabel labelphone = new JLabel();
        labelphone  .setBounds(220,370,150,25);
        labelphone.setText("0300-1234567");
        add(labelphone);
        
        // for total cost
        JLabel lbladdress = new JLabel("Total Cost");
        lbladdress.setBounds(30,410,150,25);
        add(lbladdress);
        
        // in which price will filled (Dummy Data)
        JLabel labelprice = new JLabel();
        labelprice  .setBounds(220,410,150,25);
        labelprice.setText("Rs 36000");
        add(labelprice);
        
        
        // --- Back Button (Event Handler Attached) ---
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.setBounds(130,460,100,25);
        back.addActionListener(this);
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
        
        new ViewBookedHotel("shahroz");
        
    }
}