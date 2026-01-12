package curso.maratonajava.javacore.Bintroducaometodos.teste;

import curso.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Teste");
        pessoa.setIdade(18);
        pessoa.imprime();
        //System.out.println(pessoa.getNome());
        //System.out.println(pessoa.getIdade());


    }

}
