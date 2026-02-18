import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

/**
 * Ejercicio 2 - Análisis de Calificaciones de Estudiantes
 * Eres un analista de datos en una escuela y tienes un registro de las
 * calificaciones de los estudiantes en diferentes materias. Cada registro está
 * representado por una cadena de texto que contiene el nombre del estudiante,
 * la materia y la calificación, separados por comas. Tu tarea es procesar estos
 * datos para obtener información útil.
 * 
 * Los datos de entrada son una lista de cadenas de texto, donde cada cadena
 * representa una calificación en el formato: "estudiante,materia,calificacion".
 * Por ejemplo:
 * 
 * List<String> calificaciones = Arrays.asList(
 * "Juan,Matematicas,85",
 * "Ana,Historia,90",
 * "Pedro,Matematicas,70",
 * "Juan,Historia,75",
 * "Ana,Matematicas,95",
 * "Pedro,Historia,80"
 * );
 * Tareas
 * Calcular el Promedio de Calificaciones por Estudiante: Calcula el promedio de
 * calificaciones para cada estudiante.
 * Contar Estudiantes por Materia: Cuenta cuántos estudiantes tienen
 * calificaciones en cada materia.
 * Filtrar Calificaciones Mayores a un Valor Específico: Filtra y muestra las
 * calificaciones que son mayores a un valor específico.
 * Obtener la Materia con el Promedio Más Alto: Determina cuál es la materia con
 * el promedio de calificaciones más alto.
 * 
 */
public class Exercise02 {
    public static void main(String[] args) {
        List<String> correos = Arrays.asList(
                "usuario1@example.com",
                "usuario2@example.com",
                "usuario3@example.com",
                "usuario1@example.com",
                "usuario4@example.com",
                "usuario2@example.com");

        verificarDuplicados(correos);
    }

    /**
     * Verifica y muestra los correos electrónicos duplicados en la lista.
     * 
     * @param correos Lista de correos electrónicos.
     */
    private static void verificarDuplicados(List<String> correos) {
        Set<String> unicoCorreos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String correo : correos) {
            if (!unicoCorreos.add(correo)) {
                duplicados.add(correo);
            }
        }

        if (duplicados.isEmpty()) {
            System.out.println("No se encontraron correos duplicados.");
        } else {
            System.out.println("Correos duplicados encontrados: " + duplicados);
        }
    }
}
