import java.util.Scanner;

public class DevolverTablaMultiplicar {
    public static void main(String[] args) {
        // Enunciado

        /*
         * Dado un número, devolver su tabla de multiplicar completa
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número aquí: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplicacion = i * numero;
            System.out.println(multiplicacion);
        }
    }
}
