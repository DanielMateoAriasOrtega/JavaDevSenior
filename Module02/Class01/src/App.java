import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        Console console = System.console();

if (console != null) {
    String nombre = console.readLine("Introduce tu nombre: ");
    int edad = Integer.parseInt(console.readLine("Introduce tu edad: "));

    System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
} else {
    System.out.println("No se puede obtener la consola.");
}
    }
    


}


