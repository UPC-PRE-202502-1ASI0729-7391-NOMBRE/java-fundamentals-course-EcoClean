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
