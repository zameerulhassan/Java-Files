

package assignment4;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class ISVOWEL2 {
    
    //to scan user input
    private Scanner sc;
    String fineName = JOptionPane.showInputDialog("Enter File Name");
    String vowel ="";
    String consonant = "";
    String indent= "     ";
  
    //method to open file
    public void openFile(){
        try{
        sc = new Scanner(new File(fineName));
        }
        catch(Exception e){
            System.out.println("could not find file");
        }
    }
    
    //format method
    public void format(){
        String outFileName = JOptionPane.showInputDialog("Enter name for Output File"); 
        try {
            PrintWriter outputStream = new PrintWriter(outFileName);
                while(sc.hasNext()){
                    String word = sc.nextLine();
                    vowel = "";
                    consonant = "";
                        for(int i=0;i<word.length();i++){
                            char c=word.charAt(i); 
                                if(c=='a' || c=='A'){
                                    vowel = vowel+c;
                                    outputStream.println(vowel+indent +"-"); 
                                    vowel = "";
                                }     
                                else if(c=='e' || c=='E'){
                                    vowel = vowel+c;
                                    outputStream.println(vowel+indent +"-");
                                    vowel = "";  
                                } 
                                else if(c=='i' || c=='I'){
                                    vowel = vowel+c;
                                    outputStream.println(vowel+indent +"-");
                                    vowel = "";
                                }
                                else if(c=='o' || c=='O'){
                                    vowel = vowel+c;
                                    outputStream.println(vowel+indent +"-");
                                    vowel = "";
                                }   
                                else if(c=='u' || c=='U'){
                                    vowel = vowel+c;
                                    outputStream.println(vowel+indent +"-");
                                    vowel ="";
                                }
                                else
                                {
                                    consonant= consonant+c;
                                    outputStream.println("-"+ indent +consonant);
                                    consonant = "";
                                }   
                        }//end of for loop           
                } //end of while loop
                outputStream.close(); //closing the outputStream.
        } //end of try block
        catch (FileNotFoundException e) {
            System.out.println("EROR");
        }  
    } // end of format method.
    
    
    public void closeFile(){
        sc.close();
    }
    
    //main
    public static void main(String[] args) {
        ISVOWEL2 object1 = new ISVOWEL2();
        object1.openFile();
        object1.format();
        object1.closeFile();
    }
}
