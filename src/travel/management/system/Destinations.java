package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class Destinations extends JFrame implements Runnable{
    
    Thread t1; 
    // Replaced manual declarations (l1, l2...) with direct array allocation
    // This prevents NullPointerExceptions before the images are loaded in the loop.
    JLabel[] label = new JLabel[10]; 

    
    public void run(){
        // Loop runs 9 times (i=0 to 8)
        try{
            for(int i=0; i<9; i++){
                // Ensure the label is initialized before calling setVisible
                if (label[i] != null) {
                    label[i].setVisible(true);
                }
                Thread.sleep(2500);  // 2.5 sec delay
                
                if (label[i] != null) {
                    label[i].setVisible(false);
                }
            }
            // Close the frame after the slideshow
            dispose();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    Destinations(){
        // in this class we display a slide show of our destinations images
        setBounds(500,200,800,600);
        setLocationRelativeTo(null); 
        setLayout(null); // Explicitly set layout to null for absolute positioning (important for slideshow)
        
        // --- Image Loading Loop ---
        ImageIcon[] image = new ImageIcon[10]; 
        Image[] jimage = new Image[10];
        ImageIcon[] kimage = new ImageIcon[10]; 
        
        // Note: Loop runs 9 times (i=0 to 8)
        for(int i=0; i<9; i++){
            
            // Image files must be named dest1.jpg to dest9.jpg
            image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest"+(i+1)+".jpg"));
            jimage[i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            kimage[i] = new ImageIcon(jimage[i]);
            
            // Initialize the JLabel inside the loop
            label[i] = new JLabel(kimage[i]);
            label[i].setBounds(0, 0, 800, 600);
            add(label[i]);
            
            // Initially hide all labels; run() will make them visible one by one
            label[i].setVisible(false);
        }
        
        t1 = new Thread(this);
        t1.start();
        
        setVisible(true);
    }
    
    public static void main(String[]args){
        new Destinations();
    }
}