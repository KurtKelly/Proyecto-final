import java.util.InputMismatchException;
import java.util.Scanner;

public class Eliminarapicultor {
    public static void eliminarapicultor(Scanner scanner) {

        System.out.println("0. Regresar al menu de jefe");
        System.out.println("Nombre del apicultor a eliminar: ");
        String nombre = scanner.next();
        if (nombre.equals("0")){
            Menujefe.menujefe();
        }
        System.out.println("Usuario del apicultor a eliminar: ");
        String user = scanner.next();
        if (user.equals("0")){
            Menujefe.menujefe();
        }
        for (Usuarios usuario : Usuarios.listaUsuarios) {
            if (nombre.equals(usuario.getNombre()) && user.equals(usuario.getUsuario())) {
                System.out.println("El apicultor " + nombre + " " + usuario.getApellido() + " con nombre de usuario " + user + " ha sido eliminado exitosamente del sistema");

            } else
                System.out.println("apicultor no encontrado.");
        }
        Usuarios.listaUsuarios.removeIf(usuarios -> usuarios.getNombre().equals(nombre)&&usuarios.getUsuario().equals((user)));

    }
}
