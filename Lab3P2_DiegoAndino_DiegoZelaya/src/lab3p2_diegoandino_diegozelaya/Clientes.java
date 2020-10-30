//Clase de clientes que hereda de personas

package lab3p2_diegoandino_diegozelaya;

import java.util.ArrayList;

public class Clientes extends Personas {
    private int dinero;
    private ArrayList carrito=new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(int dinero) {
        super();
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList carrito) {
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        return "Clientes{" + "dinero=" + dinero + ", carrito=" + carrito + '}';
    }
}
