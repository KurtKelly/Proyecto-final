import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menuapicultor {

    public static void menuapicultor(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("******************************************************************************************");
            System.out.println("MENU DE APICULTOR");
            System.out.println("******************************************************************************************");
            System.out.println("1. Ver colmenas");
            System.out.println("******************************************************************************************");
            System.out.println("2. Agregar una colmena");
            System.out.println("******************************************************************************************");
            System.out.println("3. Editar una colmena");
            System.out.println("******************************************************************************************");
            System.out.println("4. Eliminar una colmena");
            System.out.println("******************************************************************************************");
            System.out.println("5. Ver reinas abeja");
            System.out.println("******************************************************************************************");
            System.out.println("6. Agregar una reina abeja y vincularla a una colmena (deben existir colmenas primero)");
            System.out.println("******************************************************************************************");
            System.out.println("7. Editar una reina abeja");
            System.out.println("******************************************************************************************");
            System.out.println("8. Eliminar una reina abeja");
            System.out.println("******************************************************************************************");
            System.out.println("9. Regresar a inicio (menu principal)");
            System.out.println("******************************************************************************************");
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
                    Verabejasreina.verabejasreina();
                    break;
                case 6:
                    Agregarabejareina.agregarabejareina(scanner);
                    break;
                case 7:
                    Editarabejareina.editarabejareina(scanner);
                    break;
                case 8:
                    Eliminarabejareina.eliminarabejareina(scanner);
                    break;
                case 9:
                    Login.login();
                    break;
                default:
                    System.out.println("ERR::Opcion invalida");
            }
        } while (opcion != 8);

    }
}
