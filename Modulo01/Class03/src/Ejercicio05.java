import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una letra
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().toLowerCase().charAt(0); // Convertir a minúscula para evitar diferencias entre mayúsculas y minúsculas

        // Verificar si es una letra del alfabeto
        if (Character.isLetter(letra)) {
            // Comprobar si es una vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La letra ingresada es una vocal.");
            } else {
                System.out.println("La letra ingresada es una consonante.");
            }
        } else {
            System.out.println("No ingresó una letra válida.");
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
