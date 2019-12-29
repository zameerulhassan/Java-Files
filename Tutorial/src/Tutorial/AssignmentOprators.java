package Tutorial;
import java.util.Scanner;
public class AssignmentOprators {

    public static void main(String[] args) {
        Scanner zam = new Scanner(System.in);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        
        
        x = 10;
        System.out.println(++x);
        System.out.println(x);
        
        x +=100;
        System.out.println(x);
        
        x -=300;
        System.out.println(x);
    }
    
}
