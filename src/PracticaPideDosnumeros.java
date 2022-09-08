import java.util.Scanner;

public class PracticaPideDosnumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
        //
        //Podría ser utilizando operador ternario.

        System.out.println("Ingrese el primer numero aquí: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingrese el segundo numero aquí: ");
        int segundoNumero = scanner.nextInt();

        int resultado = (primerNumero > segundoNumero) ? primerNumero + segundoNumero : segundoNumero + primerNumero;
        String resultado2 = (primerNumero > segundoNumero) ? primerNumero + " y " + segundoNumero : segundoNumero + " y " + primerNumero;
        System.out.println("el orden es " + resultado2);
    }



}
