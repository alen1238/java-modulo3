import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        
       try {
        Ejemplo2VerificarEdad(15);
       } catch (MiExcepcion e) {
        e.printStackTrace();
       } //checked
        
    }

    public static void Ejemplo2VerificarEdad(int edad) throws MiExcepcion{
        if(edad < 18){
            throw new MiExcepcion();
        } else{
            System.out.println("Edad válida. Bienvenido/a a la web!");
        }
    }

    public static void Ejemplo1(){
        
        try {
                //1.
            String texto = "abc";
            int numero = Integer.parseInt(texto); // Esto lanza c

            //2.
            int resultado = 10/0; //Esto lanza ArithmeticException

            //3.
            int[] arreglo = {1,2,3};
            System.out.println(arreglo[5]); //Esto lanza un ArrayIndexOutOfBoundsException

            //4.
            FileReader archivo = new FileReader("archivo_inexistente.txt");
        } catch (NumberFormatException e) {
            System.out.println("Error: formato de número inválido");
        } catch(ArithmeticException e){
            System.out.println("Error: Operación aritmética no válida");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Índice fuera de los límites del arreglo " + e.getMessage());
        } catch(FileNotFoundException e){
            System.out.println("Error: archivo no encontrado ->" + e.getMessage());
        } catch(Exception e){
            System.out.println("Ocurrió una excepción general --> " + e.getMessage());
        }
    
        System.out.println("Programa finalizado sin caída abrupta");
        

    }
}
