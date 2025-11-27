package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener{
    Choice chotel, cac, cfood;
    JTextField tfpersons, tfdays;
    String username;
    JLabel labelusername, labelid, labelnumber, labelphone, labelprice;
    JButton checkprice,bookpackage, back;
    BookHotel(String username){
        this.username = username;
        // frame
        setBounds(350,200,1100,600);
        setLocationRelativeTo(null);  //  to place in center of window
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("BOOK Hotel");
        text.setBounds(100,10,200,30);
        text.setFont(new Font("Tahoma",Font.BOLD, 20));
        add(text);
        
        // for username
        
        JLabel lblusername = new JLabel("username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblusername.setBounds(40,70,100,20);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma",Font.PLAIN, 16));
        labelusername.setBounds(250,70,200,20);
        add(labelusername);
        
        // for select package
        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblpackage.setBounds(40,110,150,20);
        add(lblpackage);
        
        
        chotel = new Choice();
        chotel.setBounds(250,110,200,20);
        add(chotel);
        // now we get hotels from backend mysql workbench
        try{
           
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }
            
            
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
        
   
        
        
         // for total person
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblpersons.setBounds(40,150,150,25);
        add(lblpersons);
        
        // text for total persons
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
         // for total days
        JLabel lbldays = new JLabel("No of days");
        lbldays.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lbldays.setBounds(40,190,150,25);
        add(lbldays);
        
        // text for total days
        
        tfdays = new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
        
          // for room ac or non ac
          
        JLabel lblac = new JLabel("AC/ Non-AC");
        lblac.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblac.setBounds(40,230,150,25);
        add(lblac);
        
        // choice for ac room
        
        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,200,20);
        add( cac);
        
         // for food included or not
          
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblfood.setBounds(40,270,150,25);
        add(lblfood);
        
        // choice for food
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,20);
        add( cfood);
        
        
        // for id
        JLabel lblid = new JLabel("id");
        lblid.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblid.setBounds(40,310,150,20);
        add(lblid);
        
         // in which id will filled
        labelid = new JLabel();
        labelid .setBounds(250,310,200,25);
        add(labelid );
        
        // for id number
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblnumber.setBounds(40,350,150,25);
        add(lblnumber);
        
         // in which Number will filled
        labelnumber = new JLabel();
        labelnumber .setBounds(250,350,150,25);
        add(labelnumber );
        
        // for phone number
        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblphone.setBounds(40,390,150,25);
        add(lblphone);
        
         // in which Phone Number will filled
        labelphone = new JLabel();
        labelphone .setBounds(250,390,150,25);
        add(labelphone );
        
        // for total price
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lbltotal.setBounds(40,430,150,25);
        add(lbltotal);
        
         // in which total price will filled
        labelprice = new JLabel();
        labelprice .setBounds(250,430,150,25);
        add(labelprice );
        
        try{
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
           ResultSet rs = conn.s.executeQuery(query);
           
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelid.setText(rs.getString("id"));
               labelnumber.setText(rs.getString("number"));
               labelphone.setText(rs.getString("phone"));
               
               
           }
            
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
        
        // now we create three button
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60,490,120,25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        // book package button
        
        bookpackage = new JButton("Book Hotel");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(200,490,120,25);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
         // back  button
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,490,120,25);
        back.addActionListener(this);
        add(back);
        
        
          // now we add Image on ritght side of frame
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
       Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l12 = new JLabel(i3);
       l12.setBounds(500, 50, 600, 400);
       add(l12);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel where name ='"+chotel.getSelectedItem()+"'");
            
            while(rs.next()){
                  int cost = Integer.parseInt(rs.getString("costperperson"));
                  int food = Integer.parseInt(rs.getString("foodincluded"));
                  int ac = Integer.parseInt(rs.getString("acroom"));
                  
                  int persons = Integer.parseInt(tfpersons.getText());
                  int days = Integer.parseInt(tfdays.getText());
                  
                  // now check ac or food selected or not
                  
                  String acselected = cac.getSelectedItem();
                  String foodselected = cfood.getSelectedItem();
                  
                  // persons and days always greater then 0
                  
                  if(persons * days  > 0){
                      int total = 0;
                      // using ternary operator to check ac selected or not
                       total += acselected.equals("AC") ? ac : 0 ;
                       total += foodselected.equals("Yes") ? food : 0 ;
                       total += cost; // add costperperson per day
                       
                       // now we calculate persons * person * days
                       
                       total = total * persons * days;
                       labelprice.setText("Rs "+total);
                     
                    }else {
                       JOptionPane.showMessageDialog(null,"Please Enter a valid number");
                  }
                  
                  
                }
            
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        else if(ae.getSource()== bookpackage){
            try {
               Conn c = new Conn();
               c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"', '"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
               JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
               setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            setVisible(false);
        }
    }
    
    
    public static void main(String[]args){
        new BookHotel("Shahroz"); 
    }
}