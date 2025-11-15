///Crea tu propio programa en JDoodle que construya tu propia Clase: la Clase Estudiante. Debe tener al menos un atributo, como nombre, y un método, llamado presentarse(), que imprima algo como: "Hola, mi nombre es [nombre]".

class Estudiante {
    
    // Atributo
    String nombre;
    
    // Constructor
    public Estudiante(String nombreInicial) {
        this.nombre = nombreInicial;
    }
    
    // Método (Comportamiento)
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + this.nombre + ". ¡Estoy aprendiendo POO!");
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto
        Estudiante est1 = new Estudiante("Sofía");
        
        // 2. Llamar al método
        est1.presentarse(); 
    }
}
