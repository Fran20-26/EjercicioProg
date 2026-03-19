
package Modelo;

public class Ejercicio {
    private String codRutina;
    private String Nombre;
    private int Nivel;
    private String Descripcion;

    public Ejercicio(String CodEj, String Nombre, int Nivel, String Descripcion) {
        this.codRutina = CodEj;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
        this.Descripcion = Descripcion;
    }

    public String getCodRutina() {
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
    
}
