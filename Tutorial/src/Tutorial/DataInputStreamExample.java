package Tutorial;

import java.io.FileInputStream;

public class DataInputStreamExample {
    public static void main(String[] args) {
       
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\User\\Documents\\Programming-I\\Java_SourceCodes\\Tutorial\\zam.txt");
            int i = fin.read();
            System.out.println((char)i);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
