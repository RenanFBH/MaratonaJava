package teste.maratonajava.javacore.Bintroducaometodos.teste;

import teste.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        Calculadora calc = new Calculadora();
        calc.alteraDoisNumeros(a, b);
        System.out.println("Dentro do CalculadoraTeste04");
        System.out.println("num1 " + a);
        System.out.println("num2 " + b);

    }

}
