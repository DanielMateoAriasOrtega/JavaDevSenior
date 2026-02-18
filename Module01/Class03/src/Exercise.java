import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        /*
         * Tres hermanos acuerdan reunirse. Los hermanos son identificados por los
         * siguientes números: 1 para el mayor, 2 para el del medio y 3 para el menor.
         * Cuando llega la hora de la reunión, uno de los hermanos va tarde. Dados los
         * números de los hermanos que llegan a tiempo, determine el número del hermano
         * que llegará tarde.
         * Por ejemplo:
         * 
         * Input : 1 2
         * Output : 3
         * El tercer hermano es el el que llegara a la reunión tarde./*
        */

        var scanner = new Scanner(System.in); // Scanner para leer entrada del usuario

        System.out.print("Ingrese los dos hermanos que llegaron a tiempo (1-3): ");
        var hermano1 = scanner.nextInt();
        var hermano2 = scanner.nextInt();

        // La suma total de los tres hermanos es 6 (1+2+3). Restamos los presentes para
        // encontrar el que falta.
        var hermanoTarde = 6 - (hermano1 + hermano2);

        System.out.println("El hermano que llegará tarde es: " + hermanoTarde);

        scanner.close(); // Cierra el scanner para liberar recursos
    }
}
