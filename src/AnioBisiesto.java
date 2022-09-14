public class AnioBisiesto {
    public static void main(String[] args) {
        int mes = 2;
        int dias = 0;
        int anio = 1972;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                dias = 29;
                System.out.println("El año es bisiesto: " + anio);
            } else {
                dias = 28;
            }
        }
        System.out.println("Número de dias: " + dias);
    }
}
