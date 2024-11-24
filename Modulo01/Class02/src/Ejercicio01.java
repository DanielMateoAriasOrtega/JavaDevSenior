// Ejercicio 1: 6 / 2 (1 + 2)

/*

Explicación detallada de la expresión 6 / 2 * (1 + 2):

Paréntesis: Primero, se evalúa lo que está dentro de los paréntesis (1 + 2), resultando en 3.

Ahora, la expresión se convierte en: 6 / 2 * 3.

División y Multiplicación: Siguiendo la jerarquía, se resuelven estas operaciones de izquierda a derecha. Primero, se evalúa 6 / 2, que es 3.

La expresión ahora es: 3 * 3.

Multiplicación: Finalmente, se realiza la multiplicación 3 * 3, dando un resultado de 9.

Por lo tanto, el resultado correcto de 6 / 2 * (1 + 2) en un lenguaje de programación que sigue este orden es 9.

¿Por qué algunas calculadoras muestran el resultado como 1?
Algunas calculadoras o interpretaciones erróneas de la expresión podrían asumir que 6 / 2 (1 + 2) significa 6 / (2 * (1 + 2)). Esta interpretación cambia la jerarquía de operaciones y agrupa 2 * 3 en el denominador, lo que resulta en 6 / 6, es decir, 1.

Resumen: El orden de operaciones en programación es crucial, y en esta expresión específica, da un resultado de 9 al evaluar 6 / 2 * 3 secuencialmente de izquierda a derecha.

 */

public class Ejercicio01 {
    public static void main(String[] args) {
        double resultado = 6 / 2 * (1 + 2);
        System.out.println("El resultado correcto de la operación '6 / 2 * (1 + 2)' es: " + resultado);
    }
}
