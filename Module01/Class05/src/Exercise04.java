import java.util.HashSet;
import java.util.Scanner;

/**
 * Ejercicio 4 - Verificación de duplicados en una lista de correos
 * electrónicos.
 * Escribe un programa que verifique si hay correos electrónicos duplicados en
 * una lista.
 * El programa debe leer una lista de correos electrónicos y utilizar una
 * estructura de datos adecuada para identificar y reportar cualquier duplicado
 * encontrado.
 */
public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> emailSet = new HashSet<>(); // Conjunto para almacenar correos únicos
        boolean hasDuplicates = false; // Bandera para verificar duplicados

        // Solicitar la cantidad de correos electrónicos
        System.out.print("Ingrese la cantidad de correos electrónicos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt

        System.out.println("Ingrese los correos electrónicos:");
        for (int i = 0; i < n; i++) {
            String email = scanner.nextLine(); // Leer el correo ingresado por el usuario

            // Verificar si el correo ya está en el conjunto
            if (!emailSet.add(email)) {
                System.out.println("Duplicado encontrado: " + email);
                hasDuplicates = true;
            }
        }

        // Mensaje si no se encontraron duplicados
        if (!hasDuplicates) {
            System.out.println("No se encontraron correos electrónicos duplicados.");
        }

        scanner.close(); // Cerrar el scanner para liberar recursos
    }
}
