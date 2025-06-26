package com.devsenior;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ServicioClimaticoTest {
    @Mock
    private EstacionMetereologica estacion;
    @InjectMocks
    private ServicioClimatico servicio;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("prueba de lectura valida")
    void testLectura(){
        var lectura = new LecturaClimatica(25, 70, "2025-06-24");

        servicio.RegistrarLectura(estacion, lectura);

        verify(estacion).AgregarLecturas(lectura);
    };

    @Test
    @DisplayName("prueba de temperatura invalidad")
    void testTemperaturaInvalidad() throws IOException{

         //conectamos y limpiamos el archivo de los logs de los errors
         File logFile = new File("logs/errores.log");
         if(logFile.exists()){
             logFile.delete();
         }

        var lectura = new LecturaClimatica(-100, 50, "2025-06-24");

        Exception exception = assertThrows(IllegalArgumentException.class, ()->servicio.RegistrarLectura(estacion, lectura));

        assertEquals("Temperatura inválida: -100.0", exception.getMessage());

        //verificamos si se escribio el archivo de logs
        assertTrue(logFile.exists());

        //leemos el contenido de archivo
        String logContent = new String(Files.readAllBytes(logFile.toPath()));
        
        assertTrue(logContent.contains("Temperatura fuera de rango: -100.0"));
        
    };

    @Test
    @DisplayName("prueba de humedad invalidad")
    void testHumedadInvalida() throws IOException{
        File logFile = new File("logs/errores.log");
        if(logFile.exists()){
            logFile.delete();
        }
        
        var lectura = new LecturaClimatica(20, 150, "2025-06-24");

        Exception exception = assertThrows(IllegalArgumentException.class, ()->servicio.RegistrarLectura(estacion, lectura));

        assertEquals("Humedad inválida: 150.0", exception.getMessage());
        assertTrue(logFile.exists());

        String logContent = new String(Files.readAllBytes(logFile.toPath()));
        assertTrue(logContent.contains("Humedad fuera de rango: 150.0"));
    };

    @Test
    @DisplayName("prueba de acumulacion de lecturas")
    void testAcumulacionLecturas(){
        List<LecturaClimatica> lecturas = new ArrayList<>();

        when(estacion.getLecturas()).thenReturn(lecturas);

        var lectura1 = new LecturaClimatica(30, 40, "2025-06-24");
        var lectura2 = new LecturaClimatica(20, 60, "2025-06-24");
        var lectura3 = new LecturaClimatica(10, 70, "2025-06-24");

        lecturas.add(lectura1);
        lecturas.add(lectura2);
        lecturas.add(lectura3);

        assertEquals(3, estacion.getLecturas().size());
    }
}
