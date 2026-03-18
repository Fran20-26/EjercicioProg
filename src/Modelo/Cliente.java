
package Modelo;

import java.util.ArrayList;

public class Cliente {
    private String DNI;
    private String nombre;
    private String tipoSusc;
    private ArrayList<Entrenamiento> entrenamientos;

    public Cliente(String DNI, String nombre, String tipoSusc) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.tipoSusc = tipoSusc;
        this.entrenamientos = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoSusc() {
        return tipoSusc;
    }

    public ArrayList<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }

    
    
}
