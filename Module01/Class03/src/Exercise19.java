import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        /*
         * Ejercicio 19 - La sucesión de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21...
         * Esta sucesión comienza con los números 0 y 1. El siguiente miembro se calcula
         * como la suma de los dos inmediatamente anteriores.
         * Crea un programa reciba un número (N) del usuario y muestre los primeros N
         * números de sucesión.
         */
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N para la sucesión de Fibonacci: ");
        var N = scanner.nextInt();

        // Validación de entrada
        if (N <= 0) {
            System.out.println("Por favor, ingrese un número mayor a 0.");
        } else {
            var a = 0;
            var b = 1;

            System.out.print("Sucesión de Fibonacci: ");
            for (var i = 0; i < N; i++) {
                System.out.print(a + (i < N - 1 ? ", " : "\n"));
                var temp = a + b;
                a = b;
                b = temp;
            }
        }
        scanner.close();
    }
}
