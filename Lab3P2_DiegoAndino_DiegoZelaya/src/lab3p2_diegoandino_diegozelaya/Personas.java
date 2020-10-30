//Clase que trabajara con las personas

package lab3p2_diegoandino_diegozelaya;

import java.util.ArrayList;

public class Personas {
    private ArrayList<String> id=new ArrayList();
    private ArrayList<String> username=new ArrayList();
    private ArrayList<String> contraseña=new ArrayList();
    private ArrayList<String> correo=new ArrayList();
    private ArrayList<String> nombre=new ArrayList();
    private ArrayList<String> roles=new ArrayList();

    public Personas() {
    }

    public ArrayList<String> getId() {
        return id;
    }

    public void setId(ArrayList<String> id) {
        this.id = id;
    }

    public ArrayList<String> getUsername() {
        return username;
    }

    public void setUsername(ArrayList<String> username) {
        this.username = username;
    }

    public ArrayList<String> getContraseña() {
        return contraseña;
    }

    public void setContraseña(ArrayList<String> contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<String> getCorreo() {
        return correo;
    }

    public void setCorreo(ArrayList<String> correo) {
        this.correo = correo;
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList<String> nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", username=" + username + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + ", nombre=" + nombre + ", roles=" + roles + '}';
    }
    
}
