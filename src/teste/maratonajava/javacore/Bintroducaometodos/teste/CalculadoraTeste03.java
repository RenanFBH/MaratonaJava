package teste.maratonajava.javacore.Bintroducaometodos.teste;

import teste.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        double result = calc.divideDoisNumeros(5, 2);
        System.out.println(result);
        System.out.println(calc.divideDoisNumeros02(2, 0));
        System.out.println("---------------");
        calc.imprimeDivideDoisNumeros02(86, 0);



    }

}
