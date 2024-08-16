import java.util.InputMismatchException;
import java.util.Scanner;

public class Menujefe {

    public static void menujefe() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU DE JEFE");
            System.out.println("1. Ver apicultores");
            System.out.println("2. Contratar apicultor (agregar)");
            System.out.println("3. Editar informacion de apicultor");
            System.out.println("4. Despedir apicultor (eliminar)");
            System.out.println("5. Regresar a Inicio");
            System.out.print("\nOPCION: ");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    Verapicultores.verapicultores();
                    break;
                case 2:
                    Agregarapicultor.agregarapicultor(scanner);
                    break;
                case 3:
                    Editarapicultor.editarapicultor(scanner);
                    break;
                case 4:
                    Eliminarapicultor.eliminarapicultor(scanner);
                    break;
                case 5:
                    Login.login();
                default:
                    System.out.println("ERR::Opcion invalida");
            }
        } while (opcion != 5);
    }




}
