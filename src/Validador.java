import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Validador {
    public static void validador() {
        verificador();
    }

    public static boolean esPassValido(String email) {
        String regexEmail = "^(?=(?:[^A-Z]*[A-Z]){1})(?=(?:[^a-z]*[a-z]){3})(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>])[A-Za-z\\d!@#$%^&*(),.?\":{}|<>]{8,}$";
        Pattern p = Pattern.compile(regexEmail);
        Matcher m = p.matcher(email);

        return m.matches();
    }

    public static void verificador () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la contra a validar: ");
        String email = scanner.nextLine().trim();

        if (esPassValido(email)) {
            System.out.println("La contra es valida.");
        } else {
            System.out.println("La contra es invalida.");
        }

        scanner.close();
    }
}

