//Laboratorio de la semana 3 de Programacion 2

package lab3p2_diegoandino_diegozelaya;

import java.util.*;

public class Lab3P2_DiegoAndino_DiegoZelaya {

    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();
    
    public static void main(String[] args) {

        String admin = "SUDO";
        String contra = "clau123";
        double dinero=0;
        ArrayList personas = new ArrayList();
        ArrayList productos = new ArrayList();
        ArrayList tiendas = new ArrayList();
        ArrayList <String> ID = new ArrayList(); 
        ArrayList <String> username = new ArrayList();
        String usuario = "";
        String contras = "";
        
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
                            System.out.print("\nIngrese el usuario: ");
                            String x = leer.next();
                            if (x.equals(admin)) {
                                System.out.print("\nHola SUDO, tu contrasena es: "+contra);
                            }
                            System.out.print("\nIngrese la contrasena: ");
                            String c = leer.next();
                            String xd = "";
                                if (x.equals(usuario) && c.equals(contras)) {
                                    xd = x;
                                    while (dinero!=0){
                                        System.out.print("\n******Bienvenido******\n");
                                        System.out.print("1. Tienda \n");
                                        System.out.print("2. Quiosco \n");
                                        System.out.print("3. Restaurantes");
                                        System.out.print("Ingrese la opcion: ");
                                        int local=leer.nextInt();
                                        switch (local){
                                            case 1: System.out.print("\n*****Tienda*****\n");
                                                System.out.print("1. Ropa");
                                                System.out.print("2. Juguetes");
                                                System.out.print("3. Comida");
                                                System.out.print("Que productos desea comprar: ");
                                                int tienda=leer.nextInt();
                                                switch (tienda){
                                                    case 1:
                                                    break;
                                                    
                                                    case 2:
                                                    break;
                                                    
                                                    case 3:
                                                    break;
                                                    
                                                }
                                            break;
                                            
                                            case 2: System.out.print("\n*****Quiosco-50%*****\n");
                                                System.out.print("1. Ropa");
                                                System.out.print("2. Juguetes");
                                                System.out.print("3. Comida");
                                                System.out.print("Que productos desea comprar: ");
                                                int quiosco=leer.nextInt();
                                                switch (quiosco){
                                                    case 1:
                                                    break;
                                                    
                                                    case 2:
                                                    break;
                                                    
                                                    case 3:
                                                    break;
                                                    
                                                }
                                            break;
                                            
                                            case 3: System.out.print("\n*****Restaurante*****\n");
                                                System.out.print("");
                                            break;
                                            
                                        }
                                    }
                                } else if (x.equals(admin) && c.equals(contra)) {
                                    xd = "SUDO";
                                }
                                
                                if (xd.equals(x)) {
                                    if (productos.size() >= 1) {
                                        
                                    } else {
                                        System.out.print("\nNo hay productos registrados\n");
                                    }
                                } else if (xd.equals("SUDO")) {
                                    System.out.print("\n\n******MENU DEL SUDO******\n"
                                            + "1). Anadir\n"
                                            + "2). Modificar\n"
                                            + "3). ELimina\nr"
                                            + "Escoja la opcion: ");
                                    int op = leer.nextInt();
                                        
                                    switch (op) {
                                        
                                        case 1: {
                                            System.out.print("\n\n******Opciones que puedes anadir******\n"
                                                + "1). Anadir locales\n"
                                                + "2). Anadir personas\n"
                                                + "3). Anadir productos\n"
                                                + "Escoja la opcion: ");
                                            int opci = leer.nextInt();
                                            
                                                switch (opci) {
                                                    
                                                    case 1: {
                                                        System.out.print("\n****Locales que puedes anadir****"
                                                                + "1). Tiendas\n"
                                                                + "2). Quioscos\n"
                                                                + "3). Reataurantes\n"
                                                                + "Opcion: ");
                                                        int num = leer.nextInt();
                                                        
                                                            switch (num) {
                                                                
                                                                case 1: {
                                                                    System.out.print("\nIngrese el nombre: ");
                                                                    String n = leer.next();
                                                                    
                                                                    
                                                                break; }
                                                                
                                                                case 2: {
                                                                    
                                                                break; }
                                                                
                                                                case 3: {
                                                                    
                                                                break; }
                                                                
                                                            }
                                                        
                                                    break; }
                                                    
                                                    case 2: {
                                                        
                                                    break; }
                                                    
                                                    case 3: {
                                                        
                                                    break; }
                                                    
                                                    default: {
                                                        System.out.print("Opcion no valida");
                                                    }
                                                }
                                            
                                        break; }
                                        
                                        case 2: {
                                            
                                        break;}
                                        
                                        case 3 : {
                                            
                                        break; }
                                        
                                    }
                                }
                            
                        break; }
                        
                        case 2: {
                            System.out.print("Ingrese su nombre completo: ");
                            String nombre = leer.nextLine();
                            System.out.print("Ingrese su contrasena: ");
                            String contrasena = leer.next();
                            System.out.print("Ingrese su correo: ");
                            String correo = leer.next();
                            System.out.print("Ingrese cuanto dinero tiene: ");
                            dinero = leer.nextDouble();
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
                                    usuario = user;
                                    contras = contrasena;
                                    System.out.print("\nTu usuario es: "+user);
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
