import java.util.Scanner;

public class Exercise08 {
    /*
     * Ejercicio 8
     * Escriba un programa que permita ingresar un número (va a representar la
     * cantidad de años) y de como respuesta la etapa en la que se encuentra la
     * persona de acuerdo con la siguiente tabla.
     * 
     * Años Etapas
     * 0 - 5 Primera infancia
     * 6 - 11 Infancia
     * 12 - 18 Adolescencia
     * 19 - 26 Juventud
     * 27 - 59 Adultez
     * > 59 Persona mayor
     */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de años: ");
        var edad = scanner.nextInt();

        var etapa = (edad < 0) ? "Edad no válida"
                : (edad <= 5) ? "Primera infancia"
                        : (edad <= 11) ? "Infancia"
                                : (edad <= 18) ? "Adolescencia"
                                        : (edad <= 26) ? "Juventud" : (edad <= 59) ? "Adultez" : "Persona mayor";

        System.out.println("Etapa: " + etapa);

        scanner.close();
    }
}
