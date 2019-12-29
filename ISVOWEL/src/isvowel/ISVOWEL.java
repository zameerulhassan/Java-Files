package isvowel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ISVOWEL {
      
    public static void main(String[] args) throws FileNotFoundException {
      Scanner x;
      String fineName = JOptionPane.showInputDialog("Enter File Name");
    //System.out.println("Enter a string"); 
   try{
        x = new Scanner(new File(fineName));
        }
        catch(Exception e){
            System.out.println("could not find file");
        }
        
        
        Scanner sc=new Scanner(System.in);
   
    //int i =0;
    //char c;
   // for (int j=0; j<word.length();j++){
     //    word=sc.next();
    
    
    String vowel ="";
    String consonant = "";
    PrintWriter outputStream = new PrintWriter("outputfile.txt");
    while(sc.hasNext()){
      String word = sc.nextLine();
      for(int i=0;i<word.length();i++){
         char c=word.charAt(i); 
      
      
    if(c=='a' || c=='A'){
        vowel = vowel+c;
        System.out.println(vowel);
        vowel ="";
        //send it to output stream1.. -> and print this in one column
        //outputStream.printf(vowel,"      ", "-");
        //outputStream.println();
    }     
    
    if(c=='e' || c=='E'){
       vowel = vowel+c;
       outputStream.printf(vowel,"      ", "-");
       outputStream.println();  
    } 
    if(c=='i' || c=='I'){
      vowel = vowel+c;
      outputStream.printf(vowel,"      ", "-");
      outputStream.println();
    }
    if(c=='o' || c=='O'){
      vowel = vowel+c; 
      outputStream.printf(vowel,"      ", "-");
      outputStream.println();
    }   
    if(c=='u' || c=='U'){
      vowel = vowel+c;
      outputStream.printf(vowel,"      ", "-");
      outputStream.println();
    }
    else
    {
        consonant= consonant+c;
        outputStream.printf("-","      ", consonant);
        outputStream.println();
        System.out.println("&&&&&&&&&"+consonant);
        consonant = "";
    }   
      }//end of for loop
    //}//end of for loop.
    } //end of while loop.
    }//end of main.
}//end of class.
