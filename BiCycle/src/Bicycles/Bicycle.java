package Bicycles;

public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;
    
    //constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    //methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
     
    //In the spirit of encapsulation, it is common to make fields private. 
    //This means that they can only be directly accessed from the Bicycle class. 
    //We still need access to these values, however. This can be done indirectly 
    //by adding public methods that obtain the field values for us:
    public int getCadence() {
        return cadence;
    }
       
    public int getGear() {
        return gear;
    } 
     
    public int getSpeed() {
        return speed;
    }
        
}


