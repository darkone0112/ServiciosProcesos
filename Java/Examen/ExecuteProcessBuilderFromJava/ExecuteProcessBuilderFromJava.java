package Java.Examen.ExecuteProcessBuilderFromJava;

import java.io.File;
import java.io.IOException;

public class ExecuteProcessBuilderFromJava {
    public static void main(String [] args){
        File directorio = new File("C:/Users/D4Rk0n3/Documents/ServiciosProcesos/Java/Examen/ProcessBuilderej");

        ProcessBuilder pb = new ProcessBuilder("java","ProcessBuilderej");

        pb.directory(directorio);

        System.out.println("Directorio de Trabajo: " + pb.directory());

        try {
            Process p = pb.start();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
