package curso.maratonajava.javacore.Npolimorfismo.test;

import curso.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import curso.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Teste1");
        list.add("Teste2");
        System.out.println(list);
    }
}
