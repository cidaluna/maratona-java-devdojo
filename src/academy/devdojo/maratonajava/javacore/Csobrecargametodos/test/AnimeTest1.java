package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest1 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Akudama", "TV", 12);
        anime.init("Akudama", "TV", 12, "Ação");

        anime.imprime();
    }
}
