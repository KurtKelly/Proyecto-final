import java.util.InputMismatchException;
import java.util.Scanner;

public class Editarcolmena {


    public static void editacolmena(Scanner scanner) {
        System.out.println("ID del zapato a editar: ");
        String nombrebusqueda = scanner.next();
        for (Colmenas colmena : Colmenas.listaColmenas) {
            if (colmena.getId().equals(nombrebusqueda)) {
                int opcion;

                do {
                    System.out.println("MENU");
                    System.out.println("Está en el menú de edición de la colmena " + colmena.getId() + ", que desea editar?");
                    System.out.println("1. Ubicacion");
                    System.out.println("2. Estado de salud");
                    System.out.println("3. Cantidad de abejas");
                    System.out.println("4. Produccion de miel");
                    System.out.println("5. Regresar a menu de admin");
                    System.out.print("\nOPCION: ");
                    try {
                        opcion = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        opcion = 100;
                        scanner.next();
                    }

                    switch (opcion) {
                        case 1:

                            System.out.println("Introduce la nueva ubicacion: ");
                            String ubicacion = scanner.next();
                            colmena.setUbicacion(ubicacion);
                            System.out.println("Se ha modificado la ubicacion de la colmena " + colmena.getId() + " a la ubicacion " + ubicacion);
                            return;

                        case 2:

                            System.out.println("Introduce el nuevo estado de salud: ");
                            String estadodesalud = scanner.next();
                            colmena.setEstadodesalud(estadodesalud);
                            System.out.println("Se ha modificado el estado de salud de la colmena " + colmena.getId() + " a " + estadodesalud);
                            return;

                        case 3:

                            System.out.println("Introduce la nueva cantidad de abejas: ");
                            int cantidaddeabejas;
                            try {
                                cantidaddeabejas = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("ERR::Entrada invalida. La cntidad de abejas debe ser numero.");
                                scanner.next();
                                return;
                            }
                            colmena.setCantidaddeabejas(cantidaddeabejas);
                            System.out.println("Se ha modificado la cantidad de abejas en la colmena " + colmena.getId() + " a " + cantidaddeabejas + " abejas.");
                            return;

                        case 4:

                            System.out.println("Introduce la nueva produccion de miel de la colmena (litros): ");
                            float produccion;
                            try {
                                produccion = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("ERR::Entrada invalida. La produccion de miel debe ser numero.");
                                scanner.next();
                                return;
                            }
                            colmena.setProducciondemiel(produccion);
                            System.out.println("Se ha modificado la produccion de miel en la colmena " + colmena.getProducciondemiel() + " a " + produccion + " litros");
                            return;

                        case 5:
                            Menuapicultor.menuapicultor();
                        default:
                            System.out.println("ERR::Opcion invalida");
                    }
                } while (opcion != 5);


            }
        }
        System.out.println("Zapato no encontrado.");
    }

}
