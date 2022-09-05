import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        // reserva en memoria dos espacios
        String[] usernames = new String[2];
        String[] password = new String[2];
        usernames[0] = "emiliano";
        usernames[1] = "admin";

        password[0] = "password1";
        password[1] = "password1231";


        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el username");
        String usuario = scanner.next();

        System.out.println("ingrese el password");
        String pass = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(usuario) && password[i].equals(pass)) {
                esAutenticado = true;
            } else {
                System.out.println("Username o contraseña incorrecto");
            }
        }

    }
}
