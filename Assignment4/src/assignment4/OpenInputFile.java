//Assignment no. 4.
/*
The program does the following:

gets the original file name (with or without path) from the user.
specifies the output file name
allows the user to set the field width and set the precision (after decimal point).
allows the user to set how many columns on each line (must be from 1 to 5)

*/

package assignment4;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class OpenInputFile {
    
    //to scan user input
    private Scanner x;
    String fineName = JOptionPane.showInputDialog("Enter File Name");
    
    //method to open file
    public void openFile(){
        try{
        x = new Scanner(new File(fineName));
        }
        catch(Exception e){
            System.out.println("could not find file");
        }
    }
    //format method
    public void format(){
        //dialogue to collect user input for formatting style
        String outFileName = JOptionPane.showInputDialog("Enter name for Output File");   
        String columns = JOptionPane.showInputDialog("Enter total no. of columns on one line");
            
            //looping to ensure no. of columns provided by user are in the range (1 - 5)
            while((Integer.parseInt(columns)>6) || (Integer.parseInt(columns)<1)){
               columns = JOptionPane.showInputDialog("Enter total no. of columns on one line"); 
               }
        
        String fieldwidth = JOptionPane.showInputDialog("Enter width of the column");
        String precision = JOptionPane.showInputDialog("Enter Precision ((after decimal point))");
       
        // using this string for indentation
        String indent = "           ";
        
        try {
            PrintWriter outputStream = new PrintWriter(outFileName);
            while(x.hasNext()){
            int fieldWidth = Integer.parseInt(fieldwidth);
            int Precision = Integer.parseInt(precision);
            //converting string to number
            int num = Integer.parseInt(columns);
            
            // loop to control format stype, per line columns, width and precision
            for (int i =1;i <=num;i++){
                String a = x.next();
                double result = Double.parseDouble(a);
                outputStream.printf(String.format("%"+fieldWidth+"."+Precision+"f",result));
                outputStream.print(indent);
                }       
            outputStream.println();
            }
        } catch (FileNotFoundException e) {
          System.out.println("EROR");
        }
       
    }
    public void closeFile(){
        x.close();
    }
    
    //main
    public static void main(String[] args) {
        OpenInputFile object1 = new OpenInputFile();
        object1.openFile();
        object1.format();
        object1.closeFile();
    }
}
