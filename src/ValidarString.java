public class ValidarString {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo == false) {
            System.out.println(curso.toUpperCase());
        }



    }
}
