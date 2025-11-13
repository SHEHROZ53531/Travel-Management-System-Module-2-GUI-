package TravelManagmentSystem_Module2.travel.management.system;

import javax.swing.*;

public class Splash {
    public static void main(String[] args) {
        // NOTE: Splash screens usually run a loading animation and then open the Login screen.
        // For now, we are directly calling the Dashboard to test the Module 2 layouts.
        
        // Aap baad mein yahan se 'new Login()' call kar sakte hain.
        new Login();
        
        //new Dashboard(); // Directly open the main window for layout testing
    }
}