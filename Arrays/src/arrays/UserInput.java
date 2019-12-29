/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;
import java.util.Scanner;
/**
 *
 * 
 * @author User
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Your choice of Letter to Mark");
       String payer1Char = in.nextLine();
       System.out.println("You Entered Character " + payer1Char);
       
       //Scanner in = new Scanner(System.in);
       System.out.println("Enter Your choice of Letter to Mark");
       String payer2Char = in.nextLine();
       System.out.println("You Entered Character " + payer2Char);
       
       while(payer1Char.equals(payer2Char))
            {
                 System.out.println("You can nto enter same character");
                 System.exit(0);
            }
       String payer3Char = in.nextLine();
       System.out.println("You Entered Character " + payer3Char);
       
       while(payer3Char.equals(payer2Char))
            {
                 System.out.println("You can nto enter same character");
                 System.exit(0);
            }
    }
    
}
