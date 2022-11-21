package Java.Examen.ProcessBuilderej;

import java.io.IOException;

/**
 * ProcessBuilder
 */
public class ProcessBuilderej {
    
    public static void main(String[]args) {
        ProcessBuilder pb = new ProcessBuilder("CMD","/C","DIR");
        try {
            Process p = pb.start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
