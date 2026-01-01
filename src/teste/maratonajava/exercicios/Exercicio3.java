package teste.maratonajava.exercicios;

public class Exercicio3 {

    public static void main(String[] args) {

        //imprimir todos os números pares até 1000000

        for (int x = 0; x <= 1000000; x += 2) {
            System.out.println(x);
        }

        for (int y = 0; y <= 1000000; y++) {
            if (y % 2 == 0) {
                System.out.println(y);
            }
        }

    }

}
