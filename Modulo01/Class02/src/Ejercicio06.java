// Ejercicio 6: ¿Qué precio tenían antes del descuento?
public class Ejercicio06 {
    public static void main(String[] args) {
        double precioConDescuento = 34;
        double descuento = 0.15;
        double precioOriginal = precioConDescuento / (1 - descuento);
        System.out.println("El precio original antes del descuento era: " + precioOriginal + "€.");
    }
}
