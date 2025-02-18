import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        showMenu(scanner);
        scanner.close();
    }

    private static void showMenu(Scanner scanner) {
        int option;
        do {
            System.out.println("=======================");
            System.out.println("Menu de opciones: ");
            System.out.println("=======================");
            System.out.println("1. While");
            System.out.println("2. Do While");
            System.out.println("3. For");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    whileTest();
                    break;
                case 2:
                    doWhileTest();
                    break;
                case 3:
                    forTest();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.err.println("Opcion no valida");
                    break;
            }
            if (option != 4) {
                pressEnter(scanner);
            }
        } while (option != 4);
    }

    private static void pressEnter(Scanner scanner) {
        System.out.println("Presiona enter para continuar...");
        scanner.nextLine();
    }

    private static void forTest() {
        for (int i = 0; i < 10; i += 3) {
            System.out.println(--i);
        }
        System.out.println("You Win");
    }

    private static void doWhileTest() {
        var counter = 0;
        do {
            System.out.println(counter);

            // // Actualizacion
            counter--;
        } while (counter > 0);
        System.out.println("Boom!!!");
    }

    private static void whileTest() {
        var counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }
}
