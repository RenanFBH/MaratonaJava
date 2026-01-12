package curso.maratonajava.javacore.Gassociacao.test;

import curso.maratonajava.javacore.Gassociacao.dominio.Jogador;
import curso.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Teste");
        Jogador jogador2 = new Jogador("Teste2");
        Time time = new Time("Brasil");
        jogador.setTime(time);
        jogador2.setTime(time);
        Jogador jogadores[] = { jogador, jogador2 };
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Time ---");
        time.imprime();

    }
}
