/*
Creating Interface
 */
package assignments;

/**
 *
 * @author Zam
 */
public interface Payroll {
    
    /* first method: The method will ask for and store in the object any information that is
       needed to calculate the pay for the employee for one payment period.
    */
    public void setPayPeriodDetails();
    
    /*second method.
      The method uses the information collected by setPayPeriodDetails() and
      calculates the money owed to the employee for the pay period.
    */
    public double calculatePay();
    
}
