//Clase de empleados que hereda de personas

package lab3p2_diegoandino_diegozelaya;

public class Empleados extends Personas {
    private String horario;
    private int vendio;

    public Empleados() {
        super();
    }

    public Empleados(String horario, int vendio) {
        super();
        this.horario = horario;
        this.vendio = vendio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getVendio() {
        return vendio;
    }

    public void setVendio(int vendio) {
        this.vendio = vendio;
    }

    @Override
    public String toString() {
        return "Empleados{" + "horario=" + horario + ", vendio=" + vendio + '}';
    }
    
    
}
