import java.util.Scanner;

/* 
    Ejercicio 2 - Matriz de Rotación
    Escribe un programa que tome una matriz cuadrada (array bidimensional)
    y la rote 90 grados en el sentido de las agujas del reloj.
    Pide al usuario el el tamaño de la dimensión de la matriz 
    (ten en cuenta que si el usuario ingresa el valor 3, la matriz será de 3 x 3).
    Todos los valores del contenido de la matriz, los cuales deben ser leídos
    por teclado con los valores ingresados por el usuario.

    Por ejemplo, si la matriz de entrada es:

    1  2  3
    4  5  6
    7  8  9
    La matriz rotada debe ser:

    7  4  1
    8  5  2
    9  6  3 
*/

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        // Llenar la matriz con datos ingresados por el usuario
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Rotar la matriz 90 grados en sentido horario
        int[][] matrizRotada = rotarMatriz(matriz);

        // Imprimir la matriz rotada
        System.out.println("Matriz rotada 90 grados:");
        imprimirMatriz(matrizRotada);

        scanner.close();
    }

    // Método para rotar la matriz 90 grados en sentido horario
    private static int[][] rotarMatriz(int[][] matriz) {
        int n = matriz.length;
        int[][] rotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotada[j][n - 1 - i] = matriz[i][j];
            }
        }
        return rotada;
    }

    // Método para imprimir la matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
