
package GamePackage;
import javax.swing.JOptionPane;
public class Input {
    public String p1;
    public String p2;
    public String p3;
    
    public String s1;
    public String s2;
    public String s3;
    public Input(){
       String player1 = JOptionPane.showInputDialog(null,
               "Please Enter Name of Player-1:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       p1 = player1;
       String symbolPlayer1 = JOptionPane.showInputDialog(null,
               "Please Enter your Symbol:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       s1 = symbolPlayer1;
       
       String player2 = JOptionPane.showInputDialog(null,
               "Please Enter Name of Player-2:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       p2 = player2;
       String symbolPlayer2 = JOptionPane.showInputDialog(null,
               "Please Enter your Symbol:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       s2 = symbolPlayer2;
       
       String player3 = JOptionPane.showInputDialog(null,
               "Please Enter Name of Player-3:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       p3 = player3;
       String symbolPlayer3 = JOptionPane.showInputDialog(null,
               "Please Enter your Symbol:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       s3 = symbolPlayer3;
       
       //String player2 = JOptionPane.showInputDialog(null, "Please Enter Name of Player-2");
       //String player3 = JOptionPane.showInputDialog(null, "Please Enter Name of Player-3");
    }
    
    // getter
    public String getSymbol1() { 
    return s1;
}
}
