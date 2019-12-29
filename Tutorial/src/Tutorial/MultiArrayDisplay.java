package Tutorial;
public class MultiArrayDisplay {
    public static void main(String[] args) {
        int array1[][] = {{2,4,6,8},{3},{34,45,46,56,7,9},{1,2,34,5,6}};
        int array2[][] = {{900,400,600,800},{300},{340,450,460,560,70,90},{10,20,340,50,60}};
        
        //funtion call
        System.out.println("First Array");
        display(array1);
        
        System.out.println("Second Array");
        display(array2);
        
    }
    public static void display(int x[][]){
        for(int row=0;row<x.length; row++){
            for(int column=0; column<x[row].length; column++){
                System.out.print(x[row][column] + "\t"); //notice x[row].lenght-> total length of row, ie. no. of columns.
            }
            System.out.println(" ");
        }
    }
}

