import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // Uso de var para el Scanner
        var lados = new double[3]; // Arreglo para almacenar los lados

        // Solicitar las tres longitudes en un solo ciclo
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la longitud " + (i + 1) + ": ");
            lados[i] = scanner.nextDouble();
        }

        // Ordenar los lados para simplificar la validación
        java.util.Arrays.sort(lados);

        // Verificar si los lados pueden formar un triángulo (usando la desigualdad triangular)
        System.out.println((lados[0] + lados[1] > lados[2]) ? 
            "Las longitudes pueden formar un triángulo." : 
            "Las longitudes NO pueden formar un triángulo.");

        scanner.close(); // Cerrar el scanner
    }
}
