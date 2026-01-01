package teste.maratonajava.javacore.Lclassesabstratas.test;

import teste.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import teste.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import teste.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Teste", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Teste2", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();

    }

}
