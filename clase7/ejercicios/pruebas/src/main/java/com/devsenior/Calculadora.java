package com.devsenior;

public class Calculadora {
    public int Sumar(int a, int b){
        return a + b;
    }

    public int dividir(int a, int b){
        if(b==0) throw new IllegalArgumentException("No se puede dividir por cero");
        return a /b;
    }
}
