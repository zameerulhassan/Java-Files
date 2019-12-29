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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int anArray[];
       anArray = new int [10];
       //anArray1 = new int [5];
       //anArray[0]=100;
       //anArray[1]=200;
       //anArray[2]=300;
       /*
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++)
        arr[i] = 0;
       */
       for (int i =0; i<10; i++)
       {
       System.out.println("Index at " + i + " is " + anArray[i]);
       } 
       
}
}
