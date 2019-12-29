package Tutorial;

import javax.swing.JOptionPane;

public class GUI {

    public static void main(String[] args) {
        
        String firstNumber = JOptionPane.showInputDialog("Enter First Number");
        String secondNumber = JOptionPane.showInputDialog("Enter Second Number");
        int num1 = Integer.parseInt(firstNumber);
        int num2= Integer.parseInt(secondNumber);
        
        int sum= num1+num2;
        JOptionPane.showMessageDialog(null,"The Answer is "+ sum, "ZAM!!!_The Title HERE ", JOptionPane.PLAIN_MESSAGE);
    }
    
}
