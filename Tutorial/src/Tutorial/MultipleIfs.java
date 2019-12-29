package Tutorial;
import java.util.Scanner;
public class MultipleIfs {
    public static void main(String[] args) {
        int age;
        age = 13;
        
        switch(age){
            case 1:
                System.out.println("you can crawl");
                break;
            case 2:
                System.out.println("you can walk");
                break;
            case 3:
                System.out.println("you can talk as well");
                break;
            default:
                System.out.println("this is default");   
        }
    }
    
}
