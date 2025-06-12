package com.devsenior;



public class LecturaClimatica {
    private double temperatura;
    private double humedad;
    private String fecha;
    
    public LecturaClimatica(double temperatura, double humedad, String fecha) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.fecha = fecha;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public String getFecha() {
        return fecha;
    }
 
    @Override
    public String toString(){
        return "Fecha: " + fecha + "| temp: " + temperatura  + "C | humedad: "  + humedad;
     }
}
