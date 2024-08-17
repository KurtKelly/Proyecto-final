import java.util.InputMismatchException;
import java.util.Scanner;

public class Editarapicultor {


    public static void editarapicultor(Scanner scanner) {
        System.out.println("******************************************************************************************");
        System.out.println("Nombre del apicultor a editar: ");
        String nombrebusqueda = scanner.next();
        System.out.println("******************************************************************************************");
        System.out.print("Nombre de usuario del apicultor a editar: ");
        String user = scanner.next();
        for (Usuarios usuario : Usuarios.listaUsuarios) {
            if (usuario.getNombre().equals(nombrebusqueda)&&usuario.getUsuario().equals(user)) {
                int opcion;

                do {
                    System.out.println("******************************************************************************************************************************************************************");
                    System.out.println("MENU");
                    System.out.println("Está en el menú de edición del apicultor " + usuario.getNombre() + usuario.getApellido() + " con nombre de usuario " + usuario.getUsuario() + ", que desea editar?");
                    System.out.println("1. # de mantenimientos");
                    System.out.println("2. Nombre de usuario");
                    System.out.println("3. Contraseña");
                    System.out.println("4. Regresar a menu de admin");
                    System.out.println("******************************************************************************************************************************************************************");
                    System.out.print("\nOPCION: ");
                    try {
                        opcion = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        opcion = 100;
                        scanner.next();
                    }

                    switch (opcion) {
                        case 1:
                            System.out.println("******************************************************************************************");
                            System.out.println("Introduce el nuevo numero de mantenimientos: ");
                            int mantenimientos;
                            try {
                                mantenimientos = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("ERR::Entrada invalida. Mantenimientos debe ser numero entero.");
                                scanner.next();
                                return;
                            }
                            if (mantenimientos <= 0){
                                System.out.println("******************************************************************************************");
                                System.out.println("No se puede asignar un mantenimiento menor a 1.");
                                System.out.println("******************************************************************************************");
                                Menujefe.menujefe();
                            }else {
                                usuario.setMantenimientos(mantenimientos);
                                System.out.println("*******************************************************************************************************************************************");
                                System.out.println("Se ha modificado el numero de mantenimientos del apicultor " + usuario.getNombre() + usuario.getApellido() + " con nombre de usuario " + usuario.getUsuario() +" a " + mantenimientos + " mantenimientos");
                                System.out.println("*******************************************************************************************************************************************");
                                return;
                            }
                        case 2:
                            System.out.println("******************************************************************************************");
                            System.out.println("Introduce el nuevo nombre de usuario: ");
                            String nuevouser = scanner.next();
                            if(Usuarios.listaApicultores.contains(user)){
                                System.out.println("******************************************************************************************");
                                System.out.println("El nombre de usuario " + user + " ya existe, por favor seleccione otro");
                                System.out.println("******************************************************************************************");
                                Menujefe.menujefe();

                            }else {
                                usuario.setUsuario(nuevouser);
                                System.out.println("*************************************************************************************************************************************************************");
                                System.out.println("Se ha modificado el nombre de usuario del apicultor " + usuario.getNombre() + usuario.getApellido() + " con nombre de usuario " + " a " + usuario.getUsuario());
                                System.out.println("*************************************************************************************************************************************************************");
                                return;
                            }

                        case 3:
                            System.out.println("******************************************************************************************************************************");
                            System.out.println("Introduce la contraseña nueva de apicultor (Debe tener al menos 8 caracteres, una mayuscula, un numero y un caracter especial)");
                            String pass = scanner.next();

                            if (Validador.esPassValido(pass)) {
                                usuario.setPassword(pass);
                                System.out.println("*******************************************************************************************************************************************************************************");
                                System.out.println("Se ha modificado la contraseña del apicultor " + usuario.getNombre() + usuario.getApellido() + " con nombre de usuario " + usuario.getUsuario() +" a " + pass + " de contraseña");
                                System.out.println("*******************************************************************************************************************************************************************************");
                                return;

                            } else {
                                System.out.println("*********************************************************************************************");
                                System.out.println("La contraseña es invalida, por favor establecer una contraseña que cumpla con los requisitos");
                                System.out.println("*********************************************************************************************");
                                Menujefe.menujefe();
                            }

                        case 4:
                            Menujefe.menujefe();

                        default:
                            System.out.println("ERR::Opcion invalida");
                    }
                } while (opcion != 6);


            }
        }
        System.out.println("******************************************************************************************");
        System.out.println("Apicultor no encontrado.");
        System.out.println("******************************************************************************************");
    }

}
