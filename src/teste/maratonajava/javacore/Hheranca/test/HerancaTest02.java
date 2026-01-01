package teste.maratonajava.javacore.Hheranca.test;

import teste.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    // 0- Bloco de inicialização estático da super classe é executado quando a JVM carrega a classe pai
    // 1- Bloco de inicialização estático da sub classe é executado quando a JVM carrega a classe filha
    // 2- Alocado espaço em memória para o objeto da classe pai
    // 3- Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe pai
    // 4- Bloco de inicialização da super classe é executado
    // 5- Construtor da super classe é executado na ordem em que aparece
    // 6- Alocado espaço em memória para o objeto da classe filha
    // 7- Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe filha
    // 8- Bloco de inicialização da sub classe é executado
    // 9- Construtor da sub classe é executado na ordem em que aparece

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Teste");

    }

}
