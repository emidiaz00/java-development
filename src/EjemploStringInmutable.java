public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion java";
        String alumno = "Emiliano Diaz";

        String resultado = curso.concat(alumno);
        System.out.println("curso = " + curso);
        System.out.println("curso = " + resultado);


        String resulta2 = curso.transform(c -> {
           return c + alumno;
        });
        System.out.println(curso);
        System.out.println(resulta2);
        String resultado3 = resultado.replace("a", "A");
        System.out.println(resultado);
        System.out.println(resultado3);

    }
}
