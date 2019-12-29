/*
 Creating new class named Commission. This class is extended from 'Employee' class and the
 interface 'Payroll'.
 */
package assignments;
//import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author zam
 */
public class Commission extends Employee implements Payroll {
    // fields.
    private String employeeNumber;
    private String employeeName;
    private double commissionPercentage;
    private String salesMade;
    private double totalPay;
    
    
    Commission( String inputENumber, String inputEName, double inputPercentage) {
        employeeNumber = inputENumber;
        employeeName = inputEName;
        commissionPercentage = (inputPercentage / 100); // percentage
       }
     @Override   
     public void setPayPeriodDetails(){
      //this line will prompt the user for the value of sales in the work period
        salesMade = JOptionPane.showInputDialog("Please enter the value of"
                + " sales");
    }
    
    @Override
    public double calculatePay(){
       double sales = Double.valueOf(salesMade);
       totalPay = (sales * commissionPercentage);
       return totalPay;
       
    }
    
    @Override
    // this method populates name of class instance, cetain fields, like, empplolyee, ID, it returns string.
    public String toString() {
     String finalAssessment;
        finalAssessment = ("Class Type: Commission, " +
                " Name: " + employeeName +
                " ID: " + employeeNumber +
                " Pay: $" + calculatePay());
     return finalAssessment;
        
    }
    
}
