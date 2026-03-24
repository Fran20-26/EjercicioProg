package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

class Entrenamiento {

    private String fecha;
    private int Peso;
    private int series;
    private int repeticiones;
    private String DNI;

    public Entrenamiento(String fecha, int Peso, int series, int repeticiones, String DNI) {
        this.fecha = fecha;
        this.Peso = Peso;
        this.series = series;
        this.repeticiones = repeticiones;
        this.DNI = DNI;
    }

    public String getFecha() {
        return fecha;
    }

    public int getPeso() {
        return Peso;
    }

    public int getSeries() {
        return series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

}
