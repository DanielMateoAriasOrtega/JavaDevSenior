import java.util.Scanner;

public class Exercise03 {
    /*
     * Ejercicio 3
     * Escriba un programa que permita ingresar un número e identificar si es par o
     * impar.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        scanner.close();
    }
}
