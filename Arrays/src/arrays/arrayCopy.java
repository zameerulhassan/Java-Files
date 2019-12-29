/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author User
 */
public class arrayCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [] array = {'s', 'm', 'a', 's', 'h', 'l', 'a', 'y', 'x', 'l'};
        char [] secondArray = new char [7];
        System.arraycopy(array, 1, secondArray, 0, 7);
        System.out.print(secondArray);
        System.out.println("");
        
        
        //Option 2
        //demo: using java.util.Arrays- this copies from source array, but also creates new array, 
        //no need to create destination array 
        char[] thirdArray = java.util.Arrays.copyOfRange(array, 1, 8);
        
        System.out.println(new String(thirdArray)); //i think, here string is used to cast char into string
        
    }
    
}
