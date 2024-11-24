// Ejercicio 2: ¿Ves algún error en el precio?
public class Ejercicio02 {
    public static void main(String[] args) {
        double precioPor100g = 5.95;
        double precioPorKiloCalculado = precioPor100g * 10;
        System.out.println("El precio correcto por kilo sería: " + precioPorKiloCalculado + "€. Comparado con el precio indicado de 29.75€, parece incorrecto.");
    }
}
