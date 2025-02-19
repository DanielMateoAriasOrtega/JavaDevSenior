import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        /*Ejercicio 8 - Cálculo de Áreas
Definir el Problema:
Necesitamos calcular el área de un círculo, un cuadrado y un triángulo utilizando las fórmulas matemáticas correspondientes.
Fórmulas de Cálculo:

Área de un Círculo: La fórmula es A = pi * r ^ 2, donde r es el radio del círculo.
Área de un Cuadrado: La fórmula es A = l ^ 2, donde l es la longitud del lado del cuadrado.
Área de un Triángulo: La fórmula es A = (b * h) / 2, donde b es la base y h es la altura del triángulo.
Estructura del Programa:
Crear métodos separados para calcular el área de cada figura geométrica.
Puede utilizar la función creada en el ejercicio 7 para calcular los cuadrados en las formulas.

Interacción con el Usuario:
Pedir al usuario que ingrese los valores necesarios (radio, lado, base y altura) para calcular el área de cada figura.

Mostrar Resultados:
Después de calcular el área, mostrar el resultado al usuario en la consola. */
        var scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura para calcular el área:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.print("Opción: ");
        var opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> { // Cálculo del área de un círculo
                System.out.print("Ingrese el radio del círculo: ");
                var radio = scanner.nextDouble();
                var area = calcularAreaCirculo(radio);
                System.out.println("El área del círculo es: " + area);
            }
            case 2 -> { // Cálculo del área de un cuadrado
                System.out.print("Ingrese el lado del cuadrado: ");
                var lado = scanner.nextDouble();
                var area = calcularAreaCuadrado(lado);
                System.out.println("El área del cuadrado es: " + area);
            }
            case 3 -> { // Cálculo del área de un triángulo
                System.out.print("Ingrese la base del triángulo: ");
                var base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                var altura = scanner.nextDouble();
                var area = calcularAreaTriangulo(base, altura);
                System.out.println("El área del triángulo es: " + area);
            }
            default -> System.out.println("Opción no válida.");
        }

        scanner.close(); // Cerrar scanner
    }

    // Método para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * calcularCuadrado(radio); // Usa la función del ejercicio 7
    }

    // Método para calcular el área de un cuadrado
    public static double calcularAreaCuadrado(double lado) {
        return calcularCuadrado(lado); // Usa la función del ejercicio 7
    }

    // Método para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método reutilizado del ejercicio 7 para calcular el cuadrado de un número
    public static double calcularCuadrado(double numero) {
        return Math.pow(numero, 2);
    }
}
