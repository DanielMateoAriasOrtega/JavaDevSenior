public class Examples {
    public static void main(String[] args) {
        /*
         * En Java, el término "ciclos" se refiere a las estructuras de control
         * repetitivas, también conocidas como bucles. Java proporciona tres tipos
         * principales de ciclos:
         * 
         * 1. Ciclo for
         * Se utiliza cuando se conoce el número exacto de iteraciones.
         * 
         * Ejemplo:
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }
        /*
         * Explicación:
         * 
         * int i = 1; → Inicialización de la variable de control.
         * i <= 5; → Condición que debe cumplirse para seguir iterando.
         * i++ → Incremento de la variable de control en cada iteración.
         */

        /*
         * 
         * /*
         * 2. Ciclo while
         * Se usa cuando el número de iteraciones no es conocido y depende de una
         * condición.
         * 
         * Ejemplo:
         */
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteración: " + i);
            i++;
        }
        /*
         * Explicación:
         * 
         * La condición i <= 5 se evalúa antes de ejecutar el bloque de código.
         * Si la condición es falsa desde el inicio, el bloque no se ejecuta.
         */
        /*
         * 
         * /*
         * 3. Ciclo do-while
         * Se usa cuando el número de iteraciones no es conocido y depende de una
         * condición.
         * 
         * Ejemplo:
         */
        i = 1;
        do {
            System.out.println("Iteración: " + i);
            i++;
        } while (i <= 5);
        /*
         * Explicación:
         * 
         * La condición i <= 5 se evalúa después de ejecutar el bloque.
         * Esto asegura que el código dentro del do se ejecute al menos una vez, incluso
         * si la condición es falsa desde el principio.
         */

        /*
         * Ciclo for-each (Para recorrer colecciones)
         * Se usa para recorrer arrays y colecciones de manera más sencilla.
         * 
         * Ejemplo con un array:
         */
        int[] numeros = { 1, 2, 3, 4, 5 };
        for (int num : numeros) {
            System.out.println("Número: " + num);
        }
        /*
         * Explicación:
         * 
         * num toma el valor de cada elemento del array numeros en cada iteración.
         * Conclusión
         * Cada ciclo tiene su propósito:
         * 
         * for → Cuando el número de iteraciones es conocido.
         * while → Cuando se ejecuta hasta que se cumpla una condición.
         * do-while → Cuando al menos una ejecución es obligatoria.
         * for-each → Para recorrer estructuras de datos como arrays o listas.
         */

    }
}
