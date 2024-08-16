import java.util.InputMismatchException;
import java.util.Scanner;

public class Agregarapicultor {

    public static void agregarapicultor(Scanner scanner) {

        System.out.println("Nombre del apicultor: ");
        String nombre = scanner.next();
        System.out.println("Apellido del apicultor: ");
        String apellido = scanner.next();

        for (Usuarios usuario : Usuarios.listaUsuarios) {

            if (usuario.getNombre().equals(nombre)&& usuario.getApellido().equals(apellido)) { //La condicional evalúa si se había registrado a un apicultor con el mismo nombre y apellido

                System.out.println("Apicultor " + nombre + " " + apellido + " registrado anteriormente.");
                return;
            }
        }
        System.out.println("Nuevo nombre de usuario para el apicultor: ");
        String user;

        user = scanner.next();

        if(Usuarios.listaApicultores.contains(user)){
            System.out.println("El nombre de usuario " + user + " ya existe, por favor seleccione otro");
            Menujefe.menujefe();

        }

        System.out.println("Contraseña nueva de apicultor (Debe tener al menos 8 caracteres, una mayuscula, un numero y un caracter especial)");
        System.out.println("Introduce la contraseña a validar: ");
        String pass;
        pass = scanner.next();

        if (Validador.esPassValido(pass)) {
            System.out.println("La contra es valida.");
            int mantenimientos = 0;
            Usuarios.listaUsuarios.add(new Usuarios(nombre, apellido, mantenimientos, user, pass));

        } else {
            System.out.println("La contraseña es invalida, por favor establecer una contraseña que cumpla con los requisitos");
            Menujefe.menujefe();
        }



    }
}
