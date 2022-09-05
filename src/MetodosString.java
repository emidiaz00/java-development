public class MetodosString {
    public static void main(String[] args) {
        String nombre = "emiliano";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"emiliano\") = " + nombre.equals("emiliano"));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));

        String trabalengua = "trabalenguas";
        System.out.println("nombre = " + trabalengua.replace("a", "A"));
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));


    
    }
}
