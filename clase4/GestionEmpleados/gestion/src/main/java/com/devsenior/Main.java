package com.devsenior;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("Iniciano el programa de gestión de empleados...");

        Empleado empleado = new Empleado("Juan", 25, 3000);
        Gerente gerente = new Gerente("Ana", 35, 5000, null);

        //Mostrar información
        logger.info("Información del empleado creado: " + empleado);
        logger.info("Información del gerente: " + gerente);


        empleado.aumentarSalario(500);
        gerente.aumentarSalario(1000);

        logger.info("Después del aumento...");
        logger.info("Información del empleado: " + empleado);
        logger.info("Información del gerente: "+ gerente);

        logger.info("Programa finalizado");
        logger.trace("Este es un mmensaje TRACE");
        logger.debug("Este es un mensje DEBUG");
        logger.warn("Este es un mensaje WARN");
        logger.error("Este es un mensaje ERROR");
        logger.fatal("Este es un mensaje FATAL");
    }
}