import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menuapicultor {

    public static void menuapicultor(Login.username){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU DE APICULTOR" + Login);
            System.out.println("1. Ver colmenas");
            System.out.println("2. Agregar colmena");
            System.out.println("3. Editar colmena");
            System.out.println("4. Eliminar colmena");
            System.out.println("5. Regresar a zapatería de Kurt (menu principal)");
            System.out.print("\nOPCION: ");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    Vercolmenas.vercolmenas();
                    break;
                case 2:
                    Agregarcolmena.agregarcolmena(scanner);
                    break;
                case 3:
                    Editarcolmena.editacolmena(scanner);
                    break;
                case 4:
                    Eliminarcolmena.eliminarcolmena(scanner);
                    break;
                case 5:
                    Menuapicultor.menuapicultor();
                default:
                    System.out.println("ERR::Opcion invalida");
            }
        } while (opcion != 5);

    }
}
