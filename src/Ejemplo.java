public class Ejemplo {
    public static void main(String[] args) {
        String curso = "Programacion java";
        String curso2 = new String("Programación en java");
        boolean esIgual = curso == curso2;
        System.out.println("esIgual: " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println(esIgual);





    }
}
