import javax.swing.*;
import java.util.Locale;

public class ForArrays {
    public static void main(String[] args) {
        String[] nombres = {"Emiliano", "Valentin", "Juan cruz", "Agus", "Milo"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if (nombres[i].contains("Emiliano".toLowerCase())) {
                continue;
            }
            System.out.println(i + "-" + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");
        System.out.println(buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showInputDialog(null, buscar + " fue encontrado en el sistema");
        } else {
            System.out.println("No existe en el sistema");
        }
    }
}
