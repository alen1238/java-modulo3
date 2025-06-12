package com.devsenior;

import java.util.ArrayList;
import java.util.List;

public class EstacionMetereologica {
    private String nombre;
    private List<LecturaClimatica> lecturas;
    
    public EstacionMetereologica(String nombre) {
        this.nombre = nombre;
        lecturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<LecturaClimatica> getLecturas() {
        return lecturas;
    }

    public void AgregarLecturas(LecturaClimatica lectura){
        lecturas.add(lectura);
    }
}
