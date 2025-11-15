///Crea un programa en Java que permita simular mascotas virtuales utilizando programación orientada a objetos.

///El usuario debe poder:

///- Crear una o varias mascotas indicando su nombre.

///- Hacer que cada mascota realice acciones como comer, jugar o dormir.

///- Modificar el nivel de energía de la mascota según la acción realizada.

///- Consultar en cualquier momento el estado actual de cada mascota.

///El programa debe funcionar mediante un menú interactivo y utilizar clases, objetos, métodos y atributos privados.

import java.util.Scanner;

class Mascota {
    private String nombre;
    private int energia;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 50; // energía inicial
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void comer() {
        energia += 20;
        if (energia > 100) energia = 100;
        System.out.println(nombre + " ha comido. Energía actual: " + energia);
    }

    public void jugar() {
        energia -= 15;
        if (energia < 0) energia = 0;
        System.out.println(nombre + " jugó y gastó energía. Energía actual: " + energia);
    }

    public void dormir() {
        energia += 30;
        if (energia > 100) energia = 100;
        System.out.println(nombre + " durmió y recuperó energía. Energía actual: " + energia);
    }

    public void mostrarEstado() {
        System.out.println("Mascota: " + nombre + " | Energía: " + energia);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas mascotas deseas crear? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Mascota[] mascotas = new Mascota[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre de la mascota #" + (i + 1) + ": ");
            String nombre = sc.nextLine();
            mascotas[i] = new Mascota(nombre);
        }

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- MENÚ DEL SIMULADOR ---");
            System.out.println("1. Ver estados de todas las mascotas");
            System.out.println("2. Realizar acción con una mascota");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- ESTADO DE MASCOTAS ---");
                    for (Mascota m : mascotas) {
                        m.mostrarEstado();
                    }
                    break;

                case 2:
                    System.out.println("\nElige una mascota:");
                    for (int i = 0; i < mascotas.length; i++) {
                        System.out.println((i + 1) + ". " + mascotas[i].getNombre());
                    }
                    int num = sc.nextInt() - 1;

                    if (num < 0 || num >= mascotas.length) {
                        System.out.println("Mascota no válida.");
                        break;
                    }

                    Mascota seleccion = mascotas[num];

                    System.out.println("\n¿Qué acción quieres realizar con " + seleccion.getNombre() + "?");
                    System.out.println("1. Comer (+20 energía)");
                    System.out.println("2. Jugar (-15 energía)");
                    System.out.println("3. Dormir (+30 energía)");
                    System.out.print("Opción: ");

                    int accion = sc.nextInt();

                    if (accion == 1) seleccion.comer();
                    else if (accion == 2) seleccion.jugar();
                    else if (accion == 3) seleccion.dormir();
                    else System.out.println("Acción inválida.");

                    break;

                case 0:
                    System.out.println("¡Gracias por jugar! 🐾");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}
