import java.util.InputMismatchException;
import java.util.Scanner;

public class Editarabejareina {


    public static void editarabejareina(Scanner scanner) {
        System.out.println("ID de la abeja reina a editar: ");
        String nombrebusqueda = scanner.next();
        for (Abejasreina abeja : Abejasreina.listaAbejasreina) {
            if (abeja.getIdreina().equals(nombrebusqueda)) {
                int opcion;

                do {
                    System.out.println("***************************************************************************************************************************************");
                    System.out.println("MENU");
                    System.out.println("Está en el menú de edición de la abeja reina " + abeja.getIdreina() + " Vinculada a la colmena " + abeja.getId() + ", que desea editar?");
                    System.out.println("1. Estado de salud de la abeja reina");
                    System.out.println("2. Productividad");
                    System.out.println("3. Edad");
                    System.out.println("4. Colmena vinculada");
                    System.out.println("5. Regresar a menu de admin");
                    System.out.println("****************************************************************************************************************************************");
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
                            System.out.println("Introduce el nuevo estado de salud de la abeja reina: ");
                            String estadodesalud1 = scanner.next();
                            abeja.setEstadodesaludabeja(estadodesalud1);
                            System.out.println("******************************************************************************************************");
                            System.out.println("Se ha modificado el estado de salud de la abeja reina " + abeja.getIdreina() + " a " + estadodesalud1);
                            System.out.println("******************************************************************************************************");
                            return;

                        case 2:
                            System.out.println("******************************************************************************************");
                            System.out.println("Introduce la nueva productividad de la abeja reina: ");
                            String productividad = scanner.next();
                            abeja.setProductividad(productividad);
                            System.out.println("*****************************************************************************************/*********");
                            System.out.println("Se ha modificado la productividad de la abeja reina " + abeja.getIdreina() + " a " + productividad);
                            System.out.println("***************************************************************************************************");
                            return;

                        case 3:
                            System.out.println("******************************************************************************************");
                            System.out.println("Introduce la nueva edad de la abeja reina: ");
                            int edad1;
                            try {
                                edad1 = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("ERR::Entrada invalida. La edad de la abeja reina debe ser numero.");
                                scanner.next();
                                return;
                            }
                            abeja.setEdad(edad1);
                            System.out.println("********************************************************************************************");
                            System.out.println("Se ha modificado la edad de la abeja reina " + abeja.getIdreina() + " a " + edad1 + " años.");
                            System.out.println("********************************************************************************************");
                            return;

                        case 4:
                            System.out.println("******************************************************************************************");
                            System.out.println("Introduce el ID de la colmena a la que se vinculará la abeja reina: ");
                            String identificador = scanner.next();
                            if (identificador.equals("0")){
                                Menuapicultor.menuapicultor();
                            }
                            for (Colmenas colmena : Colmenas.listaColmenas){
                                if (colmena.getId().equals(identificador)){
                                    abeja.setId(identificador);
                                    abeja.setEstadodesalud(colmena.getEstadodesalud());
                                    abeja.setCantidaddeabejas(colmena.getCantidaddeabejas());
                                    abeja.setUbicacion(colmena.getUbicacion());
                                    abeja.setProducciondemiel(colmena.getProducciondemiel());
                                    System.out.println("***************************************************************************************************************************************************************");
                                    System.out.println("Se ha modificado el identificador para la colmena de la abeja " + abeja.getIdreina() + " a la colmena " + abeja.getId() + " ubicada en " + abeja.getUbicacion());
                                    System.out.println("***************************************************************************************************************************************************************");
                                    Menuapicultor.menuapicultor();

                                }

                            }
                            System.out.println("******************************************************************************************");
                            System.out.println("Colmena no encontrada.");
                            System.out.println("******************************************************************************************");
                        case 5:
                            Menuapicultor.menuapicultor();
                        default:
                            System.out.println("ERR::Opcion invalida");
                    }
                } while (opcion != 5);


            }
        }
        System.out.println("******************************************************************************************");
        System.out.println("Abeja reina no encontrada.");
        System.out.println("******************************************************************************************");
    }

}
