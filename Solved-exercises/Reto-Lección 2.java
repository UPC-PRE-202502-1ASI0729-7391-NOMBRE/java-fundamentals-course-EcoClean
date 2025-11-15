///Crea tu propio programa en JDoodle que muestre tu nombre, tu edad, y que calcule cuántos años tendrás dentro de 5 años.

public class Main {
    public static void main(String[] args) {

        String nombre = "TuNombre";  // Cambia por tu nombre
        int edad = 18;               // Cambia por tu edad

        int edadFutura = edad + 5;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad actual: " + edad);
        System.out.println("Edad dentro de 5 años: " + edadFutura);
    }
}
