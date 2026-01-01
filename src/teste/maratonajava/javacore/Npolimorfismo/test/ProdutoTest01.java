package teste.maratonajava.javacore.Npolimorfismo.test;

import teste.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import teste.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import teste.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import teste.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("TESTE", 1920);
        Tomate tomate = new Tomate("TESTE2", 10);
        Televisao televisao  = new Televisao("TCL C655 55\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(televisao);


    }
}
