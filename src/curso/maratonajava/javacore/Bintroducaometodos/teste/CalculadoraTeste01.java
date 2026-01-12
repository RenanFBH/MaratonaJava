package curso.maratonajava.javacore.Bintroducaometodos.teste;

import curso.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Finalizando teste 01");
        calc.subtraiDoisNumeros();

    }

}
