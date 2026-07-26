package Turoria;
public class Cancion {
    // Atributos de la clase Cancion
    int id;
    String album;
    String nombre;
    String artista;
    int duracion;
    String genero;

    // Crear una canción con valores predeterminados
    // Constructor por defecto
    public Cancion() {

    }

    // Crear una canción con valores específicos
    // Constructor con parámetros
    public Cancion(int id, String album, String nombre, String artista, int duracion, String genero) {
        this.id = id;   
        this.album = album;
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
    }

    // Mostrar información de la canción
    public void mostrarInformacion() {
        System.out.println("ID: " + this.id);
        System.out.println("Álbum: " + this.album);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duración: " + this.duracion);
        System.out.println("Género: " + this.genero);
    }

    // Getters y Setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isValidArtista() {
        // Verificar si el artista es válido (no nulo y no vacío)
        // setArtista(artista);
        // Retornar true si el artista es válido, de lo contrario false
        return artista != null && !artista.trim().isEmpty();
    }


}