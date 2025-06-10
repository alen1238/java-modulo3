package com.devsenior;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testSuma(){
        Calculadora calc = new Calculadora();
         assertEquals(5, calc.Sumar(2, 3));   
    }

    @Test
    void testDivision(){
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void testDivisionPorCero(){
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}
