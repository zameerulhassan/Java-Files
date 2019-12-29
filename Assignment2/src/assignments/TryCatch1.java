/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

/**
 *
 * @author User
 */
public class TryCatch1 {
    public static void main (String [] args){
        int num1, num2;
        try{
            num1 =0;
            num2 = 62/num1;
            System.out.println(num2);
            System.out.println("Hey I am at the end od the block");
        }
        catch(ArithmeticException e){
            System.out.println("You should not devide a numbe by zero");  
        }
        catch(Exception e){
            System.out.println("Exception occured");  
        }
    System.out.println("I am out of try catch block");
    }

    
}
