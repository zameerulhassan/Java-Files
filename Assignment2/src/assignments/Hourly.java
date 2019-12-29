/*
 Creating new class named Hourly. This class is extended from 'Employee' class and the
 interface 'Payroll'.


Using the superclass of Employee and the interface
of Payroll created two subclasses Hourly and Commission that will be used to
calculate their biweekly pay amount
 */
package assignments;
import javax.swing.JOptionPane;
/**
 *
 * @author ZAM
 */
public class Hourly extends Employee implements Payroll {
    private String employeeNumber;
    private String employeeName;
    private double employeePayRate;
    private String hoursWorked1;
    private String hoursWorked2;
    private double week1Pay;
    private double week2Pay;
    private double totalPay;
    
    Hourly( String inputENumber, String inputEName, double inputEPayRate) {
        employeeNumber = inputENumber;
        employeeName = inputEName;
        employeePayRate = inputEPayRate;
    }
    
    @Override
    public void setPayPeriodDetails(){ //setPayPeriodDetails
       //using Dialogue here
        hoursWorked1 = JOptionPane.showInputDialog("Hours worked Week-1:");
        hoursWorked2 = JOptionPane.showInputDialog("Hours worked Week-2:");
        System.out.println("First week: " + hoursWorked1);
        System.out.println("Second week: " + hoursWorked2);
        //System.out.println(hoursWorkedWk2);
        //System.out.println("Week 1 Hours :" + hoursWorkedWk1 + " Week 1 Hours  :" + hoursWorkedWk2);
        
      // hourlyRate = Double.parseDouble(perHourlyRate);
    }
    
    
    @Override
    public double calculatePay() {
        //this method will use the the employee's hourly rate and the number of 
        //hours worked each week and will return the total pay due to the 
        //employee. if any employee works more than 40 hours per week, the hours
        //over 40 will be multiplied to the over time rate of 1.5.
        //
        double hours = Double.valueOf(hoursWorked1);
        double hours2 = Double.valueOf(hoursWorked2);
        if (hours > 40){
            week1Pay = (((hours - 40)*1.5)+40);
            System.out.println("hours: " + hours +  "week1pay " +week1Pay);
        } else {
            week1Pay = hours;
        }
        if (hours2 > 40) {
            week2Pay = (((hours - 40)*1.5)+40);
        } else {
            week2Pay = hours2;
        }
        
        totalPay = ((week1Pay + week2Pay) * employeePayRate);
        System.out.println("total pay is: " + totalPay +
                "week1: " + week1Pay +
                "week2: " + week2Pay);
        return totalPay;
    }
    
    
    @Override
    //this method populates name of class instance, cetain fields, like, empplolyee, ID, it returns string.
    public String toString(){
        String finalAssessment;
        finalAssessment = ("Class Type: Hourly, " +
                " Name: " + employeeName +
                " ID: " + employeeNumber +
                " Pay: $" + calculatePay());
        
        return finalAssessment;
    }
        
}

