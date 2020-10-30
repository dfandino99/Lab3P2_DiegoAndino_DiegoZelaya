//Clase quisco que hereda de locales
package lab3p2_diegoandino_diegozelaya;

import java.util.ArrayList;

public class Quiosco extends Tiendas {
    
    private String quisco;

    public Quiosco() {
        super();
    }

    public Quiosco(String quisco, ArrayList<Ropa> ropa, ArrayList<Juguetes> juguetes, String nombre, ArrayList<Empleados> empleado, ArrayList<Productos> productos, Empleados gerente) {
        super(ropa, juguetes, nombre, empleado, productos, gerente);
        this.quisco = quisco;
    }
    
    //Accesores y mutadores

    public String getQuisco() {
        return quisco;
    }

    public void setQuisco(String quisco) {
        this.quisco = quisco;
    }
    
    
    
}
