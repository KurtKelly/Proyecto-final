import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {

    String username;
    String password;
    Scanner scanner = new Scanner(System.in);

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estimado usuario, por favor ingrese su usuario");
        username = scanner.next();
        System.out.println("Estimado usuario, por favor ingrese su pass");
        password = scanner.next();
        for (Usuarios i : Usuarios.listaUsuarios){
            if (i.getUsuario().equals(username) && i.getPassword().equals(password)){
                menuapricultor(username);

            }else System.out.println("Usuario o contra incorrecta, ingrese de nuevo")
            return;

        }


    }
}
