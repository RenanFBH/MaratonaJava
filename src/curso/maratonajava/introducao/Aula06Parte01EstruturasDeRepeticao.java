package curso.maratonajava.introducao;

public class Aula06Parte01EstruturasDeRepeticao {

    public static void main(String[] args) {

        int cont = 12;
        while(cont < 10) {
            System.out.println(++cont);
        }

        cont = 0;
        do {
            System.out.println("Dentro do do-while " + ++cont);
        } while (cont < 10);

        for (int x = 0; x < 10; x += 2) {
            System.out.println("for " + x);
        }


    }

}
