import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        /*
         * Ejercicio 2
         * Escriba un programa que le permita ingresar tres números e imprima en la
         * consola el más grande de ellos.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tres números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("El número más grande es: " + max);

        scanner.close();
    }
}
