package com.devsenior;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Empleado {
    private static final Logger logger = LogManager.getLogger(Empleado.class);
    
    protected String nombre;
    protected int edad;
    protected double salario;
    
    /**
     * 
     * @param nombre nombre del empleado
     * @param edad edad del empleado
     * @param salario salario dle empleado
     * @throws IllegalArgumentException cuando el salario es negativo.
     */
    public Empleado(String nombre, int edad, double salario) {
       
       try {
            if(salario < 0){
                throw new IllegalArgumentException("El salario no puede ser negativo");
            }
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
       } catch (IllegalArgumentException e) {
            logger.error("Error al crear el empleado: " + e.getMessage());
       }
        if(edad < 18){
            logger.warn("Creando un empleado menor de edad: {} ({} años)", nombre, edad);
        }
    }

    public void aumentarSalario(double cantidad){
        if(cantidad <= 0){
            logger.warn("Intento de aumento no positivo ($ {}) para {}", cantidad, nombre);
            return;
        }
        double salarioAnterior = salario;
        this.salario += cantidad;
        logger.debug("Salario de {} pasó de ${} a ${}", nombre, salarioAnterior, salario);
    }
    
    @Override
    public String toString(){
        return "Empleado{" +
        "nombre= " + nombre + '\'' +
        ", edad= " + edad + 
        ", salario= " + salario + '}';
    }
}
