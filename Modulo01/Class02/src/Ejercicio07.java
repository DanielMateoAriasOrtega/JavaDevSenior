// Ejercicio 7: Calculadora Básica
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN; // evitar división por cero

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("División: Error (división por cero)");
        }

        sc.close();
    }
}
