package Tutorial;
public class MainForTesting {
    public static void main(String[] args) {
        TimeSetting TimeTesting = new TimeSetting();
        //System.out.println(TimeTesting.toMilitary());
        
        //now setting time
        TimeTesting.setTime(15,16,17);
        System.out.println(TimeTesting.toMilitary());
        System.out.println(TimeTesting.toString());
    }
    
}
