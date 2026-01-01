package teste.maratonajava.javacore.Eblocosinicializacao.test;

import teste.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {

        Anime anime = new Anime("One Piece");
        System.out.println(anime.getEpisodios());
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }


    }

}
