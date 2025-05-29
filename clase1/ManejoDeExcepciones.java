import java.io.*;

public class ManejoDeExcepciones {
    public static void main(String[] args) {
        try {
            // 1. NumberFormatException
            String texto = "abc";
            int numero = Integer.parseInt(texto); // Esto lanza NumberFormatException

            // 2. ArithmeticException
            int resultado = 10 / 0; // Esto lanza ArithmeticException

            // 3. ArrayIndexOutOfBoundsException
            int[] arreglo = {1, 2, 3};
            System.out.println(arreglo[5]); // Esto lanza ArrayIndexOutOfBoundsException

            // 4. FileNotFoundException
            FileReader archivo = new FileReader("archivo_inexistente.txt"); // Esto lanza FileNotFoundException

        } catch (NumberFormatException e) {
            System.out.println("Error: Formato de número inválido -> " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Operación aritmética inválida -> " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del arreglo -> " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción general -> " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
}
