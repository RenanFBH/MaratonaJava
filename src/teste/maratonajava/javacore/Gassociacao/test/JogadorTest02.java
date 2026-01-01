package teste.maratonajava.javacore.Gassociacao.test;

import teste.maratonajava.javacore.Gassociacao.dominio.Jogador;
import teste.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {

    public static void main(String[] args) {

        Jogador j1 = new Jogador("Teste");
        Time t1 = new Time("Brasil");
        j1.setTime(t1);
        j1.imprime();

    }

}
