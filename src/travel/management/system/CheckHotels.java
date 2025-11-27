package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame implements Runnable{
    
    Thread t1;  // using thraeding concept for slide show
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JLabel[] label = new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
    JLabel caption;
    
    public void run(){
        // now we also display name of the hotels
        String[] text = new String[]{"Serena Shigar Fort","Serena Altit Fort","Himmel Skardu","Karakoram View Hotel","Madarin Oriental Hotel","Mountain Lodge Skardu","Fairy Meadows Hotel","Lake View Hotel Naran","Raddisson Blue Hotel","Classio Motel"};
        
        try{
            for(int i=0; i<=9; i++){
                label[i].setVisible(true);
                caption.setText(text[i]);
                Thread.sleep(2500);  // stod exceution after 2.5 sec
                label[i].setVisible(false);
                
            }
            // Close the frame after the slideshow
            dispose();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    CheckHotels(){
        // in this class we display a slide show of our hotels images
        setBounds(500,200,800,600);
        setLocationRelativeTo(null);  //  to place in center of window
        setLayout(null); // Set layout to null for absolute positioning
        
         // Place a text Hotel name on label
        caption = new JLabel("");
        caption.setBounds(50, 500, 700, 70); // Adjusted bounds for better positioning
        caption.setFont(new Font("Arial", Font.BOLD, 36)); // Changed font style and size
        caption.setForeground(new Color(255, 215, 0)); // Gold color for text
        caption.setBackground(new Color(0, 0, 0, 128)); // Semi-transparent black background
        caption.setOpaque(true); // Make the background visible
        caption.setHorizontalAlignment(SwingConstants.CENTER); // Center the text
        add(caption);
        
        // we have 10 images to dispaly a slide show we can create in two ways manually creating 10 differnts obj or dynamically insert
        
        // array of an images
        
        ImageIcon  i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
        ImageIcon[] image = new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10}; 
        
        Image  j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
        Image[] jimage = new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
        
        ImageIcon  k1=null,k2=null,k3=null,k4=null,k5=null,k6=null,k7=null,k8=null,k9=null,k10=null;
        ImageIcon[] kimage = new ImageIcon[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10}; 
        
        for(int i=0; i<=9; i++){
            
         image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/hotel"+(i+1)+".jpg"));
        jimage[i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        kimage[i] = new ImageIcon(jimage[i]);
       label[i] = new JLabel(kimage[i]);
        label[i].setBounds(0, 0, 800, 600);
        add(label[i]);
    }
        
        t1 = new Thread(this);
        t1.start();
        
        setVisible(true);
    }
    
   public static void main(String[]args){
       new CheckHotels();
   } 
}