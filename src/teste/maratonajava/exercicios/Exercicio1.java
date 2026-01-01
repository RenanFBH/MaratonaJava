package teste.maratonajava.exercicios;

public class Exercicio1 {

    public static void main(String[] args) {

        exercicio();

    }

    public static void exercicio () {

        double salaryWithTaxes, taxesValue;
        double salaryPerYear = 20000;
        boolean taxNinePercent = salaryPerYear <= 34712;
        boolean taxThirtySevenPercent = salaryPerYear <= 68507;
        if (taxNinePercent) {
            taxesValue = salaryPerYear * 0.097;
            salaryWithTaxes = salaryPerYear - taxesValue;
        } else if (taxThirtySevenPercent) {
            taxesValue = salaryPerYear * 0.3735;
            salaryWithTaxes = salaryPerYear - taxesValue;
        } else {
            taxesValue = salaryPerYear * 0.4950;
            salaryWithTaxes = salaryPerYear - taxesValue;
        }
        String report = "O salário sem os impostos é de U$ " + salaryWithTaxes + ", o valor do imposto é U$" + taxesValue;
        System.out.println(report);

    }

    public static void correcao() {

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(valorImposto);

    }

}
