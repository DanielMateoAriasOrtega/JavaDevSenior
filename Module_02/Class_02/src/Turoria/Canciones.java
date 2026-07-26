package Turoria;

public class Canciones {

    // Atributos de la clase Canciones
    Cancion[] listado;

    // Constructor
    public Canciones(Cancion[] listado) {
        this.listado = listado;
    }

    // Getters y Setters
    public Cancion[] getListado() {
        return listado;
    }

    public void setListado(Cancion[] listado) {
        this.listado = listado;
    }
}
