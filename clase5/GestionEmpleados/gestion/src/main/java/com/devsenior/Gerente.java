package com.devsenior;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Gerente extends Empleado{
    
    private static final Logger logger = LogManager.getLogger(Gerente.class);
    private String departamento;

    /**
     * 
     * @param nombre nombre del gerente
     * @param edad edad del gerente
     * @param salario salario del gerente
     * @param departamento departamento del que se encarga el gerente
     * @throws IllegalArgumentException Arroja IllegalArgumentException cuando departamento es null o blank ""
     */
    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        try {
            if(departamento == null || departamento.isBlank()){
                throw new IllegalArgumentException("El departamento no puede ser indefinido");
            }
            this.departamento = departamento;
       }catch (IllegalArgumentException e) {
        logger.error("Error a crear el gerente: " + e.getMessage());
       }
    }

    @Override
    public String toString(){
        return "Gerente{" +
        "departamento= " + departamento + '\'' +
        ", " + super.toString() + 
        "}";
    }

    public void probandoNombre(){
        this.nombre = "Alfonso";
    }
}
