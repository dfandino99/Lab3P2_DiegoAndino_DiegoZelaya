//Clase de comida que herda de productos

package lab3p2_diegoandino_diegozelaya;

import java.util.Date;

public class Comida extends Productos {
    private String tipo;
    private Date vencimiento;

    public Comida() {
        super();
    }

    public Comida(String tipo, Date vencimiento) {
        this.tipo = tipo;
        this.vencimiento = vencimiento;
    }

    public Comida(String tipo, Date vencimiento, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        this.tipo = tipo;
        this.vencimiento = vencimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString() {
        return "Comida{" + "tipo=" + tipo + ", vencimiento=" + vencimiento + '}';
    }
    
    
}
