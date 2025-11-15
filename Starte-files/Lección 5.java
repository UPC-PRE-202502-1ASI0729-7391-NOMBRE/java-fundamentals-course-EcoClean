class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 15);
        Estudiante e2 = new Estudiante("Luis", 16);
        Estudiante e3 = new Estudiante("Maya", 14);

        Estudiante[] lista = new Estudiante[3];
        lista[0] = e1;
        lista[1] = e2;
        lista[2] = e3;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + lista[i].getNombre());
        }

        // Modificamos un dato del array
        lista[1].setNombre("Luis Alberto");
        System.out.println("Nombre actualizado del segundo estudiante: " + lista[1].getNombre());
    }
}
