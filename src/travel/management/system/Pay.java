package travel.management.system;
import javax.swing.*;
import java.awt.event.*;

public class Pay extends JFrame implements ActionListener{

    
    Pay(){
        
        // In this class we load all online pay website
       setBounds(500,200,800,600); 
       setLocationRelativeTo(null);  //  to place in center of window
       
       // now we create text area 
       JEditorPane pane = new JEditorPane();
       pane.setEditable(false);   // so we can't edit it
       
       try{
           pane.setPage("https://www.easytickets.pk/events");
           
           
       }catch(Exception e){
           // in case we dont access website we can show html message
           pane.setContentType("text/html");
           pane.setText("<html> Could not load, Error 404 found </html>");
           
       }
       
       // now we add scroll bar
       
       JScrollPane  sp = new JScrollPane(pane);
       getContentPane().add(sp);
       
      JButton back = new JButton("Back");
       back.setBounds(610,20,80,40);
       back.addActionListener(this);
       pane.add(back);
       
       setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();
    }
    public static void main(String[]args){
        new Pay();
    }
}