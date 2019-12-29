package Tutorial;
public class UnspecifiedNoOfArgumentsFunction {
    public static void main(String[] args) {
        
        // function call
        System.out.println(average(12,7));
        
        System.out.println(sum(12,7));
        System.out.println(multiply(12,7));
    }
    public static int average(int...numbers){ //these three dots allow us to pass any no. of arguments.
        int total=0;
        for(int i:numbers)
            total+=i;
        return total/numbers.length;
    }
    
    public static int sum(int...numbers){
        int total=0;
        for(int i:numbers)
            total+=i;
        return total;
    }
    
    public static int multiply(int...numbers){
        int total=1;
        for(int i:numbers)
            total*=i;
        return total;
    }
}
