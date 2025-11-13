// --- Definición de la Clase Perro (El Plano) ---
public class Perro {
    
    // 1. Atributos (Características)
    String nombre;
    int edad; // Agregamos edad como ejemplo

    // 2. Constructor (Método especial que "construye" el objeto)
    public Perro(String nombreInicial, int edadInicial) {
        this.nombre = nombreInicial; // Asigna el valor inicial al atributo nombre
        this.edad = edadInicial;
        System.out.println("¡Se ha creado un nuevo perro!");
    }

    // El método de comportamiento (ladrar) se añade en la siguiente sección.
}

// --- Clase Principal para Crear el Objeto ---
public class Main {
    public static void main(String[] args) {
        // Crear (Instanciar) un Objeto a partir de la Clase Perro
        // Objeto: miPerro, Nombre: Max, Edad: 5
        Perro miPerro = new Perro("Max", 5); 
        
        // Acceder a los atributos del Objeto
        System.out.println("El nombre del objeto es: " + miPerro.nombre); // Imprime: Max
        System.out.println("La edad del objeto es: " + miPerro.edad); // Imprime: 5
    }
}