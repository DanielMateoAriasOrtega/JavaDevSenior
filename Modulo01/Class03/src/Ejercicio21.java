import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        /*
         * Ejercicio 21
         * Realizar un programa que permita hacer la siguiente conversión:
         * 
         * Millas a kilómetros.
         * Kilómetros a millas.
         * Considera que
         * 
         * 1 milla son 1.60934 kilómetros
         * 1 kilómetro es 0.621371 millas
         */
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir millas a kilómetros");
            System.out.println("2. Convertir kilómetros a millas");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            var opcion = scanner.nextInt();

            if (opcion == 3) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingrese la distancia: ");
            var distancia = scanner.nextDouble();

            var resultado = (opcion == 1)
                    ? distancia * 1.60934 // Millas a kilómetros
                    : distancia * 0.621371; // Kilómetros a millas

            System.out.printf("Resultado: %.4f\n\n", resultado);
        }
        scanner.close();
    }
}
