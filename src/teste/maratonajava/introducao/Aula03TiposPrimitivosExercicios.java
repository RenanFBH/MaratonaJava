package teste.maratonajava.introducao;

/**
 * Prática
 *
 * Criar variáveis para os campos descritos abaixo entre <> e imprimir a seguinte mensagem:
 *
 * Eu <nome>, morando no endereço <>, confirmo que recebi o salário de <>, na data de <data>
 *
 */


public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {

        String name = "Teste";
        String address = "1";
        String date = "12/12/2025";
        double salary = 10000;

        String report = "Eu " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de R$" + salary + " na data de " + date;

        System.out.println(report);

    }

}
