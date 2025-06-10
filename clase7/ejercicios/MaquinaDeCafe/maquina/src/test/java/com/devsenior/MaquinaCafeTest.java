package com.devsenior;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaquinaCafeTest {


    @Test
    void testCafeListo(){
        MaquinaCafe maqCafe = new MaquinaCafe(true,true);
        assertEquals("Café Listo!", maqCafe.hacerCafe());
    }

    @Test
    void faltaAguaTest(){
        MaquinaCafe maqcafe = new MaquinaCafe(false, true);
        assertEquals("Falta agua!", maqcafe.hacerCafe());
    }

    @Test
    void faltanAmbosTest(){
        MaquinaCafe maqcafe = new MaquinaCafe(false, false);
        assertEquals("Falta agua y café!", maqcafe.hacerCafe());
    }

    @Test
    void faltaCafeTest(){
        MaquinaCafe maqcafe = new MaquinaCafe(true, false);
        assertEquals("Falta café!", maqcafe.hacerCafe());
    }

}
