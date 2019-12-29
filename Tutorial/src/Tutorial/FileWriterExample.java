package Tutorial;
import java.io.FileWriter;
public class FileWriterExample {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("C:\\Users\\User\\Documents\\Programming-I\\Java_SourceCodes\\Tutorial\\zam_writes.txt");
            fw.write("I am written from writer ");
            fw.close();
        }
        catch(Exception e){
            System.out.println("Success");
            
        }
    }
    
}
