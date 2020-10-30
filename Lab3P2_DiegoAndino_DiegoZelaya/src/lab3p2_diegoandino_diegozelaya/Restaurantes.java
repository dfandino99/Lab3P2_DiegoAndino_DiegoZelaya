//Clase de Restaurantes que hereda de Locales

package lab3p2_diegoandino_diegozelaya;

import java.util.ArrayList;

public class Restaurantes extends Locales {
    
    private ArrayList <Comida> menu;
    private Comida platodia;
    
    //Constructores

    public Restaurantes() {
        super();
    }

    public Restaurantes(ArrayList<Comida> menu, Comida platodia, String nombre, ArrayList<Empleados> empleado, ArrayList<Productos> productos, Empleados gerente) {
        super(nombre, empleado, productos, gerente);
        this.menu = menu;
        this.platodia = platodia;
    }
    
    //Accesores y mutadores

    public ArrayList<Comida> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Comida> menu) {
        this.menu = menu;
    }

    public Comida getPlatodia() {
        return platodia;
    }

    public void setPlatodia(Comida platodia) {
        this.platodia = platodia;
    }
    
    //Administrativos

    @Override
    public String toString() {
        return "Restaurantes{" + "menu=" + menu + ", platodia=" + platodia + '}';
    }

}
