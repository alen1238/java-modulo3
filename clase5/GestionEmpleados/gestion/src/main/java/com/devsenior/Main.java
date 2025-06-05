package com.devsenior;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("Iniciano el programa de gestión de empleados...");
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n ---Menú Empleados");
            System.out.println("1. Crear Gerente");
            System.out.println("2. Crear desarrollador");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción del menu (1-3): ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.print("nombre del gerente:");
                        String nombreG = scanner.nextLine();
                        System.out.print("Salario: ");
                        double salarioG = Double.parseDouble(scanner.nextLine());
                        System.out.print("Departamento: ");
                        String depto = scanner.nextLine();
                        Gerente gerente = new Gerente(nombreG, 30, salarioG, depto);
                        gerente.toString();
                        break;
                    case 2: 
                        System.out.print("Nombre del desarrollador: ");
                        String nombreD = scanner.nextLine();
                        System.out.print("Salario: ");
                        double salarioD = Double.parseDouble(scanner.nextLine());
                        System.out.print("Lenguaje: ");
                        String lenguaje = scanner.nextLine();

                        Desarrollador dev = new Desarrollador(nombreD, 30, salarioD, lenguaje);
                        dev.mostrarInformacion();
                    break;
                    case 3:
                        logger.info("El usuario ha salido de la aplicación");
                        System.out.println("hasta pronto!");
                    break;
                    default:
                        System.out.println("Opción no válida");
                        logger.warn("Se ingresó una opción no válida");
                        break;
                }
            } catch (NumberFormatException e) {
                logger.error("Entrada no válida: " + e.getMessage());
                System.out.println("Error: Debe ingresar un número");
            }catch(IllegalArgumentException e){
                logger.error("Se intentó crear un gerente, pero ocurrió un error");
                System.out.println("El departamento no debe ser null o blank");
            }
            
        } while (opcion != 3);
            scanner.close();
    }
}