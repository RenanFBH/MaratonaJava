package teste.maratonajava.javacore.Gassociacao.test;

import teste.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {

        Jogador j1 = new Jogador("Teste");
        Jogador j2 = new Jogador("Teste1");
        Jogador j3 = new Jogador("Teste2");
        Jogador[] jogadores = {j1, j2, j3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }

}
