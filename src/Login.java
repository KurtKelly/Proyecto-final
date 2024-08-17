import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {


    public static void login() {
        String username;
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************************************************************");
        System.out.println("Estimado usuario, por favor ingrese su usuario");
        username = scanner.next();
        System.out.println("******************************************************************************************");
        System.out.println("Estimado usuario, por favor ingrese su pass");
        password = scanner.next();
        System.out.println("******************************************************************************************");

        if (username.equals("admin") && password.equals("admin")) {
            Menujefe.menujefe();

        } else
            for (Usuarios i : Usuarios.listaUsuarios) {
                 if (i.getUsuario().equals(username) && i.getPassword().equals(password)) {
                   int mantenimientos = i.getMantenimientos(); 
                   i.setMantenimientos(mantenimientos + 1);  
                   Menuapicultor.menuapicultor();

                 }
        }
        System.out.println("Usuario o contra incorrecta, ingrese de nuevo");
            Login.login();

    }
}
