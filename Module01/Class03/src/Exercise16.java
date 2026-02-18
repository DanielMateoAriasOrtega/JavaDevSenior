import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        /*
         * Ejercicio 16
         * Escriba un programa que permita ingresar un número mientras estos sean
         * negativos. Detener cuando el número ingresado sea positivo y de cómo
         * resultado la cantidad de números negativos ingresados.
         */
        var scanner = new Scanner(System.in); // Scanner para leer entrada del usuario
        var contador = 0; // Contador de números negativos

        while (true) { // Bucle infinito hasta que se ingrese un número positivo
            System.out.print("Ingrese un número negativo (positivo para salir): ");
            var numero = scanner.nextInt();

            if (numero >= 0)
                break; // Si el número es positivo, se detiene el programa

            contador++; // Aumenta el contador de números negativos
        }

        scanner.close(); // Cierra el scanner para liberar recursos
        System.out.println("Cantidad de números negativos ingresados: " + contador);
    }
}
