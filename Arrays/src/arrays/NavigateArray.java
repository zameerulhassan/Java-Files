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
public class NavigateArray {
  
    
    public static void main(String[] args) {
        String[][] names ={
            {"1", "2", "3", "4", "5", "6", "7", "8"},
            {"8", "7.","6", "5", "4", "3", "2", "1"}, 
            {"11", "12", "13", "14", "15", "16", "17", "18"}
    };
        //actually in java it is array of array,first index is selection of array, second [] is for index position
    System.out.println(names[1][0] + names[2][5]); //16
  
}
}
