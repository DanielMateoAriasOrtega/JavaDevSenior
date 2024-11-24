import java.util.Scanner;
/**
 * HolaMundo
 */
public class HolaMundo {

    public static void main(String[] args) {
        // imprimir datos en pantalla / consola / terminal
        System.out.println("¡Hola Daniel!");

        System.out.println("Hola Como Estas");
        System.out.print(10);
        System.out.print(10.5);
        System.out.print('D');
        System.out.println();

        System.out.printf("Aqui va una cadena: %s%n","Daniel");
        System.out.printf("Aqui va un entero: %d%n",10);
        System.out.printf("Mi nombre es %s y tengo %d años%n","Daniel Arias",15);

        var entrada = new Scanner(System.in);
        var entero = entrada.nextInt();

        System.out.println(entero);

        entrada.close();


    }
}