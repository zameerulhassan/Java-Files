
package Tutorial;
import java.io.*;

public class BufferWriterExample {
    public static void main(String[] throws Exception {
        FileWriter writer = new FileWriter("Zam4.txt"); 
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("zam just wrote this");
        buffer.close();
        System.out.println("Success..");
    }
}
