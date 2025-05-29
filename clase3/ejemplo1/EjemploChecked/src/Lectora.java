import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectora {

    public static void leerArchivo(String nombreArchivo) throws IOException{
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while((linea = lector.readLine()) != null){
            System.out.println(linea);
        }
        lector.close();
    }
}
