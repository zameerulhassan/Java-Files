
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        System.out.println("Enter input String");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String reverse = "";
        String originalLower = original.toLowerCase();
        originalLower = originalLower.replaceAll("[^a-zA-Z]", ""); // removing all no alpha characters.
        //originalLower = originalLower.replaceAll("[a-zA-Z]", ""); // removing all no numbers characters.
     for(int i = originalLower.length()-1; i >=0;i-- ){
         reverse = reverse + originalLower.charAt(i);
     }
       if (originalLower.equals(reverse)){
           System.out.println("Given String is Palindrom");
       }   
       else {
           System.out.println("Given String is NOT Palindrom");
       }
       //System.out.println("Given String is: " + originalLower );
    }
    
}
