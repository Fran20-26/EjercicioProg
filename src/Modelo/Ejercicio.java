
package Modelo;

import java.util.Objects;

public class Ejercicio {
    private int codRutina;
    private String Nombre;
    private int Nivel;
    private String Descripcion;

    public Ejercicio(int CodEj, String Nombre, int Nivel, String Descripcion) {
        this.codRutina = CodEj;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
        this.Descripcion = Descripcion;
    }

    public Ejercicio(int codRutina) {
        this.codRutina = codRutina;
    }
    
    public int  getCodRutina() {
        return codRutina;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getNivel() {
        return Nivel;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codRutina;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ejercicio other = (Ejercicio) obj;
        return this.codRutina == other.codRutina;
    }

    

    
    
}
