import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        /*Ejercicio 1 - Conversión de Temperaturas
Definir el Problema:
Necesitamos convertir temperaturas de Celsius a Fahrenheit y viceversa.
Operaciones para las conversiones:

Celsius a Fahrenheit: La fórmula es F = (C * (9 / 5)) + 32.
Fahrenheit a Celsius: La fórmula es C = (F - 32) / (9 / 5).
Estructura del Programa:
Crear métodos separados para cada conversión.

Interacción con el Usuario:
Pedir al usuario que ingrese la temperatura y el tipo de conversión que desea realizar.

Mostrar Resultados:
Mostrar el resultado de la conversión.
Por ejemplo:

temperatura en Celsius: 25

La temperatura en Fahrenheit es: 77.0
Ingresa la temperatura en Fahrenheit: 77

La temperatura en Celsius es: 25.0 */
        var scanner = new Scanner(System.in); // Objeto para leer datos del usuario

        // Pedir al usuario la temperatura
        System.out.print("Ingrese la temperatura: ");
        var temperatura = scanner.nextDouble();

        // Pedir el tipo de conversión
        System.out.print("Convertir a (C para Celsius, F para Fahrenheit): ");
        var opcion = scanner.next().toUpperCase(); // Convertimos a mayúscula para evitar errores

        // Realizar la conversión según la opción ingresada
        if (opcion.equals("F")) {
            System.out.println("La temperatura en Fahrenheit es: " + convertirACelsius(temperatura));
        } else if (opcion.equals("C")) {
            System.out.println("La temperatura en Celsius es: " + convertirAFahrenheit(temperatura));
        } else {
            System.out.println("Opción inválida. Use 'C' o 'F'.");
        }

        scanner.close(); // Cerrar scanner para evitar fugas de memoria
    }

// Método para convertir Celsius a Fahrenheit
public static double convertirAFahrenheit(double celsius) {
