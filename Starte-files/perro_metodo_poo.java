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