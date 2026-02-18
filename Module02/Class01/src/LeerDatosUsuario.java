import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeerDatosUsuario {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce tu nombre: ");
        String nombre = reader.readLine();

        System.out.print("Introduce tu edad: ");
        int edad = Integer.parseInt(reader.readLine());

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        reader.close();
    }
}
