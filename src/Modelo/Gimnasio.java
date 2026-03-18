
package Modelo;

import encriptar.Generador;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Gimnasio {
    private HashMap<String, Cliente> Clientes;
    private ArrayList<Ejercicio> Rutinas;
    private HashMap<String, Empleado> Empleados;
    
    public Gimnasio() {
        Clientes = new HashMap<>();
        Empleados= new HashMap<>();
        Rutinas = new ArrayList<>();
    }
    
    public void cargarEmpleados() {
        Empleados.put("R", new Empleado("Recepcionista", Generador.getMD5("123"), 2));
        Empleados.put("E", new Empleado("Entrenador", Generador.getMD5("123"),1));
        Empleados.put("A", new Empleado("Admin", Generador.getMD5("123"),0));
    }
    
    public boolean comprobarLogin(String login, String contra) {
        boolean resultado = Empleados.containsKey(login);
        if (resultado == true && Empleados.get(login).getContra().equalsIgnoreCase(contra)) {
        } else {
            resultado = false;
        }
        return resultado;
    }

    public HashMap<String, Empleado> getEmpleados() {
        return Empleados;
    }
    
    public int getTipo() {
        int tipo = Empleados.get(this.Empleados).getTipo();
        return tipo;
    }
    
    public void anadirRutina(String codRutina, String nombre, int nivel, String Desc) {
        Rutinas.add(new Ejercicio(codRutina, nombre, nivel, Desc));
    }
    
    public void anadirCliente(String DNI, String nombre, String tipoSusc) {
        Clientes.put(DNI, new Cliente(DNI, nombre, tipoSusc));
    }
    
    public boolean comprobarDNI(String DNI, String nombre, String tipoSusc) {
        boolean Existe = false;
        if (Clientes.containsKey(DNI)) {
            Existe = true;
        } else {
            anadirCliente(DNI, nombre, tipoSusc);
        }
          return Existe;
    }
}
