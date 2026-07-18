import java.util.HashSet;
import java.util.Scanner;

/**
 * Ejercicio 8 - Encontrar elementos únicos en una lista de números.
 * Crea un programa que encuentre todos los elementos únicos en una lista de
 * números. El programa debe leer una lista de números que puede contener
 * duplicados y utilizar una estructura de datos adecuada para identificar y
 * mostrar los números únicos.
 */
public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        HashSet<Integer> duplicateNumbers = new HashSet<>();

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (!uniqueNumbers.add(num)) {
                duplicateNumbers.add(num);
            }
        }

        uniqueNumbers.removeAll(duplicateNumbers);

        System.out.println("Números únicos en la lista:");
        for (int num : uniqueNumbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}
