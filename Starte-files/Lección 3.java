###### Example 1 ######

public class Main {
    public static void main(String[] args) {
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres adulto.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}

###### Example 2 ######

public class Main {
    public static void main(String[] args) {
      int nota = 15;

      if (nota >= 18) {
        System.out.println("Excelente");
      } else if (nota >= 14) {
        System.out.println("Aprobado");
      } else {
        System.out.println("Desaprobado");
      }

    }
}

###### Example 3 ######

public class Main {
    public static void main(String[] args) {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Intento número " + i);
      }

    }
}

###### Example 4 ######

public class Main {
    public static void main(String[] args) {
      int contador = 1;

      while (contador <= 3) {
        System.out.println("Contando: " + contador);
        contador++;
      }
    }
}

###### Example 5 ######

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 7;
        int intento = 0;

        System.out.println("Adivina el número (1-10): ");

        while (intento != secreto) {
            intento = sc.nextInt();
            
            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Intenta otra vez...");
            }
        }

        sc.close();
    }
}
