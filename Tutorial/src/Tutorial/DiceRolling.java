/*
this program rolls the die 100o times and count the frequency of each face
 */
package Tutorial;

import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random rand = new Random();
        int freq[]= new int[7]; // just to avoid index at zero, we used total array of 7 to get 1-6 values.
        
        for (int roll =1; roll<1000; roll++){
            freq[1+rand.nextInt(6)]++;
            //this line simply adds 1 to respective index of freq array
        }
        System.out.println("Face\tFrequency");
        
        for (int face =1; face<freq.length; face++){
            System.out.println(face+"\t"+freq[face]);
            //face is used as number (1-6)as face of dice (index number), and freq[] index is used (which are already counted) as occurances(index value).
        }
            
    }
    
}
