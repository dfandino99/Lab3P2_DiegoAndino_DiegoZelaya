//Clase que trabajara con las personas

package lab3p2_diegoandino_diegozelaya;

public class Personas {
    private String id;
    private String username;
    private String contraseña;
    private String correo;
    private String nombre;

    public Personas() {
    }

    public Personas(String id, String username, String contraseña, String correo, String nombre) {
        this.id = id;
        this.username = username;
        this.contraseña = contraseña;
        this.correo = correo;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", username=" + username + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + ", nombre=" + nombre + '}';
    }

}
