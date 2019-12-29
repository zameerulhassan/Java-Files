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
public class MultiArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] names ={
            {"Mashlay", "Nasri", "Yamaani", "Nuztay", "Zam"},
            {"Mr.","Mrs.","Ms. ","Master "} 
    };
        //actually in java it is array of array,first index is selection of array, second [] is for index position
    System.out.println(names[1][0] + names[0][4]); //mr. zam
    System.out.println(names[1][2] + names[0][0]);//ms. mashaly
    System.out.println(names[1][3] + names[0][1]); //master nasri
    System.out.println(names[1][3] + names[0][2]);//master Yamaani
    System.out.println(names[1][1] + names[0][3]);//mrs. Nuzhat
}
}
