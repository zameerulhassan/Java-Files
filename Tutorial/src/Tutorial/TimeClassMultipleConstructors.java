package Tutorial;
public class TimeClassMultipleConstructors {
    private int hour;
    private int minute;
    private int second;
    
    // constructor with three arguments
    public TimeClassMultipleConstructors(int h, int m, int s){
        setTime(h,m,s);
    }
    //constructor no - arguments- set time to 0,0,0
    public TimeClassMultipleConstructors(){
        this(0,0,0);
    }
    
    //constructor one - arguments- set time to h,0,0
    public TimeClassMultipleConstructors(int h){
        this(h,0,0);
    }
    
    //constructor 2 - arguments- set time to h,m,0
    public TimeClassMultipleConstructors(int h, int m){
        this(h,m,0);
    }
    
   
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    
    
    //setters
    public void setHour(int h){
        hour = ((h>=0&& h<24) ?h:0);
    }
    public void setMinute(int m){
        minute = ((m>=0&& m<60) ?m:0);
    }
    public void setSecond(int s){
        second = ((s>=0&& s<60) ?s:0);
    }
    
    //getters
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
    }
}
