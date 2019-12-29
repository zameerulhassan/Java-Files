package Tutorial;
public class MainForTime {
    public static void main(String[] args) {
      
        TimeClassMultipleConstructors myTimeObject1 = new TimeClassMultipleConstructors();
        
        TimeClassMultipleConstructors myTimeObject2 = new TimeClassMultipleConstructors(5);
        TimeClassMultipleConstructors myTimeObject3 = new TimeClassMultipleConstructors(5,13);
        TimeClassMultipleConstructors myTimeObject4 = new TimeClassMultipleConstructors(4,13,43);
        
        System.out.printf("%s\n", myTimeObject1.toMilitary());
        System.out.printf("%s\n", myTimeObject2.toMilitary());
        System.out.printf("%s\n", myTimeObject3.toMilitary());
        System.out.printf("%s\n", myTimeObject4.toMilitary());
    }
    
}
