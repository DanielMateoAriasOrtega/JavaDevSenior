import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
         * Ejercicio 9 - Cálculo de Intereses (simple y compuesto)
         * Definir el Problema:
         * Interés Simple: El interés se calcula solo sobre el capital inicial durante
         * todo el período.
         * Interés Compuesto: El interés se calcula sobre el capital inicial más los
         * intereses acumulados en cada período.
         * Fórmulas de Cálculo:
         * Interés Simple: La fórmula es I = P * r * t, donde:
         * I es el interés.
         * P es el capital inicial.
         * r es la tasa de interés anual.
         * t es el tiempo en años.
         * Interés Compuesto: La fórmula es A = P * (1 + (r / n) ^ (n * t)), donde:
         * A es el monto total después del tiempo t.
         * P es el capital inicial.
         * r es la tasa de interés anual.
         * n es el número de veces que se aplica el interés compuesto por año.
         * t es el tiempo en años.
         * Estructura del Programa:
         * Crear métodos separados para calcular el interés simple y el interés
         * compuesto.
         * Puede utilizar la función creada en el ejercicio 7 para calcular los
         * cuadrados en las formulas.
         * 
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese el capital inicial, la tasa de interés, el
         * tiempo y, en el caso del interés compuesto, el número de veces que se aplica
         * el interés por año.
         * 
         * Mostrar Resultados:
         * Después de calcular los intereses, mostrar los resultados al usuario en la
         * consola.
         * Por ejemplo:
         * 
         * Interés Simple
         * Ingresa el monto de capital: 1000
         * Ingresa la tasa de interés anual (en porcentaje): 5
         * Ingresa el tiempo (en años): 3
         * 
         * El interés simple es: 150.0
         * Interés compuesto
         * Ingresa el monto de capital: 1000
         * Ingresa la tasa de interés anual (en porcentaje): 5
         * Ingresa el tiempo (en años): 3
         * Ingresa el número de veces que se aplica el interés por año: 4
         * 
         * El monto total después de 3 años es: 1157.6250000000002
         * El interés compuesto es: 157.62500000000023
         */
        var scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de interés a calcular:");
        System.out.println("1. Interés Simple");
        System.out.println("2. Interés Compuesto");
        System.out.print("Opción: ");
        var opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> { // Cálculo del interés simple
                System.out.print("Ingrese el monto de capital: ");
                var capital = scanner.nextDouble();
                System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
                var tasa = scanner.nextDouble() / 100; // Convertir a decimal
                System.out.print("Ingrese el tiempo (en años): ");
                var tiempo = scanner.nextDouble();

                var interesSimple = calcularInteresSimple(capital, tasa, tiempo);
                System.out.println("El interés simple es: " + interesSimple);
            }
            case 2 -> { // Cálculo del interés compuesto
                System.out.print("Ingrese el monto de capital: ");
                var capital = scanner.nextDouble();
                System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
                var tasa = scanner.nextDouble() / 100; // Convertir a decimal
                System.out.print("Ingrese el tiempo (en años): ");
                var tiempo = scanner.nextDouble();
                System.out.print("Ingrese el número de veces que se aplica el interés por año: ");
                var n = scanner.nextInt();

                var montoTotal = calcularInteresCompuesto(capital, tasa, n, tiempo);
                var interesCompuesto = montoTotal - capital;

                System.out.println("El monto total después de " + tiempo + " años es: " + montoTotal);
                System.out.println("El interés compuesto es: " + interesCompuesto);
            }
            default -> System.out.println("Opción no válida.");
        }

        scanner.close(); // Cerrar scanner
    }

    // Método para calcular el interés simple
    public static double calcularInteresSimple(double capital, double tasa, double tiempo) {
        return capital * tasa * tiempo;
    }

    // Método para calcular el monto total con interés compuesto
    public static double calcularInteresCompuesto(double capital, double tasa, int n, double tiempo) {
        return capital * Math.pow(1 + (tasa / n), n * tiempo);
    }
}
