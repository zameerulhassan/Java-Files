
package Tutorial;
import java.io.FileOutputStream;
public class FileOutputStreamExample2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\Documents\\Programming-I\\Java_SourceCodes\\Tutorial\\zam2.txt");
            String st = "I am coming from output stream";
            byte b[] = st.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
