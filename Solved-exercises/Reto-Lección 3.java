///Como práctica, te reto a crear un programa que muestre los números del 1 al 10, y luego diga si cada número es par o impar.

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es PAR");
            } else {
                System.out.println(i + " es IMPAR");
            }
        }

    }
}
