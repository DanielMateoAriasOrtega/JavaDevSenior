import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        /* Ejercicio 9
        
            *Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la cantidad de unidades que le compren. La siguiente tabla muestra la información:

            *Unidades	Precio por unidad
            [1 - 50]	$50.000
            (50 - 100]	$45.000
            (100 - 150]	$40.000
            (150 - 200]	$35.000
            > 200	$25.000
            Escriba un programa que dado un número de camisas retorne el precio por unidad.
        */


        var scanner = new Scanner(System.in);

        // Solicitar la cantidad de camisas al usuario
        System.out.print("Ingrese la cantidad de camisas: ");
        var cantidad = scanner.nextInt();

        // Determinar el precio por unidad según la cantidad ingresada
        var precio = (cantidad > 200) ? 25000 :  // Más de 200 camisas → $25.000 c/u
                     (cantidad > 150) ? 35000 :  // Entre 151 y 200 camisas → $35.000 c/u
                     (cantidad > 100) ? 40000 :  // Entre 101 y 150 camisas → $40.000 c/u
                     (cantidad > 50) ? 45000 :   // Entre 51 y 100 camisas → $45.000 c/u
                     50000;                      // 50 camisas o menos → $50.000 c/u

        // Mostrar el precio por unidad
        System.out.println("Precio por unidad: $" + precio);

        scanner.close(); // Cerrar el scanner para liberar recursos
    }
}
