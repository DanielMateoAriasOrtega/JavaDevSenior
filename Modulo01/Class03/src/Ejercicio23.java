import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        /*
         * Ejercicio 23 - Imprimir diamante - Version 2
         * Realizar un programa que imprima un diamante usando caracteres de texto. El
         * programa debe pedir al usuario el tamaño del diamante, el cual debe ser un
         * número entero positivo impar. Ej:
         * 
         * Si tamaño es: 3
         *
         ***
         *
         * Si tamaño es: 7
         *
         ***
         *****
         *******
         *****
         ***
         *
         * Ten en cuenta que la linea de asteriscos (*) de la fila central es la mas
         * grande y debe estar alineada a la parte izquierda de la pantalla y debe tener
         * del tamaño del número dado. El resto de las lineas deben quedar los
         * asteriscos centrados teniendo como base la linea central. En caso de que el
         * número ingresado no sea válido, se le debe informar el usuario el caso que no
         * está cumpliendo.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del diamante (número entero positivo impar): ");
        var n = scanner.nextInt();

        // Validar si el número ingresado es positivo e impar
        if (n <= 0 || n % 2 == 0) {
            System.out.println("El número debe ser positivo e impar.");
        } else {
            int mitad = n / 2;

            // Imprimir la parte superior del diamante
            for (int i = 0; i <= mitad; i++) {
                System.out.println(" ".repeat(mitad - i) + "*".repeat(2 * i + 1));
            }

            // Imprimir la parte inferior del diamante
            for (int i = mitad - 1; i >= 0; i--) {
                System.out.println(" ".repeat(mitad - i) + "*".repeat(2 * i + 1));
            }
        }

        scanner.close();
    }
}
