//Clase de tiendas que hereda de locales

package lab3p2_diegoandino_diegozelaya;

import java.util.ArrayList;

public class Tiendas extends Locales {
    
    ArrayList <Ropa> ropa;
    ArrayList <Juguetes> juguetes;
    
    //Constructores

    public Tiendas() {
        super();
    }

    public Tiendas(ArrayList<Ropa> ropa, ArrayList<Juguetes> juguetes, String nombre, ArrayList<Empleados> empleado, ArrayList<Productos> productos, Empleados gerente) {
        super(nombre, empleado, productos, gerente);
        this.ropa = ropa;
        this.juguetes = juguetes;
    }

    public Tiendas(ArrayList<Ropa> ropa, ArrayList<Juguetes> juguetes) {
        this.ropa = ropa;
        this.juguetes = juguetes;
    }
    
    
    
    //Accesores y mutadores

    public ArrayList<Ropa> getRopa() {
        return ropa;
    }

    public void setRopa(ArrayList<Ropa> ropa) {
        this.ropa = ropa;
    }

    public ArrayList<Juguetes> getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(ArrayList<Juguetes> juguetes) {
        this.juguetes = juguetes;
    }
    
    //Metodos administrativos

    @Override
    public String toString() {
        return "Tiendas{" + "ropa=" + ropa + ", juguetes=" + juguetes + '}';
    }
    
}
