package teste.maratonajava.javacore.Hheranca.test;

import teste.maratonajava.javacore.Hheranca.dominio.Endereco;
import teste.maratonajava.javacore.Hheranca.dominio.Funcionario;
import teste.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345-678");
        Pessoa pessoa = new Pessoa("Teste1");
        pessoa.setNome("Teste");
        pessoa.setCpf("123456789-10");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Teste2");
        funcionario.setNome("Renan2");
        funcionario.setCpf("123456789-10");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1900);
        funcionario.imprime();
    }

}
