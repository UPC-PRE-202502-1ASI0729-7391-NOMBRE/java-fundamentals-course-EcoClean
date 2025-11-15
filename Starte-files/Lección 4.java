####### Example 1 #######
// Clase principal (Ejemplo en un lenguaje como Java/C#)
public class Main {
    
    // El método main es el punto de inicio
    public static void main(String[] args) {
        
        // Llamada al método sin parámetros
        saludar(); // Imprime: Hola!
        
        // Llamada al método con un parámetro
        saludarPersonalizado("Juan"); // Imprime: Hola, Juan!
        saludarPersonalizado("Ana");  // Imprime: Hola, Ana!
    }

    // --- Definición de Métodos ---

    // Método simple sin parámetros
    public static void saludar() {
        System.out.println("Hola!");
    }

    // Método con un parámetro (String nombre)
    public static void saludarPersonalizado(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }
}
####### Example 2 #######
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
####### Example 3 #######
// --- Clase Perro (Actualizada con el Comportamiento) ---
public class Perro {
    
    String nombre;
    int edad;

    public Perro(String nombreInicial, int edadInicial) {
        this.nombre = nombreInicial;
        this.edad = edadInicial;
    }

    // 3. Comportamiento/Método: ladrar()
    public void ladrar() {
        System.out.println("El perro " + this.nombre + " dice: ¡Guau! ¡Guau!");
    }
}

// --- Clase Principal (Llamando al Comportamiento) ---
public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Fido", 3); 
        
        // Llamar al método del Objeto: miPerro.ladrar()
        miPerro.ladrar(); // Imprime: El perro Fido dice: ¡Guau! ¡Guau!
    }
}
