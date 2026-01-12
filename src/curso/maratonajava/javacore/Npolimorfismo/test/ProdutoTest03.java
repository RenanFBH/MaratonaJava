package curso.maratonajava.javacore.Npolimorfismo.test;

import curso.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import curso.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import curso.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import curso.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Teste1", 2000);
        Tomate tomate = new Tomate("Teste2", 10);

        tomate.setDataValidade("31/12/2025");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

    }
}
