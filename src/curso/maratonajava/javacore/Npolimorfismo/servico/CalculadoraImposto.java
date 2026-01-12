package curso.maratonajava.javacore.Npolimorfismo.servico;

import curso.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import curso.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Imposto do produto " + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
            ((Tomate) produto).getDataValidade();
        }
    }
}
