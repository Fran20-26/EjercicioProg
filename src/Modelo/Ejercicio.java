
package Modelo;

public class Ejercicio {
    private String CodEj;
    private String Nombre;
    private int Nivel;
    private String Descripcion;

    public Ejercicio(String CodEj, String Nombre, int Nivel, String Descripcion) {
        this.CodEj = CodEj;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
        this.Descripcion = Descripcion;
    }

    public String getCodEj() {
        return CodEj;
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
