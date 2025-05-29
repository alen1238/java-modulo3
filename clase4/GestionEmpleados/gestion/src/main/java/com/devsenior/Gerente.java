package com.devsenior;

public class Gerente extends Empleado{

    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString(){
        return "Gerente{" +
        "departamento= " + departamento + '\'' +
        ", " + super.toString() + 
        "}";
    }
}
