import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // Scanner para leer entrada del usuario

        System.out.print("Ingrese el peso de la sandía en kg: ");
        var peso = scanner.nextInt(); // Leer el peso de la sandía

        // Verifica si el peso es par y mayor a 2, ya que 2 no puede dividirse en dos partes pares
        System.out.println((peso > 2 && peso % 2 == 0) ? "SI" : "NO");

        scanner.close(); // Cierra el scanner para liberar recursos
    }
}
