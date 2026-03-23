package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

class Entrenamiento {
    private String fecha;
    private int Peso;
    private int series;
    private int repeticiones;
    private String ejercicio;
    private HashMap <String, Cliente> clientes;

    public Entrenamiento(String fecha, int Peso, int series, int repeticiones, String ejercicio, HashMap<String, Cliente> clientes) {
        this.fecha = fecha;
        this.Peso = Peso;
        this.series = series;
        this.repeticiones = repeticiones;
        this.ejercicio = ejercicio;
        this.clientes = clientes;
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

    public String getEjercicio() {
        return ejercicio;
    }

    public HashMap <String, Cliente> getClientes() {
        return clientes;
    }
    
}
