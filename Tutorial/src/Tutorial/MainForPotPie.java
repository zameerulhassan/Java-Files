/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial;

/**
 *
 * @author User
 */
public class MainForPotPie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PotPie PotPieObject = new PotPie(4,5,6);
        PotPieBirthday PotPieBirthdayObject = new PotPieBirthday("Zam",PotPieObject);
        
        System.out.println(PotPieBirthdayObject);
        
    }
    
}
