package com.devsenior;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(ServicioClimatico.class);
    
    public static void main(String[] args) {
        
        EstacionMetereologica estacion = new EstacionMetereologica("Estación Central");
        ServicioClimatico servicio = new ServicioClimatico();

        try {
            servicio.RegistrarLectura(estacion, new LecturaClimatica(24.5, 55, "2025-06-11" ));
            servicio.RegistrarLectura(estacion, new LecturaClimatica(35.5, 60, "2025-06-11" ));
        } catch (IllegalArgumentException e) {
            logger.warn("Excepción atrapada en el main de la app");

        }
        
        System.out.println("Lecturas regisradas: \n");
        for(LecturaClimatica lectura : estacion.getLecturas()){
            System.out.println(lectura);
        }
    }
}