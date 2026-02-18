import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        /*
         * Ejercicio 1
         * Escriba un programa que permita ingresar un número real e identifique si el
         * número es negativo, positivo o cero.
         */
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.print("Ingrese un número real: ");
        double num = scanner.nextDouble();

        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }

        scanner.close(); // Cerrar el scanner para evitar fugas de memoria
    }
}
