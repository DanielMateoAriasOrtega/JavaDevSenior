import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de años: ");
        var edad = scanner.nextInt();

        var etapa = (edad < 0) ? "Edad no válida" :
                    (edad <= 5) ? "Primera infancia" :
                    (edad <= 11) ? "Infancia" :
                    (edad <= 18) ? "Adolescencia" :
                    (edad <= 26) ? "Juventud" :
                    (edad <= 59) ? "Adultez" : "Persona mayor";

        System.out.println("Etapa: " + etapa);

        scanner.close();
    }
}
