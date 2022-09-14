import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        * En FizzBuzz se te pide imprimir los números del 1 al 100,
        *  los múltiplos de 3 ( debes imprimir “Fizz”)
        * y los múltiplos de 5 ( debes imprimir “Buzz”).
        * Si son divisibles por 3 y 5 se debe imprimir “FizzBuzz”
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número aquí: ");
        int numero = scanner.nextInt();

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
