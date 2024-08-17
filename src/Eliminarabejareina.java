import java.util.InputMismatchException;
import java.util.Scanner;

public class Eliminarabejareina {
    public static void eliminarabejareina(Scanner scanner) {

        System.out.println("0. Regresar a menu admin");
        System.out.println("ID de la abeja reina a eliminar: ");
        String id = scanner.next();
        if (id.equals("0")){
            Menuapicultor.menuapicultor();
        }

        for (Abejasreina abeja : Abejasreina.listaAbejasreina) {
            if (id.equals(abeja.getIdreina())) {
                Abejasreina.listaAbejasreina.removeIf(abejasreina -> abejasreina.getIdreina().equals(id));
                System.out.println("******************************************************************************************");
                System.out.println("La abeja reina " + id + " ha sido eliminada exitosamente de la base de datos");
                System.out.println("******************************************************************************************");
                Menuapicultor.menuapicultor();
            }
        }
        System.out.println("******************************************************************************************");
        System.out.println("Abeja reina no encontrada.");
        System.out.println("******************************************************************************************");
        Menuapicultor.menuapicultor();
    }
}
