import java.util.InputMismatchException;
import java.util.Scanner;

public class Eliminarcolmena {
    public static void eliminarcolmena(Scanner scanner) {

        System.out.println("0. Regresar a menu admin");
        System.out.println("ID de la colmena a eliminar: ");
        String id = scanner.next();
        if (id.equals("0")){
            Menuapicultor.menuapicultor();
        }

        for (Colmenas colmena : Colmenas.listaColmenas) {
            if (id.equals(colmena.getId())) {
                System.out.println("******************************************************************************************");
                System.out.println("La colmena " + id + " ha sido eliminada exitosamente de la base de datos");
                System.out.println("******************************************************************************************");
            }
        }
        Colmenas.listaColmenas.removeIf(colmenas -> colmenas.getId().equals(id));

        for (Colmenas colmenas : Colmenas.listaColmenas) {
            if (!colmenas.getId().equals(id)) {
                System.out.println("******************************************************************************************");
                System.out.println("Colmena no encontrada.");
                System.out.println("******************************************************************************************");
            }
        }
    }
}
