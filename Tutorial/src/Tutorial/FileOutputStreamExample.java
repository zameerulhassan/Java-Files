
package Tutorial;
import java.io.FileOutputStream;
public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\Documents\\Programming-I\\Java_SourceCodes\\Tutorial\\zam1.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
