package curso.maratonajava.javacore.Npolimorfismo.test;

import curso.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import curso.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import curso.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Teste1", 2000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");

        Produto produto2 = new Tomate("Teste2", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
