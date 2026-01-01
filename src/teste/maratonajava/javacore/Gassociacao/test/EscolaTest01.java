package teste.maratonajava.javacore.Gassociacao.test;

import teste.maratonajava.javacore.Gassociacao.dominio.Escola;
import teste.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {

        Professor professor1 = new Professor("Teste1");
        Professor professor2 = new Professor("Teste2");
        Professor professores[] = {professor1, professor2};
        Escola escola = new Escola("Teste", professores);
        escola.imprime();


    }

}
