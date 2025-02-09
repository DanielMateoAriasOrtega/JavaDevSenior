import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
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
