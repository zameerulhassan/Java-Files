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
public class TryCatch4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println("1st statement of block");
            int num = 45/0;
        }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Exception Occurs");
         }
    finally{
            System.out.println("Finally Block");
        }
        System.out.println("Out of try-catch-finally Block ");
    }
    
}
