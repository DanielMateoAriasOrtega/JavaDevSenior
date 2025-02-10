import java.util.Scanner;

public class Ejercicio14 {

    /*
     * Realice un programa en el que ingrese un número y muestre elcubo.Repita el
     * proceso hasta que se introduzca un valor negativo.
    */

    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // Scanner para leer entrada del usuario

        while (true) { // Bucle infinito, se rompe cuando el usuario ingresa un número negativo
            System.out.print("Ingrese un número (negativo para salir): ");
            var numero = scanner.nextInt();

            if (numero < 0)
                break; // Si el número es negativo, se detiene el programa

            System.out.println("El cubo de " + numero + " es: " + (numero * numero * numero));
        }

        scanner.close(); // Cierra el scanner para liberar recursos
        System.out.println("Programa finalizado.");
    }
}
