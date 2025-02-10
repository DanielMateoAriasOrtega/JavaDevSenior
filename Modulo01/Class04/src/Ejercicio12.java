import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
         * Ejercicio 12 - Conversión de segundos
         * Definir el Problema:
         * Necesitamos convertir una cantidad de segundos ingresada por el usuario en
         * días, horas, minutos y segundos.
         * 
         * Estructura del Programa:
         * Crear un método separado que realice la conversión de segundos a días, horas,
         * minutos y segundos.
         * 
         * Interacción con el Usuario:
         * Pedir al usuario que ingrese la cantidad de segundos.
         * 
         * Mostrar Resultados:
         * Después de realizar la conversión, mostrar los resultados al usuario en la
         * consola.
         * Por ejemplo:
         * 
         * Ingresa la cantidad de segundos: 100000
         * 
         * Días: 1
         * Horas: 3
         * Minutos: 46
         * Segundos: 40
         */
        var scanner = new Scanner(System.in);

        // Solicitar los segundos al usuario
        System.out.print("Ingresa la cantidad de segundos: ");
        var segundosTotales = scanner.nextInt();

        // Realizar la conversión
        convertirSegundos(segundosTotales);

        scanner.close(); // Cerrar scanner
    }

    // Método para convertir segundos a días, horas, minutos y segundos
    public static void convertirSegundos(int segundosTotales) {
        var dias = segundosTotales / 86400; // 1 día = 86400 segundos
        var horas = (segundosTotales % 86400) / 3600; // 1 hora = 3600 segundos
        var minutos = (segundosTotales % 3600) / 60; // 1 minuto = 60 segundos
        var segundos = segundosTotales % 60;

        // Mostrar resultados
        System.out.println("\nDías: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
