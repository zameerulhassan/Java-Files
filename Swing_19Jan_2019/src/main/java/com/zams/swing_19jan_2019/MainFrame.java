
package com.zams.swing_19jan_2019;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
    
    private JTextArea textArea;
    private JButton btn;
    
    public MainFrame(){
        super("Hello World"); //super keyword invokes constructors of its parent class
        setLayout(new BorderLayout());
        
        textArea = new JTextArea();
        btn = new JButton("Click Me");
        
        btn.addActionListener(new ActionListner(){
           
        });
        //textArea.append("hellothere\n");
        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ActionListner implements ActionListener {
        
        public ActionListner() {
            
            
        }
        public void actionPerformed(ActionEvent arg0) {
            textArea.append("hello there\n");
        }
    }
    
}
