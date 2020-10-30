//Clase que trabajara con los productos

package lab3p2_diegoandino_diegozelaya;

public class Productos {
    
    private String nombre;
    private String descripcion; 
    private double precio;
    
    //Constructores

    public Productos() {
        
    }

    public Productos(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    //Accesores y mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Metodos administrativos

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

}
