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
public class TryCatch3 {
    public static void main (String [] args){
        try{
            int a[]= new int[5];
            System.out.println(a[10]);        }
    // (a[10]/0) this should generate ArithmeticException 
    catch (ArithmeticException e){
    System.out.println("ArithmeticException occured");
    }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array Out of Bounds Index occured");            
        }
    }      
}