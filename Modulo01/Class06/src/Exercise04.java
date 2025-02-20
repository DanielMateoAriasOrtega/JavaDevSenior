import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

/**
 * Ejercicio 4 - Generador de ID para los empleados (Intermedio)
 * La empresa ABCD tiene hasta 100 empleados. La compañía decide crear un número
 * de identificación único UID para cada uno de sus empleados. La compañía le ha
 * asignado la tarea de validar los UIDs generados aleatoriamente.
 * Un UID válido debe cumplir con las siguientes reglas:
 * 
 * Debe contener por lo menos dos letras mayúsculas en el alfabeto inglés.
 * Debe tener por lo menos 3 dígitos.
 * Contener únicamente dígitos alfanuméricos.
 * No tener repeticiones.
 * Contener exactamente 10 caracteres.
 * El dato de entrada es una lista con los UID que desea validar. Por ejemplo:
 * 
 * List<String> uids = Arrays.asList(
 * "B1CD102354",
 * "B1CDEF2354"
 * );
 * Y las salidas deberían ser:
 * 
 * B1CD102354 - Inválido
 * B1CDEF2354 - Válido
 */
public class Exercise04 {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@example.com",
                "user2@example.com",
                "user3@example.com",
                "user1@example.com",
                "user4@example.com",
                "user2@example.com");

        Set<String> duplicates = findDuplicates(emails);

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate emails found.");
        } else {
            System.out.println("Duplicate emails found: " + duplicates);
        }
    }

    /**
     * Verifies and returns duplicate email addresses in the list.
     * 
     * @param emails List of email addresses.
     * @return A set containing the duplicate emails.
     */
    private static Set<String> findDuplicates(List<String> emails) {
        Set<String> uniqueEmails = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String email : emails) {
            if (!uniqueEmails.add(email)) {
                duplicates.add(email);
            }
        }

        return duplicates;
    }
}
