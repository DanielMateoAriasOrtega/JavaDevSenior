import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

/**
 * Ejercicio 3 - Análisis de Facturas de una Empresa
 * Trabajas como analista de datos en una empresa y tienes un registro de todas
 * las facturas emitidas durante el último trimestre. Cada factura está
 * representada por una cadena de texto que contiene el número de factura, el
 * nombre del cliente, el monto total de la factura y el porcentaje de IVA
 * aplicado, separados por comas. Tu tarea es procesar estos datos para obtener
 * información útil.
 * 
 * Los datos de entrada son una lista de cadenas de texto, donde cada cadena
 * representa una factura en el formato:
 * "numero_factura,cliente,monto_total,iva". Por ejemplo:
 * 
 * List<String> facturas = Arrays.asList(
 * "F001,ClienteA,1000.00,19",
 * "F002,ClienteB,1500.00,19",
 * "F003,ClienteA,2000.00,19",
 * "F004,ClienteC,2500.00,19",
 * "F005,ClienteB,3000.00,19"
 * );
 * Tareas
 * Calcular el Monto Total con IVA: Calcula el monto total de cada factura
 * incluyendo el IVA.
 * Calcular el Ingreso Total por Cliente: Calcula el ingreso total generado por
 * cada cliente.
 * Filtrar Facturas Mayores a un Valor Específico: Filtra y muestra las facturas
 * cuyo monto total (sin IVA) sea mayor a un valor específico.
 * Obtener el Cliente con el Mayor Ingreso Total: Determina cuál fue el cliente
 * que generó el mayor ingreso total.
 */
public class Exercise03 {
    public static void main(String[] args) {
        List<String> correos = Arrays.asList(
                "usuario1@example.com",
                "usuario2@example.com",
                "usuario3@example.com",
                "usuario1@example.com",
                "usuario4@example.com",
                "usuario2@example.com");

        Set<String> duplicados = verificarDuplicados(correos);

        if (duplicados.isEmpty()) {
            System.out.println("No se encontraron correos duplicados.");
        } else {
            System.out.println("Correos duplicados encontrados: " + duplicados);
        }
    }

    /**
     * Verifica y devuelve los correos electrónicos duplicados en la lista.
     * 
     * @param correos Lista de correos electrónicos.
     * @return Un conjunto con los correos duplicados.
     */
    private static Set<String> verificarDuplicados(List<String> correos) {
        Set<String> unicoCorreos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String correo : correos) {
            if (!unicoCorreos.add(correo)) {
                duplicados.add(correo);
            }
        }

        return duplicados;
    }
}
