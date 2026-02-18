import java.util.Scanner;
import java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args) {

        /*
         * Ejercicio 11
         * Escriba una función en la que pueda ingresar tres números enteros y
         * diferentes. Imprima estos valores en orden ascendente.
         * Por ejemplo:
         * 
         * Input : 3 , 100 , 1
         * Output : 13100
         * Tenga en cuenta que la respuesta es un texto. Los números los puede
         * concatenar.
         */

        var scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario

        // Solicita al usuario que ingrese tres números enteros diferentes
        System.out.print("Ingrese tres números enteros diferentes: ");
        var numeros = new int[] { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };

        Arrays.sort(numeros); // Ordena el array en orden ascendente

        // Concatena los números en orden y los imprime como un solo texto
        System.out.println("Salida: " + numeros[0] + "" + numeros[1] + "" + numeros[2]);

        scanner.close(); // Cierra el scanner para liberar recursos
    }
}
