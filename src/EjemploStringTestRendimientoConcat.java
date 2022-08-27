public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {


        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            c = c.concat(a).concat(b).concat("\n");
        }

        long fin = System.currentTimeMillis();
        System.out.println(inicio - fin);
        System.out.println(c);


    }
}
