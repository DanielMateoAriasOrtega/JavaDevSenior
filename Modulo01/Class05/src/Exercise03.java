import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 3 - Gestión de una lista de tareas pendientes.
 * Desarrolla un programa que gestione una lista de tareas pendientes.
 * El programa debe permitir agregar nuevas tareas, eliminar tareas completadas
 * y mostrar todas las tareas pendientes en el orden en que fueron agregadas.
 * Además, debe permitir acceder a una tarea específica por su posición en la
 * lista.
 */

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n=== Lista de Tareas Pendientes ===");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Eliminar tarea completada");
            System.out.println("3. Mostrar todas las tareas");
            System.out.println("4. Ver tarea específica");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    tareas.add(nuevaTarea);
                    System.out.println("Tarea agregada.");
                    break;
                case 2:
                    System.out.print("Ingrese el número de la tarea a eliminar: ");
                    int indexEliminar = scanner.nextInt();
                    if (indexEliminar >= 1 && indexEliminar <= tareas.size()) {
                        tareas.remove(indexEliminar - 1);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Número de tarea inválido.");
                    }
                    break;
                case 3:
                    System.out.println("\nLista de tareas pendientes:");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el número de la tarea que desea ver: ");
                    int indexVer = scanner.nextInt();
                    if (indexVer >= 1 && indexVer <= tareas.size()) {
                        System.out.println("Tarea " + indexVer + ": " + tareas.get(indexVer - 1));
                    } else {
                        System.out.println("Número de tarea inválido.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
