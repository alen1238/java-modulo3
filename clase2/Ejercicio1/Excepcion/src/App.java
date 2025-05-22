import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        try{
            calculadora.dividir(10, 20);
        }catch(DivisionInvalidaException e){
            System.out.println("Error." + e.getMessage());
        }
    }

    public static void Ejemplo1(){
         Scanner scanner = new Scanner(System.in);
        boolean exito = false;
        int resultado = 0;
        int denominador, numerador;
        
       
        while(!exito){   
            try{
                    System.out.println("Ingrese el numerador: ");
                    numerador = scanner.nextInt();

                    System.out.println("Ingrese el denominador: ");
                    denominador = scanner.nextInt();
                    resultado = numerador / denominador;
                    System.out.println("El resultado es: " + resultado);
                    exito = true;

                    if(denominador > numerador){//evaluamos si la lógica se rompe...
                        throw new DivisionInvalidaException("Denominador inválido");
                    }
            }catch(ArithmeticException e){
                System.out.println("Error: No se puede dividir por cero. Intente nuevamente. " + e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("Error: Debe ingresar un número entero. ntente de nuevo. " + e.getMessage());
                scanner.nextLine();
            }catch(DivisionInvalidaException e){
                System.out.println("Error de lógica: " + e.getMessage());
            }
     }

        scanner.close();
      

        System.out.println("finalizando exitosamente...");
    }
}
