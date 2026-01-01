package teste.maratonajava.javacore.Csobrecargametodos.test;

import teste.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Death Note", "TV", 12);
        anime.init("Death Note", "TV", 12, "Ação");
        anime.imprime();

    }

}
