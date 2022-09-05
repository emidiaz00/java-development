import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // 1- Reservar en memoria un usuario y password en un arreglo

        String[] usernames = new String[2];
        String[] password = new String[2];

        usernames[0] = "Emiliano3";
        usernames[1] = "admin3";

        password[0] = "Password1";
        password[1] = "Password1231";

        // 2- Leerlos con la clase scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String usuario = scanner.next();

        System.out.println("Ingrese la contraseña");
        String pass = scanner.next();

        boolean esAutenticado = false;
        // 3- Iterarlos con un for y hacer una condicion si está autenticado devuelva true
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(usuario) && password[i].equals(pass)) {
                esAutenticado = true;
                break;
            } else {
                // sino que devuelva username o contraseña incorrecta
                System.out.println("Usuario o contraseña incorrectos");
            }
        }


    }
}
