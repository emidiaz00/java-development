import javax.swing.*;

public class HolaMundo {
    public static void main(HolaMundo[] args) {

        double miArreglo[] = new double[6];
        int contador = 0;


        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la califación " + (i + 1)));
        }

        System.out.println("Mostrar califaciones aprobadas: ");

        for (int i = 0; i < miArreglo.length; i++) {
            if (miArreglo[i] >= 6) {
                System.out.println(miArreglo[i]);
                contador++;
            }
        }
    }

}
