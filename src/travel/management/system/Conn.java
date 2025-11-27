package travel.management.system;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            // URL ko standard format mein theek kiya gaya
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem1", "root", "myrootpass");
            s = c.createStatement();
            
            // Connection successful hone par ek message de sakte hain (optional)
            // System.out.println("Database connection successful!"); 
            
        }catch(Exception e){
            System.out.println("Connection Failed! Check credentials and URL.");
            e.printStackTrace();
        }
    }
}