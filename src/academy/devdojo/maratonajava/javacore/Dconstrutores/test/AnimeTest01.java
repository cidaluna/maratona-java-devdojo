package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Haikyu", "TV", 12, "Ação", "IG");
        System.out.println("-------------------------- ");
        System.out.println("Imprimindo dados do anime: ");
        anime.imprime();

    }

}
