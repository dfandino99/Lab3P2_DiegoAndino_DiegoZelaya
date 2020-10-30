//Laboratorio de la semana 3 de Programacion 2

package lab3p2_diegoandino_diegozelaya;

import java.util.*;

public class Lab3P2_DiegoAndino_DiegoZelaya {

    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();
    
    public static void main(String[] args) {

        String admin = "SUDO";
        String contra = "clau123";
        ArrayList personas = new ArrayList();
        ArrayList productos;
        ArrayList <String> ID = new ArrayList(); 
        ArrayList <String> username = new ArrayList();
        
        char resp = 's';
        
            while (resp == 's') {
                
                System.out.print("\n\n**********MENU**********\n"
                        + "1). Log in\n"
                        + "2). Sign in\n"
                        + "3). Salir\n"
                        + "Ingresar: ");
                int opc = leer.nextInt();
                
                    switch (opc) {
                        
                        case 1: {
                            
                        break; }
                        
                        case 2: {
                            System.out.print("Ingrese su nombre completo: ");
                            String nombre = leer.nextLine();
                            System.out.print("Ingrese su contrasena: ");
                            String contrasena = leer.next();
                            System.out.print("Ingrese su correo: ");
                            String correo = leer.next();
                            System.out.print("Ingrese cuanto dinero tiene: ");
                            double dinero = leer.nextDouble();
                            String id = "";
                            boolean b = false;
                                while (b == false) {
                                    int f = 100+ran.nextInt(10000);
                                    id+=f;
                                        if (ID.contains(id)) {
                                            b = false;
                                        } else {
                                            b = true;
                                        }
                                }
                                ID.add(id);
                                String user = nombre.substring(0, 5);
                                boolean x = false;
                                    while (x == false) {
                                        int n = 30+ran.nextInt(400);
                                        user+=n;
                                            if (username.contains(user)) {
                                               x = false; 
                                            } else {
                                                x = true;
                                            }
                                    }
                                    username.add(user);
                                    personas.add(new Clientes(dinero, id,user, contrasena, correo, nombre));  
                        break; }
                        
                        case 3: {
                            resp = 'n'; 
                            System.out.print("\nTenga un buen dia\n"); 
                            break;
                        }
                        
                    }
                
            }
        

    }
    
}
