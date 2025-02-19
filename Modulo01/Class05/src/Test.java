public class Test {

    // Método validarEdad definido correctamente
    public void validarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("Debes ser mayor de edad");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Crear una instancia de Prueba para llamar al método validarEdad
        Test prueba = new Test();
        
        // Prueba con una edad menor a 18 para provocar la excepción
        try {
            prueba.validarEdad(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
