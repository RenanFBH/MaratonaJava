package teste.maratonajava.javacore.Npolimorfismo.servico;

import teste.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados");
    }
}
