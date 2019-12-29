package Tutorial;
import java.util.Random;
public class DiceDie {
    public static void main(String[] args) {
        Random dice = new Random();
        int number;
        for (int i =1; i <=10; i++){
            number = 1+dice.nextInt(6); // this 6 inside is to get total 6 numbers, i.e. 0 thru 5
            //added 1 before that to get rid of 0 => changing from 0-5 to 1-6
            System.out.println(number + " ");
        }
    }
    
}
