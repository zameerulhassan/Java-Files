package Tutorial;
public class TestThrow {
    static void validate(int age){
        if (age < 18){
            throw new ArithmeticException("Not Valid");
        }
            else
            System.out.println("Welcome to vote");
        
    } 
    public static void main(String[] args) {
       validate(20);
       System.out.println("rest of the code..");
       
       
       System.out.println("***************");
       validate(13);
       System.out.println("rest of the code..");
    }
    
}
