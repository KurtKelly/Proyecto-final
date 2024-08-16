import java.util.InputMismatchException;
import java.util.Scanner;

public class Menuapicultor {

    public void menuapicultor(Login.username){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU DE APICULTOR" + Login);
            System.out.println("1. Ver zapatos");
            System.out.println("2. Agregar zapato");
            System.out.println("3. Editar zapato");
            System.out.println("4. Eliminar zapatos");
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
                    Verzapatos.verzapatos();
                    break;
                case 2:
                    Agregarzapato.agregarzapato(scanner);
                    break;
                case 3:
                    Editarzapato.editarzapato(scanner);
                    break;
                case 4:
                    Eliminarzapato.eliminarzapato(scanner);
                    break;
                case 5:
                    Mainmenu.mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }
        } while (opcion != 5);

    }
}
