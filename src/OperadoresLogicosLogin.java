import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "emiliano";
        String password = "12334";

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el username");
        String usuario = scanner.next();

        System.out.println("ingrese el password");
        String pass = scanner.next();

        boolean esAutenticado = false;

        if(username.equals(usuario) && password.equals(pass)) {
            esAutenticado = true;
        } else {
            System.out.println("Username o contraseña incorrecto");
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario :".concat(username));
        } else {
            System.out.println("Requiere autenticación");
        }
    }
}
