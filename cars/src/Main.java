
import com.sun.org.apache.xml.internal.resolver.Catalog;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class carClass {
    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;
    
    public carClass (double inputAverageMPG,
            String inputLicensePlate, 
            Color inputPaintColer, 
            boolean inputAreTailingLightWorking)
    {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColer;
        this.areTailingWorking = inputAreTailingLightWorking;
    }
}

public class Main {
    public static void main (String[] args){
       carClass myCar =  new carClass (inputAverageMPG:25.5,inputLicensePlate: "ZAM410827",Color.BLUE, boolean inputAreTailingWorking:true);
    System.out.println("my car numberplat is " +licensePlate);
    }
    
}
