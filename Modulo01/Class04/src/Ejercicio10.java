import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
         * Ejercicio 10 - Generación de Tablas de Multiplicar
         * Definir el Problema:
         * Necesitamos generar la tabla de multiplicar de un número dado por el usuario,
         * mostrando los resultados desde 1 hasta 10.
         * 
         * Estructura del Programa:
         * Crear un método separado que genere y muestre la tabla de multiplicar.
         * Usa printf para formatear la salida del programa.
         * 
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese el número para el cual desea generar la tabla de
         * multiplicar.
         * 
         * Mostrar Resultados:
         * Después de generar la tabla de multiplicar, mostrar los resultados al usuario
         * en la consola.
         * Por ejemplo::
         * 
         * Ingrese el número para generar la tabla: 15
         * 
         * 15 x 1 = 15
         * 15 x 2 = 30
         * ...
         * 15 x 10 = 150
         * Generación de Tablas de Multiplicar: Crea un método que genere la tabla de
         * multiplicar de un número dado.
         */
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese el número para generar la tabla: ");
        var numero = scanner.nextInt();

        generarTablaMultiplicar(numero);

        scanner.close(); // Cerrar scanner
    }

    // Método para generar y mostrar la tabla de multiplicar
    public static void generarTablaMultiplicar(int numero) {
        System.out.println("\nTabla de multiplicar del " + numero + ":");
        for (var i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}
