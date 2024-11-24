// Ejercicio 9: Conversión de Temperaturas
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = celsius * 9/5 + 32;
        double kelvin = celsius + 273.15;
        
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        sc.close();
    }
}
