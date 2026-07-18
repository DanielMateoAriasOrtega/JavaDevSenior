import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ejercicio 6 - Contar la frecuencia de palabras en un texto.
 * Escribe un programa que cuente la frecuencia de cada palabra en un texto
 * dado.
 * El programa debe leer el texto, dividirlo en palabras y utilizar una
 * estructura de datos adecuada para almacenar y contar la frecuencia de cada
 * palabra.
 * Finalmente, debe mostrar la frecuencia de cada palabra.
 */
public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un texto
        System.out.println("Ingrese un texto:");
        String text = scanner.nextLine();

        // Contar la frecuencia de palabras
        Map<String, Integer> wordCount = countWordFrequency(text);

        // Mostrar resultados
        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    /**
     * Método para contar la frecuencia de cada palabra en un texto.
     * 
     * @param text El texto ingresado por el usuario.
     * @return Un mapa con cada palabra y su respectiva frecuencia.
     */
    private static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordCount = new HashMap<>();

        // Dividir el texto en palabras usando expresiones regulares
        String[] words = text.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }
}
