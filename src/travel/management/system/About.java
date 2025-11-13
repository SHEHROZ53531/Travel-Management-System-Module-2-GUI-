package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    About(){
        
        setBounds(600,200,500,550); 
        setLocationRelativeTo(null); 
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        // ABOUT Heading
        JLabel l1= new JLabel("ABOUT");
        l1.setBounds(150,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(l1);
        
        // Project Description Text
        String s = "About Project\n"+
                "\n"+
                "The Travel and Tourism Management System (TTMS) is designed to streamline the process of planning, booking, and managing travel itineraries for individuals and groups. This application provides a comprehensive platform for users to explore travel options, make reservations, and manage their travel plans efficiently.\n" +
                "\n" +
                "Advantages of the Travel and Tourism Management System:\n" +
                "1. **User -Friendly Interface**: The application is designed to be intuitive and easy to navigate, making it accessible for users of all ages.\n" +
                "2. **Centralized Information**: Users can access all travel-related information in one place, including flights, hotels, and local attractions.\n" +
                "3. **Time-Saving**: Automating the booking process saves users significant time, allowing them to focus on planning their trips.\n" +
                "4. **Cost-Effective**: By comparing prices and options, users can find the best deals and save money on their travel expenses.\n" +
                "5. **24/7 Availability**: The system is available online, allowing users to plan and book their travels at any time.\n" +
                "6. **Secure Transactions**: Integrated payment gateways ensure that all transactions are secure, protecting users' financial information.\n" +
                "7. **Customizable Itineraries**: Users can create personalized travel itineraries that suit their preferences and needs.\n" +
                "\n" ;
        
        
        // Text Area (uses AWT's TextArea)
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        // Back Button (Event Handler Attached)
        JButton back = new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
        
    }
    
   
    public void actionPerformed(ActionEvent ae){
        // Back button functionality
        setVisible(false);
    }
    
    public static void main(String[]args){
        new About();
    }
}