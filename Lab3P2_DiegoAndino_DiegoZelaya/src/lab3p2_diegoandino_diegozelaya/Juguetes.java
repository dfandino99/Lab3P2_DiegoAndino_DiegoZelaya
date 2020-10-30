//Clase de juguetes que hereda de Productos

package lab3p2_diegoandino_diegozelaya;

public class Juguetes extends Productos {
    private String descr;

    public Juguetes() {
        super();
    }

    public Juguetes(String descripcion) {
        this.descr = descripcion;
    }

    public Juguetes(String descripcion, String nombre, String descr, double precio) {
        super(nombre, descripcion, precio);
        this.descr = descripcion;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Juguetes{" + "descr=" + descr + '}';
    }
}
