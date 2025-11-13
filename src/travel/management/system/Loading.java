package travel.management.system;
import javax.swing.*;
import java.awt.*;


public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    
    // we use MultiThraeding concept to fill the progress bar
    public void run(){
        try{
            for(int i=1; i<=101; i++){
                int max = bar.getMaximum(); // to get maximum value 100
                int value= bar.getValue(); // to get current value
                
                if(value < max){ // 101 < 100
                    bar.setValue(bar.getValue() + 1);  
                }else{
                    setVisible(false);  // if value exceed maximum value
                    
                    // --- FINAL CORRECT CALL ---
                    // Calls the correct Dashboard class (Layout + Events)
                    new Dashboard(username); 
                }
                Thread.sleep(50);  // 50 millisecond delays for loader
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    Loading(String username){
        // storing local variable into global variable
        this.username = username;
        t = new Thread(this);  // object of run class
        
        
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // now we create a label Heading
        JLabel text = new JLabel(" Travel and Tourism Aplication ");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);
        
        // now we add progress bar in this frame
        
        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);  // this is use for % on bar
        add(bar);
        
        // now we create a loading label
        JLabel loading = new JLabel(" Loading, please wait.. ");
        loading.setBounds(230,130,150,30);
        loading.setForeground(Color.RED);
        loading.setFont(new Font("Raleway",Font.BOLD,16));
        add(loading);
        
        // now we create a  username label
        JLabel lblusername = new JLabel(" Welcome " +username);
        lblusername.setBounds(20,310,400,40);
        lblusername.setForeground(Color.RED);
        lblusername.setFont(new Font("Raleway",Font.BOLD,16));
        add(lblusername);
        
        
        t.start();  // start progress bar
        setVisible(true);
    }
    
    public static void main(String[]args){
        new Loading("");
    }
}