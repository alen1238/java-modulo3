import java.io.IOException;

public class App {
    public static void main(String[] args) {
        
        try {
            Lectora.leerArchivo("archivo2.txt");
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leído");
            e.printStackTrace();
        }

    }
}
