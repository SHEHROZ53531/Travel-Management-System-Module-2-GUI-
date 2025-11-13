
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pay extends JFrame implements ActionListener{

    JEditorPane pane;
    JButton back;
    
    Pay(){
        
        setBounds(500,200,800,600); 
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout()); // Use BorderLayout for clean separation of JEditorPane and Button
        
        // JEditorPane to load website
        pane = new JEditorPane();
        pane.setEditable(false); 
        
        try{
            // URL to load external page
            pane.setPage("https://www.easytickets.pk/events"); 
            
        }catch(Exception e){
            // Show error message if website cannot be accessed
            pane.setContentType("text/html");
            pane.setText("<html><center><h2>Could not load external content.</h2><p>Error 404 or network issue. Check your internet connection.</p></center></html>");
        }
        
        // Add scroll bar to the pane and place it in the CENTER of the frame
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp, BorderLayout.CENTER); // Add ScrollPane to CENTER
        
        // --- Button Panel (SOUTH) for Back Button ---
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); // FlowLayout to center the button

        // Back Button (Event Handler Attached)
        back = new JButton("Back");
        back.setPreferredSize(new Dimension(150, 40)); // Fixed button size
        back.addActionListener(this);
        
        buttonPanel.add(back);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH); // Add button panel to SOUTH
        
        setVisible(true);
        
    }
    
   
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == back) {
            setVisible(false);
            new Payment(); // Navigate back to the Payment selection screen
        }
    }
    
    public static void main(String[]args){
        new Pay();
    }
}