// Ejercicio 5: ¿Cuánto te ha costado el ordenador?
public class Ejercicio05 {
    public static void main(String[] args) {
        double precioOrdenador = 660;
        double descuento = 0.10;
        double precioFinal = precioOrdenador * (1 - descuento);
        System.out.println("El precio total del ordenador con descuento es: " + precioFinal + "€.");
    }
}
