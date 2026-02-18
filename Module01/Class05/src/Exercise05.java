import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Ejercicio 5 - Gestión de una cola de impresión
 * Desarrolla un programa que gestione una cola de documentos para imprimir.
 * El programa debe permitir agregar documentos a la cola, eliminar el documento
 * que se está imprimiendo actualmente y mostrar todos los documentos en la cola
 * en el orden en que fueron agregados.
 */
public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> printQueue = new LinkedList<>(); // Cola para almacenar los documentos
        int option;

        do {
            // Mostrar menú de opciones
            System.out.println("\nGestión de Cola de Impresión");
            System.out.println("1. Agregar documento");
            System.out.println("2. Imprimir documento (eliminar de la cola)");
            System.out.println("3. Mostrar documentos en la cola");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del documento: ");
                    String document = scanner.nextLine();
                    printQueue.add(document);
                    System.out.println("Documento agregado a la cola.");
                    break;
                case 2:
                    if (!printQueue.isEmpty()) {
                        System.out.println("Imprimiendo: " + printQueue.poll()); // Eliminar primer documento
                    } else {
                        System.out.println("No hay documentos en la cola.");
                    }
                    break;
                case 3:
                    if (printQueue.isEmpty()) {
                        System.out.println("La cola de impresión está vacía.");
                    } else {
                        System.out.println("Documentos en la cola: " + printQueue);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (option != 4);

        scanner.close(); // Cerrar scanner para liberar recursos
    }
}
