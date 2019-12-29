package Tutorial;
public class PotPie {
    private int month;
    private int day;
    private int year;
    
    public PotPie(int m, int d, int y){
        month = m;
        day = d;
        year = y;
        
        //every time an object is created, this string is printed-> but actually we not passing a string here,
        // we are passing a ref to string (this). i.e. ref to current object
        System.out.printf("The constructor for this is %s\n", this);
        //this method take one argument of type string (%s), but we are passing 'this'keyword
        //'this' key word mean, it is ref to object of the class, but then it looks for toString method
    }
    
    public String toString(){
        return String.format("%d/%d/%d/", month, day, year);
    }
}
