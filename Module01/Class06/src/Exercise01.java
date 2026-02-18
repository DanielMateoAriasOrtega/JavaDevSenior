import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ejercicio 1 - Análisis de Ventas de una Tienda
 * Eres un analista de datos en una tienda de comercio electrónico. La tienda
 * tiene un registro de todas las ventas realizadas durante el último mes. Cada
 * venta está representada por una cadena de texto que contiene el nombre del
 * producto, la cantidad vendida y el precio unitario, separados por comas. Tu
 * tarea es procesar estos datos para obtener información útil.
 * 
 * Los datos de entrada son una lista de cadenas de texto, donde cada cadena
 * representa una venta en el formato: "producto,cantidad,precio_unitario". Por
 * ejemplo:
 * 
 * List<String> ventas = Arrays.asList(
 * "camisa,2,20.00",
 * "pantalon,1,35.50",
 * "zapatos,3,50.00",
 * "camisa,1,20.00",
 * "pantalon,2,35.50"
 * );
 * Tareas
 * Calcular el Ingreso Total: Calcula el ingreso total generado por todas las
 * ventas.
 * Contar Ventas por Producto: Cuenta cuántas veces se vendió cada producto.
 * Filtrar Ventas Mayores a un Monto Específico: Filtra y muestra las ventas
 * cuyo ingreso total (cantidad * precio_unitario) sea mayor a un monto
 * específico.
 * Obtener el Producto Más Vendido: Determina cuál fue el producto más vendido
 * en términos de cantidad total.
 */
public class Exercise01 {
    public static void main(String[] args) {
        List<String> ventas = Arrays.asList(
                "camisa,2,20.00",
                "pantalon,1,35.50",
                "zapatos,3,50.00",
                "camisa,1,20.00",
                "pantalon,2,35.50");

        System.out.println("Ingreso Total: " + calcularIngresoTotal(ventas));
        System.out.println("Ventas por Producto: " + contarVentasPorProducto(ventas));
        System.out.println("Producto Más Vendido: " + obtenerProductoMasVendido(ventas));
    }

    /**
     * Calcula el ingreso total generado por todas las ventas.
     */
    private static double calcularIngresoTotal(List<String> ventas) {
        double total = 0;
        for (String venta : ventas) {
            String[] datos = venta.split(",");
            int cantidad = Integer.parseInt(datos[1]);
            double precio = Double.parseDouble(datos[2]);
            total += cantidad * precio;
        }
        return total;
    }

    /**
     * Cuenta cuántas veces se vendió cada producto.
     */
    private static Map<String, Integer> contarVentasPorProducto(List<String> ventas) {
        Map<String, Integer> ventasPorProducto = new HashMap<>();
        for (String venta : ventas) {
            String[] datos = venta.split(",");
            String producto = datos[0];
            int cantidad = Integer.parseInt(datos[1]);
            ventasPorProducto.put(producto, ventasPorProducto.getOrDefault(producto, 0) + cantidad);
        }
        return ventasPorProducto;
    }

    /**
     * Determina el producto más vendido en términos de cantidad total.
     */
    private static String obtenerProductoMasVendido(List<String> ventas) {
        Map<String, Integer> ventasPorProducto = contarVentasPorProducto(ventas);
        String productoMasVendido = "";
        int maxCantidad = 0;
        for (Map.Entry<String, Integer> entry : ventasPorProducto.entrySet()) {
            if (entry.getValue() > maxCantidad) {
                maxCantidad = entry.getValue();
                productoMasVendido = entry.getKey();
            }
        }
        return productoMasVendido;
    }
}
