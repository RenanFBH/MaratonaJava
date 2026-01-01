package teste.maratonajava.javacore.Npolimorfismo.test;

import teste.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import teste.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import teste.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
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
