//Laboratorio de la semana 3 de Programacion 2

package lab3p2_diegoandino_diegozelaya;

import java.util.*;

public class Lab3P2_DiegoAndino_DiegoZelaya {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion=0;
        System.out.print("1. Locales \n2. Personas \n3. Productos \n4. Salir \nIngrese la opcion: ");
        opcion=scanner.nextInt();
        switch (opcion){
            case 2: Personas p=new Personas();
                System.out.print("1. Agregar \n2.Modificar \n3. Eliminar \nIngrese la opcion: ");
                opcion=scanner.nextInt();
                
            switch (opcion){
                case 1: System.out.print("Ingrese el ID: ");
                    String id=scanner.next();
                    while (id.contains(id)){
                        System.out.print("Debe de ser un ID unico: ");
                        id=scanner.next();
                    }
                    p.getId().add(id);
                    System.out.print("Ingrese el username: ");
                    String username=scanner.next();
                    while (username.contains(username)){
                        System.out.print("Debe de ser un ID unico: ");
                        username=scanner.next();
                    }
                    p.getUsername().add(username);
                    System.out.print("Ingrese la contraseña: ");
                    String contraseña=scanner.next();
                    p.getContraseña().add(contraseña);
                    System.out.print("Ingrese el correo electronico: ");
                    String correo=scanner.next();
                    p.getCorreo().add(correo);
                    System.out.print("Ingrese el nombre completo: ");
                    String nombre=scanner.next();
                    p.getNombre().add(nombre);
                    System.out.print("Empleado o Cliente: ");
                    String role=scanner.next();
                    if (role.equals("Empleado") || role.equals("empleado")){
                        
                    }
            }
            
            break;
            
        }
    }
    
}
