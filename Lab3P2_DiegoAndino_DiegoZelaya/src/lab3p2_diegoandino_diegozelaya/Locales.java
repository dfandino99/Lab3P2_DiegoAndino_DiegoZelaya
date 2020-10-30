//Clase locales

package lab3p2_diegoandino_diegozelaya;

import java.util.ArrayList;

public class Locales {
  
    private String nombre;
    private ArrayList <Empleados> empleado;
    private ArrayList <Productos> productos;
    private Empleados gerente;
    
    //Constructores

    public Locales() {
        
    }

    public Locales(String nombre, ArrayList<Empleados> empleado, ArrayList<Productos> productos, Empleados gerente) {
        this.nombre = nombre;
        this.empleado = empleado;
        this.productos = productos;
        this.gerente = gerente;
    }

   
    //Accesores y mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleados> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleados> empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public Empleados getGerente() {
        return gerente;
    }

    public void setGerente(Empleados gerente) {
        this.gerente = gerente;
    }
    
    //Metodos administrativos

    @Override
    public String toString() {
        return "Locales{" + "Nombre=" + nombre + ", empleado=" + empleado + ", productos=" + productos + ", gerente=" + gerente + '}';
    }
    
}//fin del la calse
