import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        /*
         * Ejercicio 11 - Cálculo de Índice de Masa Corporal
         * Definir el Problema:
         * El Índice de Masa Corporal (IMC) es una medida que se utiliza para determinar
         * si una persona tiene un peso saludable en relación con su altura.
         * La fórmula para calcular el IMC es: IMC = (peso_kg / altura_m) ^ 2.
         * 
         * Categorías del IMC:
         * Bajo peso: IMC < 18.5
         * Peso normal: IMC entre 18.5 y 24.9
         * Sobrepeso: IMC entre 25 y 29.9
         * Obesidad:
         * Grado I: IMC entre 30 y 34.9
         * Grado II: IMC entre 35 y 39.9
         * Grado III: IMC ≥ 401
         * Estructura del Programa:
         * Crear un método separado que realice el cálculo del IMC.
         * Crear un método separado que determine la categoría del IMC basado en el
         * valor calculado.
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese su peso en kilogramos y su altura en metros.
         * 
         * Mostrar Resultados:
         * Después de calcular el IMC y determinar la categoría, mostrar los resultados
         * al usuario en la consola.
         * Por ejemplo:
         * 
         * Ingresa tu peso en kilogramos: 70
         * Ingresa tu altura en metros: 1.75
         * 
         * Tu IMC es: 22.86
         * Categoría: Peso normal
         * Ingresa tu peso en kilogramos: 85
         * Ingresa tu altura en metros: 1.60
         * 
         * Tu IMC es: 33.20
         * Categoría: Obesidad grado I
         */
        var scanner = new Scanner(System.in);

        // Solicitar peso y altura al usuario
        System.out.print("Ingresa tu peso en kilogramos: ");
        var peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        var altura = scanner.nextDouble();

        // Calcular IMC
        var imc = calcularIMC(peso, altura);
        var categoria = determinarCategoriaIMC(imc);

        // Mostrar resultados
        System.out.printf("\nTu IMC es: %.2f%n", imc);
        System.out.println("Categoría: " + categoria);

        scanner.close(); // Cerrar scanner
    }

    // Método para calcular el IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }

    // Método para determinar la categoría del IMC
    public static String determinarCategoriaIMC(double imc) {
        if (imc < 18.5)
            return "Bajo peso";
        if (imc < 25)
            return "Peso normal";
        if (imc < 30)
            return "Sobrepeso";
        if (imc < 35)
            return "Obesidad grado I";
        if (imc < 40)
            return "Obesidad grado II";
        return "Obesidad grado III";
    }
}
