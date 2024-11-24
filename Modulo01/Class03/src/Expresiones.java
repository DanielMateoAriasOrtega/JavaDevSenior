public class Expresiones {
    public static void main(String[] args) {
        // Byte, Short, Integer, Long, Float, Double, Boolean, Character    
        var num1 = 10;
        System.out.println(num1);
        var num2 = -5;
        var num3 = num1 + num2;
        var num4 = 40 - num3;
        System.out.println(num3);

        /*

        + suma
        - resta
        * multiplicacion
        / division
        % modulo

        */

        var num5 = 10 * (25 - 30) / 8;
        System.out.println(num5);

        var num6 = 157 / 11;
        var num7 = 157 % 11;
        System.out.println(num6);
        System.out.println(num7);
        System.out.printf("La division entre 157 y 11 es %d y el modulo es %d%n", num6, num7);

        // num++ -> uso el numero y luego incremento
        num6++; // num6 = num6 + 1
        num6--; // num6 = num6 - 1

        // ++num -> incremento el numero y uso el resultado
        ++num6; // num6 = num6 + 1
        --num6; // num6 = num6 - 1


        // Operadores de incremento y decremento
        var num8 = 26;
        var num9 = 18;
        var num10 = num8++ - num9--;
        // 26 - 18 = 8
        System.out.println(num10);
        System.out.println(num8);
        System.out.println(num9);


        // Operadores de incremento y decremento
        num8 = 26;
        num9 = 18;
        var num11 = ++num8 - --num9;
        // 27 - 17 = 10     
        System.out.println(num11);
        System.out.println(num8);
        System.out.println(num9);


        // Operadores de incremento y decremento
        var num12 = 30;
        num12 *= 7; // num12 = num12 * 7
        System.out.println(num12);

        num12 %= 2; // num12 = num12 % 2
        System.out.println(num12);


    }
}
