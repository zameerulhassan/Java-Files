
package com.zams.swing_19jan_2019;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HelloWord {
    public static void main(String [] args){
        
        SwingUtilities.invokeLater(new Runnable(){

           public void run() {
               new MainFrame();      
           }
        });
        
        
        
        
    }
}
