import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
         * Ejercicio 3 - Cálculo de Factorial
         * Definir el Problema:
         * El factorial de un número entero positivo n (denotado como n!) es el producto
         * de todos los enteros positivos desde 1 hasta n.
         * Por ejemplo:
         * 
         * 3! = 3 * 2 * 1 = 6
         * 5! = 5 * 4 * 3 * 2 * 1 = 120
         * Estructura del Programa:
         * Crear un método separado que realice el cálculo del factorial.
         * 
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese un número entero positivo.
         * 
         * Mostrar Resultados:
         * Después de calcular el factorial, mostrar el resultado al usuario en la
         * consola.
         */
        var scanner = new Scanner(System.in); // Objeto para leer datos del usuario

        // Pedir al usuario que ingrese un número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        var numero = scanner.nextInt();

        // Validar que el número sea positivo
        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            // Calcular e imprimir el factorial
            System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));
        }

        scanner.close(); // Cerrar scanner para evitar fugas de memoria
    }

    // Método para calcular el factorial de un número
    public static long calcularFactorial(int n) {
        var factorial = 1L; // Usamos long para manejar números grandes
        for (var i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
