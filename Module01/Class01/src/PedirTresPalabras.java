import java.util.Scanner;

public class PedirTresPalabras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar tres palabras al usuario
        System.out.print("Introduzca palabra 1: ");
        String palabra1 = entrada.nextLine();

        System.out.print("Introduzca palabra 2: ");
        String palabra2 = entrada.nextLine();

        System.out.print("Introduzca palabra 3: ");
        String palabra3 = entrada.nextLine();

        // Imprimir las tres palabras juntas
        System.out.println(palabra1 + " " + palabra2 + " " + palabra3);

        entrada.close();
    }
}
