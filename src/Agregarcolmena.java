import java.util.InputMismatchException;
import java.util.Scanner;

public class Agregarcolmena {

    public static void agregarcolmena(Scanner scanner) {

        System.out.println("0. Regresar a menu de apicultor");
        System.out.println("ID de la colmena: ");
        String id = scanner.next();

        if (id.equals("0")){
            Menuapicultor.menuapicultor();
        }


        for (Colmenas colmena : Colmenas.listaColmenas) {

            if (colmena.getId().equals(id)) {

                System.out.println("La colmena " + id + " ya está registrada actualmente ");
                Menuapicultor.menuapicultor();
            }
        }

        System.out.println("Ubicacion de la colmena: ");
        String ubicacion = scanner.next();
        if (ubicacion.equals("0")){
            Menuapicultor.menuapicultor();
        }
        System.out.println("Estado de salud de la colmena: ");
        String estadodesalud = scanner.next();

        if (estadodesalud.equals("0")){
            Menuapicultor.menuapicultor();
        }
        System.out.println("Cantidad de abejas en la colmena: ");

        int cantidaddeabejas;
        try {
            cantidaddeabejas = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERR::Entrada invalida. La cantidad debe ser numero.");
            scanner.next();
            return;
        }
        if (cantidaddeabejas == 0){
            Menuapicultor.menuapicultor();
        }

        System.out.println("Produccion de miel de la colmena (litros): ");
        float producciondemiel;
        try {
            producciondemiel = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERR::Entrada invalida. La produccion de miel debe ser numero.");
            scanner.next();
            return;
        }
        if (producciondemiel == 0){
            Menuapicultor.menuapicultor();
        }

        Colmenas.listaColmenas.add(new Colmenas(id, ubicacion, estadodesalud, cantidaddeabejas, producciondemiel));
    }
}
