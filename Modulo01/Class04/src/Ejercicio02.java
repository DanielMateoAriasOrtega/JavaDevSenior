import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
         * Ejercicio 2 - Verificación de Palíndromos
         * Definir el Problema:
         * Un palíndromo es una palabra, frase o secuencia de caracteres que se lee
         * igual de izquierda a derecha que de derecha a izquierda, ignorando espacios,
         * puntuación y mayúsculas.
         * Ejemplos:
         * 
         * radar
         * anilina
         * A man, a plan, a canal, Panama
         * Estructura del Programa:
         * Crear un método separado que realice la verificación de si una cadena es un
         * palíndromo.
         * 
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese una cadena de texto.
         * 
         * Mostrar Resultados:
         * Después de verificar si la cadena es un palíndromo, mostrar el resultado al
         * usuario en la consola.
         * Por ejemplo:
         * 
         * Ingresa una cadena de texto: A man, a plan, a canal, Panama
         * 
         * La cadena es un palíndromo.
         * Ingresa una cadena de texto: Hola
         * 
         * La cadena no es un palíndromo.
         */
        var scanner = new Scanner(System.in); // Objeto para leer datos del usuario

        // Pedir al usuario que ingrese una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        var texto = scanner.nextLine();

        // Verificar si es un palíndromo e imprimir el resultado
        if (esPalindromo(texto)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        scanner.close(); // Cerrar scanner para evitar fugas de memoria
    }

    // Método para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String texto) {
        
        // Convertir a minúsculas, eliminar espacios y caracteres no alfabéticos
        var textoLimpio = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Comparar si el texto es igual a su versión invertida
        var textoInvertido = new StringBuilder(textoLimpio).reverse().toString();

        return textoLimpio.equals(textoInvertido);
    }
}
