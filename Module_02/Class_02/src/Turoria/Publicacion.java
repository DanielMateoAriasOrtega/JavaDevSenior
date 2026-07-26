package Turoria;

public class Publicacion {
    Cancion cancion;
    String usuario;
    int likes;

    // Constructor
    public Publicacion(Cancion cancion, String usuario, int likes) {
        this.cancion = cancion;
        this.usuario = usuario;
        this.likes = likes;
    }

    // Getters y Setters
    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
