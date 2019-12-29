package Tutorial;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner zam = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first numb");
        fnum = zam.nextDouble();
        System.out.println("Enter second numb");
        snum = zam.nextDouble();
        
        answer = fnum + snum;
        System.out.print("Answer is :");
        System.out.println(answer);

    }
    
}
