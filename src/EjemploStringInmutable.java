public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion java";
        String alumno = "Emiliano Diaz";

        String detalle = curso + "Alumno: " + alumno;
        System.out.println(detalle);

        int numeroA = 10;
        int numberoB = 5;

        System.out.println(detalle + numeroA + numberoB);
        System.out.println(numeroA + numberoB);

        String detalle2 = curso.concat(alumno);
        System.out.println(detalle2);


    }
}
