import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Ejercicio 1 - Funciones con uso de arrays
 * Escribe un programa que para un array de tamaño n (dado por el usuario) de
 * números enteros que son ingresados por teclado, realice las siguientes
 * funciones e imprime el resultado en pantalla:
 * 
 * La suma de todos los elementos.
 * Encontrar el valor máximo
 * Encontrar el valor mínimo.
 * Invertir por completo el array.
 * Ordenar el array de mayor a menor.
 * Obtener el promedio de los elementos del array.
 * Encontrar la moda (el número que mas se repite)
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Llenar el array con datos ingresados por el usuario
        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Llamar a las funciones e imprimir resultados
        System.out.println("Suma: " + suma(array));
        System.out.println("Máximo: " + maximo(array));
        System.out.println("Mínimo: " + minimo(array));
        System.out.println("Array invertido: " + Arrays.toString(invertir(array)));
        System.out.println("Array ordenado de mayor a menor: " + Arrays.toString(ordenarDescendente(array)));
        System.out.println("Promedio: " + promedio(array));
        System.out.println("Moda: " + moda(array));

        scanner.close();
    }

    /**
     * Calcula la suma de todos los elementos del array.
     * 
     * @param array El array de números enteros.
     * @return La suma total de los elementos.
     */
    private static int suma(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    /**
     * Encuentra el valor máximo en el array.
     * 
     * @param array El array de números enteros.
     * @return El valor máximo encontrado.
     */
    private static int maximo(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Encuentra el valor mínimo en el array.
     * 
     * @param array El array de números enteros.
     * @return El valor mínimo encontrado.
     */
    private static int minimo(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Invierte el orden de los elementos en el array.
     * 
     * @param array El array de números enteros.
     * @return Un nuevo array con los elementos en orden inverso.
     */
    private static int[] invertir(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }

    /**
     * Ordena el array en orden descendente (de mayor a menor).
     * 
     * @param array El array de números enteros.
     * @return Un nuevo array ordenado de mayor a menor.
     */
    private static int[] ordenarDescendente(int[] array) {
        int[] ordenado = Arrays.copyOf(array, array.length);
        Arrays.sort(ordenado);
        int[] resultado = new int[array.length];

        // Invertir el orden para que sea descendente
        for (int i = 0; i < ordenado.length; i++) {
            resultado[i] = ordenado[ordenado.length - 1 - i];
        }
        return resultado;
    }

    /**
     * Calcula el promedio de los elementos del array.
     * 
     * @param array El array de números enteros.
     * @return El valor promedio de los elementos.
     */
    private static double promedio(int[] array) {
        return (double) suma(array) / array.length;
    }

    /**
     * Encuentra la moda (el número que más se repite en el array).
     * 
     * @param array El array de números enteros.
     * @return El número que más veces aparece en el array.
     */
    private static int moda(int[] array) {
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        int moda = array[0];
        int maxFrecuencia = 1;

        // Contar la frecuencia de cada número en el array
        for (int num : array) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
            if (frecuencia.get(num) > maxFrecuencia) {
                maxFrecuencia = frecuencia.get(num);
                moda = num;
            }
        }

        return moda;
    }
}
