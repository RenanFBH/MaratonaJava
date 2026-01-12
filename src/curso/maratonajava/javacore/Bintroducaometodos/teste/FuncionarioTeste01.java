package curso.maratonajava.javacore.Bintroducaometodos.teste;

import curso.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        func.setNome("Teste");
        func.setIdade(18);
        func.setSalarios(new double[] {1200, 3000, 5000});
        func.imprime();
        System.out.println("Média " + func.getMedia());

    }

}
