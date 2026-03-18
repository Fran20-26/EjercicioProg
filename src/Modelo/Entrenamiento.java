package Modelo;

import java.util.ArrayList;

class Entrenamiento {
    private String fecha;
    private String observaciones;
    private ArrayList<Cliente> clientes;

    public Entrenamiento(String fecha, String observaciones, ArrayList<Cliente> clientes) {
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public String getFecha() {
        return fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

        
}
