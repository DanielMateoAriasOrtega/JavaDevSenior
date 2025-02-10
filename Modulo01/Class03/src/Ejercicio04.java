import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
         * Ejercicio 4
         * Escriba un programa que permita ingresar una letra e identifique si la letra
         * es mayúscula o minúscula. con comnetarios
         */
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una letra
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0); // Captura el primer carácter ingresado

        // Verificar si la letra es mayúscula o minúscula
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra ingresada es mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra ingresada es minúscula.");
        } else {
            System.out.println("No ingresó una letra válida.");
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
