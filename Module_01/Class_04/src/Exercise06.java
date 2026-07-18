import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        /*
         * Ejercicio 6 - Conversión de Unidades
         * Definir el Problema:
         * Necesitamos convertir unidades de longitud (metros a kilómetros y viceversa)
         * y unidades de masa (gramos a kilogramos y viceversa).
         * 
         * Estructura del Programa:
         * Crear métodos separados para cada tipo de conversión (metros a kilómetros,
         * kilómetros a metros, gramos a kilogramos, kilogramos a gramos).
         * 
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese el valor y el tipo de conversión que desea
         * realizar.
         * 
         * Mostrar Resultados:
         * Después de realizar la conversión, mostrar el resultado al usuario en la
         * consola.
         */
        var scanner = new Scanner(System.in);

        while (true) {
            // Mostrar opciones al usuario
            System.out.println("\nSeleccione la conversión:");
            System.out.println("1. Metros a Kilómetros");
            System.out.println("2. Kilómetros a Metros");
            System.out.println("3. Gramos a Kilogramos");
            System.out.println("4. Kilogramos a Gramos");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");

            var opcion = scanner.nextInt();

            // Salir del programa si el usuario elige 5
            if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }

            // Pedir el valor a convertir
            System.out.print("Ingrese el valor a convertir: ");
            var valor = scanner.nextDouble();
            var resultado = 0.0;

            // Realizar la conversión según la opción elegida
            switch (opcion) {
                case 1 -> resultado = metrosAKilometros(valor);
                case 2 -> resultado = kilometrosAMetros(valor);
                case 3 -> resultado = gramosAKilogramos(valor);
                case 4 -> resultado = kilogramosAGramos(valor);
                default -> {
                    System.out.println("Opción no válida.");
                    continue;
                }
            }

            // Mostrar resultado
            System.out.println("Resultado: " + resultado);
        }

        scanner.close(); // Cerrar scanner
    }

    // Métodos de conversión
    public static double metrosAKilometros(double metros) {
        return metros / 1000;
    }

    public static double kilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }

    public static double gramosAKilogramos(double gramos) {
        return gramos / 1000;
    }

    public static double kilogramosAGramos(double kilogramos) {
        return kilogramos * 1000;
    }
}
