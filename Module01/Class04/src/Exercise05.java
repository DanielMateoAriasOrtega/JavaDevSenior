import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        /*
         * Ejercicio 5 - Cálculo de Promedio de tres números
         * Definir el Problema:
         * El promedio de tres números se calcula sumando los tres números y dividiendo
         * el resultado entre 3.
         * 
         * Estructura del Programa:
         * Crear un método separado que realice el cálculo del promedio.
         * 
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese tres números.
         * 
         * Mostrar Resultados:
         * Después de calcular el promedio, mostrar el resultado al usuario en la
         * consola.
         * Por ejemplo:
         * 
         * Ingresa el primer número: 10
         * Ingresa el segundo número: 20
         * Ingresa el tercer número: 30
         * 
         * El promedio de los tres números es: 20.0
         * Ingresa el primer número: 5
         * Ingresa el segundo número: 15
         * Ingresa el tercer número: 25
         * 
         * El promedio de los tres números es: 15.0
         */
        var scanner = new Scanner(System.in); // Objeto para leer datos del usuario

        // Pedir al usuario que ingrese tres números
        System.out.print("Ingresa el primer número: ");
        var num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        var num2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        var num3 = scanner.nextDouble();

        // Calcular el promedio usando el método separado
        var promedio = calcularPromedio(num1, num2, num3);

        // Mostrar el resultado
        System.out.println("El promedio de los tres números es: " + promedio);

        scanner.close(); // Cerrar scanner para evitar fugas de memoria
    }

    // Método para calcular el promedio de tres números
    public static double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
