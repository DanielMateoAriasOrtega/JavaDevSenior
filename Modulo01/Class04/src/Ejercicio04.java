import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
         * Ejercicio 4 - Números Primos
         * Definir el Problema:
         * Un número primo es un número entero mayor que 1 que solo es divisible por 1 y
         * por sí mismo.
         * Ejemplos de números primos: 2, 3, 5, 7, 11, 13, etc.
         * 
         * Estructura del Programa:
         * Crear un método separado que realice la verificación de si un número es
         * primo.
         * 
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese un número entero positivo.
         * 
         * Mostrar Resultados:
         * Después de verificar si el número es primo, mostrar el resultado al usuario
         * en la consola.
         * Por ejemplo:
         * 
         * Ingresa un número: 29
         * 
         * El número 29 es primo.
         * Ingresa un número: 30
         * 
         * El número 30 no es primo.
         */
        var scanner = new Scanner(System.in); // Objeto para leer datos del usuario

        // Pedir al usuario que ingrese un número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        var numero = scanner.nextInt();

        // Validar que el número sea positivo y mayor que 1
        if (numero <= 1) {
            System.out.println("El número debe ser mayor que 1.");
        } else {
            // Verificar si el número es primo e imprimir el resultado
            if (esPrimo(numero)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        }

        scanner.close(); // Cerrar scanner para evitar fugas de memoria
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n == 2)
            return true; // El 2 es el único número primo par
        if (n % 2 == 0)
            return false; // Si es par y distinto de 2, no es primo

        var raiz = (int) Math.sqrt(n); // Optimización: solo revisar hasta la raíz cuadrada
        for (var i = 3; i <= raiz; i += 2) {
            if (n % i == 0) {
                return false; // Si es divisible por otro número, no es primo
            }
        }
        return true; // Si no tiene divisores, es primo
    }
}
