package teste.maratonajava.javacore.Bintroducaometodos.teste;

import teste.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import teste.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();



        estudante01.nome = "Batman";
        estudante01.idade = 18;
        estudante01.sexo = 'M';
        estudante02.nome = "Teste";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }

}
