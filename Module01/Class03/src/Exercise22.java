import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {

        /*
         * Ejercicio 22 - Piedra, Papel y Tijera
         * Realizar un programa que permita controlar el juego de piedra, papel, tijera
         * introduciendo P para piedra, L para papel y T para tijera por cada jugador.
         * El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
         * de cada ronda preguntar si desea volver a jugar.
         */
        Scanner scanner = new Scanner(System.in);
        String jugarDeNuevo;

        do {
            // Solicitar jugadas
            System.out.print("Jugador 1 (P: Piedra, L: Papel, T: Tijera): ");
            var jugador1 = scanner.next().toUpperCase();
            System.out.print("Jugador 2 (P: Piedra, L: Papel, T: Tijera): ");
            var jugador2 = scanner.next().toUpperCase();

            // Determinar ganador
            if (jugador1.equals(jugador2)) {
                System.out.println("Empate!");
            } else if ((jugador1.equals("P") && jugador2.equals("T")) ||
                    (jugador1.equals("L") && jugador2.equals("P")) ||
                    (jugador1.equals("T") && jugador2.equals("L"))) {
                System.out.println("¡Jugador 1 gana!");
            } else {
                System.out.println("¡Jugador 2 gana!");
            }

            // Preguntar si desean jugar otra ronda
            System.out.print("¿Desean jugar otra ronda? (S/N): ");
            jugarDeNuevo = scanner.next().toUpperCase();

        } while (jugarDeNuevo.equals("S"));

        scanner.close();
        System.out.println("¡Gracias por jugar!");
    }
}
