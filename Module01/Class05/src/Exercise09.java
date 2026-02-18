import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Ejercicio 9 - Simulación de una cola de clientes en un banco.
 * Desarrolla un programa que simule la llegada y atención de clientes en un
 * banco. El programa debe permitir agregar clientes a la cola cuando llegan y
 * eliminar clientes de la cola cuando son atendidos, mostrando siempre el
 * estado actual de la cola.
 */
public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> bankQueue = new LinkedList<>();
        int option;

        do {
            System.out.println("\n=== Banco: Gestión de Clientes ===");
            System.out.println("1. Agregar cliente a la cola");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar estado de la cola");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    bankQueue.add(cliente);
                    System.out.println(cliente + " ha sido agregado a la cola.");
                    break;
                case 2:
                    if (!bankQueue.isEmpty()) {
                        System.out.println("Atendiendo a " + bankQueue.poll());
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 3:
                    System.out.println("Clientes en la cola: " + bankQueue);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (option != 4);

        scanner.close();
    }
}
