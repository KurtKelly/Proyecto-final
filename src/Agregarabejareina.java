import java.util.InputMismatchException;
import java.util.Scanner;

public class Agregarabejareina {

    public static void agregarabejareina(Scanner scanner) {

        System.out.println("******************************************************************************************");
        System.out.println("0. Regresar a menu de apicultor");
        System.out.println("ID de la reina abeja: ");
        String idreina = scanner.next();

        if (idreina.equals("0")){
            Menuapicultor.menuapicultor();
        }


        for (Abejasreina abejas : Abejasreina.listaAbejasreina) {

            if (abejas.getIdreina().equals(idreina)) {

                System.out.println("******************************************************************************************");
                System.out.println("La abeja reina " + idreina + " ya está registrada actualmente ");
                System.out.println("******************************************************************************************");
                Menuapicultor.menuapicultor();
            }
        }

        System.out.println("******************************************************************************************");
        System.out.println("Estado de salud de la reina abeja: ");
        String salud = scanner.next();

        if (salud.equals("0")){
            Menuapicultor.menuapicultor();
        }

        System.out.println("******************************************************************************************");
        System.out.println("Productividad de la reina abeja: ");
        String productividad = scanner.next();

        if (productividad.equals("0")){
            Menuapicultor.menuapicultor();
        }

        System.out.println("******************************************************************************************");
        System.out.println("Edad de la reina abeja: ");

        int edad;
        try {
            edad = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERR::Entrada invalida. Edad debe ser numero.");
            scanner.next();
            return;
        }
        if (edad==0){
            Menuapicultor.menuapicultor();
        }

        System.out.println("******************************************************************************************");
        System.out.println("ID de la colmena a vincular: ");
        String id = scanner.next();
        if (id.equals("0")){
            Menuapicultor.menuapicultor();
        }
        for (Colmenas colmena : Colmenas.listaColmenas){
            if (colmena.getId().equals(id)){
                System.out.println("**************************************************************************************************************************************************************************************************");
                Abejasreina.listaAbejasreina.add(new Abejasreina(idreina, salud, productividad, edad, colmena.getId(),colmena.getUbicacion(), colmena.getEstadodesalud(), colmena.getCantidaddeabejas(), colmena.getProducciondemiel()));
                System.out.println("Se ha creado y vinculado la abeja reina " + idreina + " con la colmena de identificador " + id + " ubicada en " + colmena.getUbicacion());
                System.out.println("**************************************************************************************************************************************************************************************************");
                Menuapicultor.menuapicultor();
            }

        }
        System.out.println("******************************************************************************************");
        System.out.println("No se encontró el identificador de la colmena a vincular o no existe: ");
        System.out.println("******************************************************************************************");
        Menuapicultor.menuapicultor();
    }
}
