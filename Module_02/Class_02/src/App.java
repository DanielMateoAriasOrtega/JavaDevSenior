public class App {
    public static void main(String[] args) throws Exception {
        Cancion cancion1 = new Cancion(1, "Álbum 1", "Nombre 1", "Artista 1", 180, "Género 1");
        Cancion cancion2 = new Cancion(2, "Álbum 2", "Nombre 2", "Artista 2", 200, "Género 2");
        cancion1.setDuracion(190); // Cambiar la duración de la canción 1

        cancion1.mostrarInformacion();
        System.out.println();
        cancion2.mostrarInformacion();
    }
}
