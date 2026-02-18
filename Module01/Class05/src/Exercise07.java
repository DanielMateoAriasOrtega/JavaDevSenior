import java.util.LinkedList;
import java.util.Scanner;

/**
 * Ejercicio 7 - Gestión de una lista de estudiantes en un curso
 * Desarrolla un programa que gestione una lista de estudiantes inscritos en un
 * curso. El programa debe permitir agregar nuevos estudiantes, eliminar
 * estudiantes que se han dado de baja y mostrar todos los estudiantes inscritos
 * en el orden en que fueron agregados.
 */
public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> students = new LinkedList<>();
        int option;

        do {
            System.out.println("\nMenú de Gestión de Estudiantes");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar lista de estudiantes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String name = scanner.nextLine();
                    students.add(name);
                    System.out.println("Estudiante agregado con éxito.");
                    break;
                case 2:
                    if (!students.isEmpty()) {
                        System.out.print("Ingrese el nombre del estudiante a eliminar: ");
                        String removeName = scanner.nextLine();
                        if (students.remove(removeName)) {
                            System.out.println("Estudiante eliminado con éxito.");
                        } else {
                            System.out.println("El estudiante no se encuentra en la lista.");
                        }
                    } else {
                        System.out.println("No hay estudiantes en la lista para eliminar.");
                    }
                    break;
                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No hay estudiantes inscritos.");
                    } else {
                        System.out.println("Lista de estudiantes inscritos:");
                        for (String student : students) {
                            System.out.println("- " + student);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (option != 4);

        scanner.close();
    }
}
