package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


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
        setLocationRelativeTo(null); 
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
        labelusername.setText(username); // Dummy Data
        add(labelusername);
        
        // for select hotel
        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblpackage.setBounds(40,110,150,20);
        add(lblpackage);
        
        // Choice for hotels (Hardcoded since DB is removed)
        chotel = new Choice();
        chotel.add("Serena Shigar Fort");
        chotel.add("Raddisson Blue Hotel");
        chotel.add("Himmel Skardu");
        chotel.setBounds(250,110,200,20);
        add(chotel);
        
        // --- Remaining Fields (Dummy Data) ---
        
        // for total person
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblpersons.setBounds(40,150,150,25);
        add(lblpersons);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        // for total days
        JLabel lbldays = new JLabel("No of days");
        lbldays.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lbldays.setBounds(40,190,150,25);
        add(lbldays);
        
        tfdays = new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
        
        // for room ac or non ac
        JLabel lblac = new JLabel("AC/ Non-AC");
        lblac.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblac.setBounds(40,230,150,25);
        add(lblac);
        
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
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,20);
        add( cfood);
        
        // for id
        JLabel lblid = new JLabel("ID Type");
        lblid.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblid.setBounds(40,310,150,20);
        add(lblid);
        
        labelid = new JLabel();
        labelid .setBounds(250,310,200,25);
        labelid.setText("National ID Card"); // Dummy Data
        add(labelid );
        
        // for id number
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblnumber.setBounds(40,350,150,25);
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber .setBounds(250,350,150,25);
        labelnumber.setText("123456789"); // Dummy Data
        add(labelnumber );
        
        // for phone number
        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblphone.setBounds(40,390,150,25);
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone .setBounds(250,390,150,25);
        labelphone.setText("0300-1234567"); // Dummy Data
        add(labelphone );
        
        // for total price
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lbltotal.setBounds(40,430,150,25);
        add(lbltotal);
        
        labelprice = new JLabel();
        labelprice .setBounds(250,430,150,25);
        labelprice.setForeground(Color.RED);
        add(labelprice );
        
        
        
        // check price button
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
        
        // back button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,490,120,25);
        back.addActionListener(this);
        add(back);
        
        // Image on ritght side of frame
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
                String hotel = chotel.getSelectedItem();
                int base_cost = 0;
                int ac_charge = 1500; // Hardcoded AC charge
                int food_charge = 1000; // Hardcoded Food charge
                
                // Hardcoded Base Costs based on Hotel Name
                if(hotel.equals("Serena Shigar Fort")) {
                    base_cost = 4000;
                } else if (hotel.equals("Raddisson Blue Hotel")) {
                    base_cost = 6000;
                } else { // Himmel Skardu
                    base_cost = 3000;
                }
                
                int persons = Integer.parseInt(tfpersons.getText());
                int days = Integer.parseInt(tfdays.getText());
                
                if(persons * days > 0){
                    int total = 0;
                    
                    // Add AC/Food charges only if selected
                    total += cac.getSelectedItem().equals("AC") ? ac_charge : 0 ;
                    total += cfood.getSelectedItem().equals("Yes") ? food_charge : 0 ;
                    total += base_cost; // Add base cost per person per night
                    
                    // Final Calculation
                    total = total * persons * days;
                    labelprice.setText("Rs "+total);
                    
                } else {
                    JOptionPane.showMessageDialog(null,"Please Enter a valid number for Persons and Days");
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Please enter valid numbers for Persons and Days.");
            }
            
        }
        else if(ae.getSource()== bookpackage){
            // Temporary Success Message for Week 2
            JOptionPane.showMessageDialog(null, chotel.getSelectedItem() + " booked successfully! (Database skipped for Week 2)");
            setVisible(false);
        }
        else if(ae.getSource()== back){
            setVisible(false);
        }
    }
    
    public static void main(String[]args){
        new BookHotel("Shahroz"); 
    }
}