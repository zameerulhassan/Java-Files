package GUI;
import java.awt.FlowLayout; //how things are placed, layout.//put to right, left of it.
import javax.swing.JFrame; //this all basic windows like, title bar, minimize, maximize windows etc.
import javax.swing.JLabel; //allows to output the text.
public class JFrameClass extends JFrame{ // this inheritance gives all the features, of minimize/maximize windows.
    private JLabel item1;
    
    
    public JFrameClass(){ //constructor
        super("This is Title Bar");
        setLayout(new FlowLayout());
        
        item1= new JLabel("This is a Sentence");
        item1.setToolTipText("This is hovering");//hovering
        add(item1);
        
    }
}
