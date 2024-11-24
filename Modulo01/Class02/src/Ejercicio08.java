// Ejercicio 8: Área y Perímetro de un Rectángulo
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la longitud del rectángulo: ");
        double longitud = sc.nextDouble();
        
        System.out.print("Ingresa el ancho del rectángulo: ");
        double ancho = sc.nextDouble();
        
        double area = longitud * ancho;
        double perimetro = 2 * (longitud + ancho);
        
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        sc.close();
    }
}
