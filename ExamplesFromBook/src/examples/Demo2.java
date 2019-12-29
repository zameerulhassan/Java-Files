/*
 Another conditional operator is ?:, which can be thought of as shorthand for an if-then-else statement
 */
package examples;

/**
 *
 * @author User
 */
public class Demo2 {
    {
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        
        result = someCondition ? value1 : value2;
        System.out.println(result);  
    }    
}
