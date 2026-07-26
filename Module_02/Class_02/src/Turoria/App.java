package Turoria;
public class App {
    public static void main(String[] args) throws Exception {
        Cancion cancion1 = new Cancion(1, "Álbum 1", "Nombre 1", " ", 180, "Género 1");
        Cancion cancion2 = new Cancion(2, "Álbum 2", "Nombre 2", "Artista 2", 200, "Género 2");
        cancion1.setDuracion(190); // Cambiar la duración de la canción 1

        cancion1.mostrarInformacion();
        cancion2.setNombre("Nuevo Nombre 2"); // Cambiar el nombre de la canción 2
        System.out.println("Nuevo nombre de la canción 2: " + cancion2.getNombre());
        System.out.println();
        System.out.println("¿El artista de la canción 2 es válido? " + cancion2.isValidArtista());
        System.out.println("¿El artista de la canción 1 es válido? " + cancion1.isValidArtista());
        Publicacion publicacion1 = new Publicacion(cancion1, "Usuario1", 100);
        Publicacion publicacion2 = new Publicacion(cancion2, "Usuario2", 150);
        System.out.println("Publicación 1: " + publicacion1.getCancion().getNombre() + ", Usuario: " + publicacion1.getUsuario() + ", Likes: " + publicacion1.getLikes());
        System.out.println("Publicación 2: " + publicacion2.getCancion().getNombre() + ", Usuario: " + publicacion2.getUsuario() + ", Likes: " + publicacion2.getLikes());
    }



}

