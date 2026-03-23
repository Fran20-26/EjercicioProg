
package Modelo;

import encriptar.Generador;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Gimnasio {
    private HashMap<String, Cliente> Clientes;
    private ArrayList<Ejercicio> Rutinas;
    private HashMap<String, Empleado> Empleados;
    private HashMap<String, Entrenamiento> Entrenamientos;
    
    public Gimnasio() {
        Entrenamientos = new HashMap<>();
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
    
    public int ComprobarRutina(int codRutina) {
        int i = Rutinas.indexOf(new Ejercicio(codRutina)); // al utilizar un indexOf debe recibir un objeto, sin un objeto el número nunca existe
        
        return i;
    }
    
    public void anadirRutina(int codRutina, String nombre, int nivel, String Desc) { 
        Rutinas.add(new Ejercicio(codRutina, nombre, nivel, Desc));
    }
    
    public void anadirCliente(String DNI, String nombre, String tipoSusc) {
        Clientes.put(DNI, new Cliente(DNI, nombre, tipoSusc));
    }
    
    public boolean comprobarDNI(String DNI) {
        boolean Existe = false;
        if (Clientes.containsKey(DNI) == true) {
            Existe = true;
        }
          return Existe;
    }
    
    public boolean comprobarClientes() {
        boolean existe = false;
        if (Clientes != null) {
            existe = true;
        }
            return existe;
    }

    public Cliente getClientes(String DNI) {
        return Clientes.get(DNI);
    }

    public ArrayList<Ejercicio> getRutinas() {
        return Rutinas;
    }
}
    // envoltorios (Integer, Float) permiten el uso de metodos o conversiones de formato (como Integer.parseInt)
    // se utiliza para tratar datos primitivos como float o int 