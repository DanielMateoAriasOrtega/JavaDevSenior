public class Prueba {
    public static void main(String[] args ) {
        var nombre = "Daniel";
        var edad = 30;

        System.out.print("Hola");
        System.out.print(10);
        System.out.print(12.8);
        System.out.print('A');
        System.out.println("!");



        System.out.printf("Hola: %s,%n tienes %d años", nombre, edad);

        var entrada = new java.util.Scanner(System.in);
        System.out.printf("%n¿Cuál es tu nombre?");
        var nombreUsuario = entrada.nextLine();
        System.out.println("Hola " + nombreUsuario);    
    }
}
