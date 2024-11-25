public class App {
    public static void main(String[] args) throws Exception {
        var edad = 20;

        /*
         * if (edad >= 18) {
         * if (edad >= 60) {
         * System.out.println("Es jubilado");
         * }
         * System.out.println("Es mayor de edad");
         * } else {
         * System.out.println("Es menor de edad");
         * } /*
         */

        if (edad < 0) {
            System.out.println("La edad no puede ser negativa");
        } else if (edad > 0 && edad < 18) {
            System.out.println("Es menor de edad");
        } else if (edad < 29) {
            System.out.println("Es adulto joven");
        } else if (edad < 45) {
            System.out.println("Eres adulto");
        } else if (edad < 60) {
            System.out.println("Eres anciano");
        } else {
            System.out.println("Eres jubilado");
        }

        

        /* 
        if (edad == 1) {
            ///
        }else if (edad == 10) {
            ///
        }else if (edad == 20) {
            ///
        }else if  {
            ///
        }
        */
        String mensaje ;
        switch (edad) {
            case 1:
                mensaje = "Edad 1";
                break;
            case 10:
                mensaje = "Edad 10";
                break;
            default:
                mensaje = "Edad desconocida";
                break;
        }


        var letra = switch (edad) {
            case 1 -> "Tiene un año";
            case 2 -> "Tiene diez años";
            default -> "¡¡¡Edad desconocida!!!";
        };



        System.out.println("Fin del programa");

    }
}
