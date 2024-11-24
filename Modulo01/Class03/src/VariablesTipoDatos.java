public class VariablesTipoDatos {
    public static void main(String[] args) {
        /* 
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var text = scanner.nextLine();
        System.out.println("Hola " + text + "!");

        System.out.printf("El valor ingresado es: %s%n", text);
        scanner.close();
        */
        
        // Variables de tipo boolean
        boolean active;
        var defaultValue = false;

        // Variables de tipo char
        byte numberByte = 124;
        short numberShort= 12_400;

        // Variables de tipo int y long
        int numberInt;
        long numberLong;
        var defaultValueInt = 0;
        var defaultValueLong = 145L;

        // Variables de tipo float y double
        float numberFloat;
        double numberDouble;
        var defaultValueFloat = 0.0f;
        var defaultValueDouble = 0.0d;
        
        // Variables de tipo String
        char character = 'a';
        String textString = "Hello World!";
        var defaultValueString = "";
        var defaultValueCharacter = 'j';
        
        System.out.println("Hello\nWorld!\nHello\tWorld!");

        // Boolean, Byte, Short, Int, Long, Float, Double, Char, String
        

    }
}
