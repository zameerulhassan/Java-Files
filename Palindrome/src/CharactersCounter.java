//import.java.util.*;
import java.util.Scanner;
public class CharactersCounter {

    public static void main(String [] args){
    stringStats("zAmeer1 2 ");
    System.out.print(stringStats().A);
} 
    
    private static int  [] stringStats(String st){
    int digits =0;
    int upperCase =0;
    int lowerCase =0;
    int whiteSpace=0; 
    int controlChar =0;
    int alpha =0;
   
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Please Enter a String ");
    //st = jText_input.getText();
    
    for (int i = 0; i<st.length(); i++){
        if (Character.isDigit(st.charAt(i))){
            digits++;
        }
        if (Character.isUpperCase(st.charAt(i))){
            upperCase++;
        }
        if (Character.isLowerCase(st.charAt(i))){
            lowerCase++;
        }  
        if(Character.isWhitespace(i)) {
            whiteSpace++;
        }
        if(Character.isIdentifierIgnorable(i)) {
            controlChar++;
        }
        if(Character.isAlphabetic(i)) {
            alpha++;
        }
        
        
}
    int[] A = {digits, upperCase, lowerCase, whiteSpace, controlChar};    
//jText_output.setText(original2);
    return A;
    Arrays.toString(A);
    }
}