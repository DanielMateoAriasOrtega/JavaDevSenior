public class Exercise20 {
    public static void main(String[] args) {

        /*
         * Ejercicio 20 - Tablero de Ajedrez Realice un programa que genere el tablero
         * de ajedrez en consola usando instrucciones de repetición. | B | N | B | N | B
         * | N | B | N | | N | B | N | B | N | B | N | B | | B | N | B | N | B | N | B |
         * N | | N | B | N | B | N | B | N | B | | B | N | B | N | B | N | B | N | | N |
         * B | N | B | N | B | N | B | | B | N | B | N | B | N | B | N | | N | B | N | B
         * | N | B | N | B | donde N representa al cuadro negro y B representa al cuadro
         * blanco. Tablero de ajedrez dejalo ejercicio 20
         */
        var tamaño = 8; // Tamaño del tablero (8x8)

        for (var i = 0; i < tamaño; i++) {
            for (var j = 0; j < tamaño; j++) {
                System.out.print(((i + j) % 2 == 0) ? "| B " : "| N ");
            }
            System.out.println("|"); // Cierra la fila
        }
    }
}
