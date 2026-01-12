package curso.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {

    private String nome;
    private static int[] episodios;

    // 0- Bloco de inicialização é executado quando a JVM carrega a classe
    // 1- Alocado espaço em memória para o objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado

    //Bloco de inicialização
    static {
        System.out.println("Dentro do bloco de inicialização estático");
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    static {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
