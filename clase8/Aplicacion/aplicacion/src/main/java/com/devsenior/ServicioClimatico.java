package com.devsenior;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServicioClimatico {
    private static final Logger logger = LogManager.getLogger(ServicioClimatico.class);

    public void RegistrarLectura(EstacionMetereologica estacion, LecturaClimatica lectura){

        if(lectura.getTemperatura() < -90 || lectura.getTemperatura() > 60){
            logger.error("Temperatura fuera de rango: {}", lectura.getTemperatura());
            throw new IllegalArgumentException("Temperatura inválida: " + lectura.getTemperatura());
        }

        if(lectura.getHumedad() < 0 || lectura.getHumedad() > 100){
            logger.error("Humedad fuera de rango: {}", lectura.getHumedad());
            throw new IllegalArgumentException("Humedad inválida: " + lectura.getHumedad());
        }

        estacion.AgregarLecturas(lectura);
        logger.info("Lectura asignada a la estación: " + estacion.getNombre());


    }

}
