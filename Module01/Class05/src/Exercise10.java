import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ejercicio 10 - Almacenamiento de configuraciones de una aplicación
 * Crea un programa que gestione las configuraciones de una aplicación. El
 * programa debe permitir agregar nuevas configuraciones, actualizar
 * configuraciones existentes y mostrar todas las configuraciones almacenadas.
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> settings = new HashMap<>();
        int option;

        do {
            System.out.println("\n=== Gestión de Configuraciones ===");
            System.out.println("1. Agregar configuración");
            System.out.println("2. Actualizar configuración");
            System.out.println("3. Mostrar todas las configuraciones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre de la configuración: ");
                    String key = scanner.nextLine();
                    System.out.print("Ingrese el valor de la configuración: ");
                    String value = scanner.nextLine();
                    settings.put(key, value);
                    System.out.println("Configuración agregada correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la configuración a actualizar: ");
                    key = scanner.nextLine();
                    if (settings.containsKey(key)) {
                        System.out.print("Ingrese el nuevo valor: ");
                        value = scanner.nextLine();
                        settings.put(key, value);
                        System.out.println("Configuración actualizada correctamente.");
                    } else {
                        System.out.println("La configuración no existe.");
                    }
                    break;
                case 3:
                    System.out.println("\nConfiguraciones almacenadas:");
                    for (Map.Entry<String, String> entry : settings.entrySet()) {
                        System.out.println(entry.getKey() + " = " + entry.getValue());
                    }
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
