import java.util.Random;

public class Exercise18 {
    public static void main(String[] args) {
        /*
         * Ejercicio 18
         * Escriba un programa que genere 120 números aleatorios entre -100 y 100.
         * Imprime los siguientes cálculos:
         * 
         * Sumar los valores positivos.
         * Sumar los valores negativos.
         * Calcule la media de los números negativos.
         * Calcule la media de los números positivos.
         * Cuente la cantidad de ceros.
         */
        var random = new Random();
        var sumaPositivos = 0;
        var sumaNegativos = 0;
        var contadorPositivos = 0;
        var contadorNegativos = 0;
        var contadorCeros = 0;

        // Generamos 120 números aleatorios entre -100 y 100
        for (var i = 0; i < 120; i++) {
            var numero = random.nextInt(201) - 100; // Genera valores entre -100 y 100

            if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Calculamos las medias evitando división por cero
        var mediaPositivos = (contadorPositivos > 0) ? (double) sumaPositivos / contadorPositivos : 0;
        var mediaNegativos = (contadorNegativos > 0) ? (double) sumaNegativos / contadorNegativos : 0;

        // Imprimimos los resultados
        System.out.println("Suma de valores positivos: " + sumaPositivos);
        System.out.println("Suma de valores negativos: " + sumaNegativos);
        System.out.println("Media de valores positivos: " + mediaPositivos);
        System.out.println("Media de valores negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + contadorCeros);
    }
}
