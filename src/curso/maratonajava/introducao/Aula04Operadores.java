package curso.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {


        // aritméticos
        int n1 = 10;
        int n2 = 15;
        int soma = n1 / n2;

        System.out.println("Valor = " + soma);

        int resto = 20 % 2;
        System.out.println(resto);

        // lógicos

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // relacionais
        int age = 35;
        float salary = 3500F;
        boolean isDentroDaleiMaiorQueTrinta = age >= 30 && salary >= 4612;
        boolean isDentroDaleiMenorQueTrinta = age < 30 && salary >= 3381;
        System.out.println("isDentroDaleiMenorQueTrinta " + isDentroDaleiMenorQueTrinta);
        System.out.println("isDentroDaleiMaiorQueTrinta " + isDentroDaleiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus " + bonus);

        int contador = 0;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println("Contador " + contador);
        System.out.println(contador2++ + " e " + ++contador);





    }

}
