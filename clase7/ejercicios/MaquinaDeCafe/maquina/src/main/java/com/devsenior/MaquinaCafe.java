package com.devsenior;

public class MaquinaCafe {
    private boolean tieneAgua;
    private boolean tieneCafe;

    public MaquinaCafe(boolean tieneAgua, boolean tieneCafe){
        this.tieneAgua = tieneAgua;
        this.tieneCafe = tieneCafe;
    }

    public String hacerCafe(){
        if(!tieneAgua && !tieneCafe) return "Falta agua y café!";
        if(!tieneAgua) return "Falta agua!";
        if(!tieneCafe) return "Falta café!";
        return "Café Listo!";
    }
}
