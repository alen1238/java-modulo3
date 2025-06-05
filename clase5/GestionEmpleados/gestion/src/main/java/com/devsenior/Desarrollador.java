package com.devsenior;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Desarrollador extends Empleado {

    private String lenguaje;
    private static final Logger logger = LogManager.getLogger(Desarrollador.class);

    public Desarrollador(String nombre, int edad, double salario, String lenguaje){
        super(nombre, edad, salario);
        try {
                if(lenguaje == null || lenguaje.isBlank()){
                throw new IllegalArgumentException();
            }
            this.lenguaje = lenguaje;
        } catch (IllegalArgumentException e) {
            logger.error("Error al crear desarrollador: " + e.getMessage());
        }
       
    }

    public void mostrarInformacion(){
        logger.info("Mostrando información del desarrollador");
        super.toString();
        System.out.println("Lenguaje: " + this.lenguaje);
    }
}
