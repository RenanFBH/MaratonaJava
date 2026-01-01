package teste.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorCarro, valorParcela;
        int qtdParcela;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de um carro: ");
        valorCarro = sc.nextDouble();
        for (qtdParcela = 1; qtdParcela <= valorCarro; qtdParcela++) {
            valorParcela = valorCarro / qtdParcela;
            if (valorParcela == 1000) {
                break;
            }
            String report = "Parcela: " + qtdParcela + " x " + valorParcela + " = " + valorCarro;
            System.out.println(report);

        }


    }

}
