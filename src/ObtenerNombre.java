import javax.swing.*;

public class ObtenerNombre {
    public static void main(String[] args) {
        // Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
        //
        //Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
        //
        //Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
        //
        //Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
        //
        //Restricción no usar loops en el desarrollo de la tarea.
        //
        //Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."

        String nombreCompleto1 = JOptionPane.showInputDialog("Ingrese nombre y apellido 1");
        String nombreCompleto2 = JOptionPane.showInputDialog("Ingrese nombre y apellido 2");
        String nombreCompleto3 = JOptionPane.showInputDialog("Ingrese nombre y apellido 3");

        String nombre1[] = nombreCompleto1.split(" ");
        String nombre2[] = nombreCompleto2.split(" ");
        String nombre3[] = nombreCompleto3.split(" ");

        if (nombre1[0].length() > nombre2[0].length()) {
            System.out.println("El nombre con más caracteres es: " + nombre1[0]);
        } else if (nombre1[0].length() > nombre3[0].length()) {
            System.out.println("El nombre con más caracteres es: " + nombre2[0]);
        } else if (nombre2[0].length() > nombre1[0].length()) {
            System.out.println("El nombre con más caracteres es: " + nombre2[0]);
        } else if (nombre2[0].length() > nombre3[0].length()) {
            System.out.println("El nombre con más caracteres es: " + nombre2[0]);
        } else if (nombre3[0].length() > nombre1[0].length()) {
            System.out.println("El nombre con más caracteres es: " + nombre3[0]);
        } else if (nombre3[0].length() > nombre2[0].length()) {
            System.out.println("El nombre con más caracteres es: " + nombre3[0]);
        }


    }
}
