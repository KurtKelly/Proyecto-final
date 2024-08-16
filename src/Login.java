import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {


    public static void login() {
        String username;
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estimado usuario, por favor ingrese su usuario");
        username = scanner.next();
        System.out.println("Estimado usuario, por favor ingrese su pass");
        password = scanner.next();

        if (username.equals("admin") && password.equals("admin")) {
            Menujefe.menujefe();

        } else
            for (Usuarios i : Usuarios.listaUsuarios) {
                 if (i.getUsuario().equals(username) && i.getPassword().equals(password)) {
                   Menuapicultor.menuapicultor();

                 }
        }
        System.out.println("Usuario o contra incorrecta, ingrese de nuevo");
            Login.login();

    }
}
