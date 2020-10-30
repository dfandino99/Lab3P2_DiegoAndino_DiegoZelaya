//Clase de ropa que hereda de Productos

package lab3p2_diegoandino_diegozelaya;

public class Ropa extends Productos {
    
    private String genero;
    private String talla;
    
    //Constructores

    public Ropa() {
        super();
    }

    public Ropa(String genero, String talla, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        this.genero = genero;
        this.talla = talla;
    }
    
    //Accesores y mutadores

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero.equals("Masculino") || genero.equals("Femenino")) {
            this.genero = genero;
        }
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    //Metodos administrativos

    @Override
    public String toString() {
        return "Ropa{" + "genero=" + genero + ", talla=" + talla + '}';
    }

}
