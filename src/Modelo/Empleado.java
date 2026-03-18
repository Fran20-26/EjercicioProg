package Modelo;

public class Empleado {
    private String perfil;
    private String contra;
    private int tipo;

    public Empleado(String perfil, String contra, int tipo) {
        this.perfil = perfil;
        this.contra = contra;
        this.tipo = tipo;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getContra() {
        return contra;
    }

    public int getTipo() {
        return tipo;
    }
    
}
