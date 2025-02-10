import java.util.Scanner;

public class Ejercicio06 {
    /*
     * Ejercicio 6
     * Escriba un programa que permita ingresar un número y determine si es
     * divisible por dos y siete.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es divisible por 2 y por 7
        if (numero % 2 == 0 && numero % 7 == 0) {
            System.out.println("El número " + numero + " es divisible por 2 y por 7.");
        } else {
            System.out.println("El número " + numero + " no es divisible por 2 y por 7.");
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
