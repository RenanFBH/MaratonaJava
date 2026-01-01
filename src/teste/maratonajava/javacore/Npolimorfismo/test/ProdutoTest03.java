package teste.maratonajava.javacore.Npolimorfismo.test;

import teste.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import teste.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import teste.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import teste.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Teste1", 2000);
        Tomate tomate = new Tomate("Teste2", 10);

        tomate.setDataValidade("31/12/2025");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

    }
}
