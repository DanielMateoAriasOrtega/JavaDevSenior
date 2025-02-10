import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
         * Ejercicio 15
         * Escriba un programa en el que ingrese un número y le diga si es positivo o
         * negativo. Repita el proceso hasta que se ingrese el número cero.
         */
        var scanner = new Scanner(System.in); // Scanner para leer entrada del usuario

        while (true) { // Bucle infinito, se detiene cuando el usuario ingresa 0
            System.out.print("Ingrese un número (0 para salir): ");
            var numero = scanner.nextInt();

            if (numero == 0)
                break; // Si el número es 0, se detiene el programa

            System.out.println(numero > 0 ? "Positivo" : "Negativo");
        }

        scanner.close(); // Cierra el scanner para liberar recursos
        System.out.println("Programa finalizado.");
    }
}
