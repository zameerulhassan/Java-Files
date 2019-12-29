import java.awt.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 * 
 */
//color from awt library
// this is only a blue print of the car.
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
