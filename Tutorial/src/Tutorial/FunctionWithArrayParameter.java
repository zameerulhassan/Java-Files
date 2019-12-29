
package Tutorial;

public class FunctionWithArrayParameter {

    public static void main(String[] args) {
        int array[]= {2,3,4,5,6,7};
        
        
        // calling function
        change(array);
        for(int j: array){
            System.out.println(j);
        }
    }
    
    
    
    //function to change the array
    public static void change(int x[]){
        for (int i = 0; i<x.length; i++){
            x[i]+=10; 
        }
    }
}
