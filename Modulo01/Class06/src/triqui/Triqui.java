package triqui;

import java.util.Scanner;

public class Triqui {
    public static void starGame() {
        // 1. Identificar el primer jugador X o O
        // 2. Inicializar y mostrar el tablero
        // 3. Leer el movimiento del jugador
        // 4. Verificar si hizo 3 en línea
        // Si lo hizo, diga gano
        // Sino
        // Cambiar jugador
        // Volver a 3
        var sc = new Scanner(System.in);

        var player = 'X';
        playGame(sc, player);
        sc.close();
    }

    private static void playGame(Scanner sc, char player) {
        var isFinished = false;
        var counter = 0;
        var board = inizializeBoard();
        do {
            showBoard(board);

            System.out.printf("Jugador %c ingresa tu movimiento: %n ", player);
            System.out.println("Ingresa la fila: (1-3) ");
            var row = sc.nextInt() -1;
            System.out.println("Ingresa la columna: (1-3) ");
            var column = sc.nextInt() -1;

            if (makeMove(board, row, column, player)) {
                counter++;
                if (checkWinnner(board, player)) {
                    showBoard(board); // (0, 0, 0, 0)
                    System.out.println("Gano el jugador " + player);
                    // Terminar el programa
                    isFinished = true;
                } else {
                    player = player == 'X' ? 'O' : 'X';
                }
            } else {
                System.err.println("Movimiento no valido");
            }
            if (counter == 9) {
                showBoard(board);
                System.out.println("Empate");
                isFinished = true;
            }
        } while (!isFinished);
    }

    private static boolean checkWinnner(char[][] board, char player) {
        // Validar filas
        for (var row : board) {
            if (row[0] == player && row[1] == player && row[2] == player) {
                return true;
            }
        }
        // Validar columnas
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // Validar diagonales
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static boolean makeMove(char[][] board, int row, int column, char player) {
        if (board[row][column] != ' ') {
            // Ya hay un valor en esta posicion
            return false;
        }
        board[row][column] = player;
        return true;
    }

    private static void showBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print("|");

                }
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("---------");
            }
        }
    }

    private static char[][] inizializeBoard() {
        var board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        return board;
    }
}
