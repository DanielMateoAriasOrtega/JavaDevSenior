public class App {
    public static void main(String[] args) throws Exception {   
        // while
        // inicializacion
        var counter = 11;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    
       // do while
       //Inicializacion
        var counter = 0;
        do {
        System.out.println(counter);

        // Actualizacion
        counter--;
        } while (counter > 0);
        System.out.println("Boom!!!");


        // for

        for (int i = 0; i < 10; i+=3) {
        System.out.println(--i);
        }
        System.out.println("You Win");

        System.out.println("Termino la aplicacion");

    }
}
