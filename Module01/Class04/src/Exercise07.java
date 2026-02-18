import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        /*
         * Ejercicio 7 - Cálculo de Potencias
         * Definir el Problema:
         * Necesitamos calcular la potencia de un número dado una base y un exponente.
         * La fórmula general es resultado = base ^ exponente.
         * Esto significa que hay que multiplicar la base por si mismo exponente veces.
         * Por ejemplo:
         * 
         * 2 ^ 4 = 2 * 2 * 2 * 2 = 16
         * 5 ^ 2 = 5 * 5 = 25
         * 27 ^ 1 = 27
         * 325 ^ 0 = 1
         * Recuerda que si el exponente es 0, la potencia es igual a 1.
         * 
         * Estructura del Programa:
         * Crear un método separado que realice el cálculo de la potencia.
         * 
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese la base y el exponente.
         * 
         * Mostrar Resultados:
         * Después de calcular la potencia, mostrar el resultado al usuario en la
         * consola.
         */
        var scanner = new Scanner(System.in);

        // Pedir al usuario la base y el exponente
        System.out.print("Ingrese la base: ");
        var base = scanner.nextDouble();

        System.out.print("Ingrese el exponente: ");
        var exponente = scanner.nextInt(); // Exponente entero

        // Calcular la potencia
        var resultado = calcularPotencia(base, exponente);

        // Mostrar resultado
        System.out.println(base + " ^ " + exponente + " = " + resultado);

        scanner.close(); // Cerrar scanner
    }

    // Método para calcular la potencia
    public static double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente); // Uso de Math.pow para optimizar
    }
}
