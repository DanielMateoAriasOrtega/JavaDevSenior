import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        /*
         * Escriba una función en la que ingrese un número entero entre 1 y 12. Este
         * número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). El
         * resultado debe ser el número de días del mes ingresado.
         * Ejemplo:
         * 
         * Input : 12
         * Output : 31
         * A continuación encuentras la cantidad de días que tienen cada mes.
         * 
         * Mes Días
         * 1, 3, 5, 7, 8, 10 y 12 31
         * 4, 6, 9, 11 30
         * 2 28
         * /*
         */

        var scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario

        // Solicita al usuario que ingrese un número de mes
        System.out.print("Ingrese un número del 1 al 12: ");
        var mes = scanner.nextInt();

        // Verifica si el número es válido y muestra la cantidad de días del mes
        System.out.println((mes < 1 || mes > 12)
                ? "Número inválido." // Mensaje de error si el número está fuera del rango
                : "El mes tiene " + diasDelMes(mes) + " días."); // Llama a la función para obtener los días

        scanner.close(); // Cierra el scanner para liberar recursos
    }

    /**
     * Función para obtener la cantidad de días de un mes según su número.
     * 
     * @param mes Número del mes (1-12)
     * @return Número de días del mes
     */
    static int diasDelMes(int mes) {
        return (mes == 2) ? 28 // Febrero tiene 28 días
                : (mes == 4 || mes == 6 || mes == 9 || mes == 11) ? 30 // Abril, junio, septiembre y noviembre tienen 30
                                                                       // días
                        : 31; // Los demás meses tienen 31 días
    }
}
