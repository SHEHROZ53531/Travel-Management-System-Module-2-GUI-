package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame implements Runnable{
    
    Thread t1;  // using thraeding concept for slide show
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    // Note: The JLabel array initialization must be done inside the constructor or using a static block.
    // We will initialize the array 'label' inside the constructor after its declaration.
    JLabel[] label = new JLabel[10]; 
    JLabel caption;
    
    public void run(){
        // now we also display name of the hotels
        String[] text = new String[]{"Serena Shigar Fort","Serena Altit Fort","Himmel Skardu","Karakoram View Hotel","Madarin Oriental Hotel","Mountain Lodge Skardu","Fairy Meadows Hotel","Lake View Hotel Naran","Raddisson Blue Hotel","Classio Motel"};
        
        try{
            for(int i=0; i<=9; i++){
                // Check if the label array element is initialized before calling setVisible
                if (label[i] != null) { 
                    label[i].setVisible(true);
                    caption.setText(" " + text[i]); // Added space for cleaner look
                }
                
                Thread.sleep(2500);  // stod exceution after 2.5 sec
                
                if (label[i] != null) {
                    label[i].setVisible(false);
                }
            }
            // Close the frame after the slideshow
            dispose(); // Use dispose() instead of setVisible(false) for JFrame
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    CheckHotels(){
        // in this class we display a slide show of our hotels images
        setBounds(500,200,800,600);
        setLocationRelativeTo(null); 
        setLayout(null);
        
        // --- Caption Label Setup ---
        caption = new JLabel("");
        caption.setBounds(50, 500, 700, 70); 
        caption.setFont(new Font("Arial", Font.BOLD, 36)); 
        caption.setForeground(new Color(255, 215, 0)); 
        caption.setBackground(new Color(0, 0, 0, 128)); 
        caption.setOpaque(true); 
        caption.setHorizontalAlignment(SwingConstants.CENTER); 
        add(caption);
        
        
        
        // --- Image Loading Loop ---
        ImageIcon[] image = new ImageIcon[10]; 
        Image[] jimage = new Image[10];
        ImageIcon[] kimage = new ImageIcon[10];
        
        for(int i=0; i<=9; i++){
            
            // Note: The image files must exist in the 'icons' folder named hotel1.jpg to hotel10.jpg
            image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/hotel"+(i+1)+".jpg"));
            jimage[i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            kimage[i] = new ImageIcon(jimage[i]);
            
            // Assigning to the dynamic label array
            label[i] = new JLabel(kimage[i]); 
            label[i].setBounds(0, 0, 800, 600);
            add(label[i]);
            
            // Initially setting the first image visible, rest invisible (will be handled by run method)
            label[i].setVisible(false);
        }
        
        // Start Thread
        t1 = new Thread(this);
        t1.start();
        
        setVisible(true);
    }
    
    public static void main(String[]args){
        new CheckHotels();
    }
}