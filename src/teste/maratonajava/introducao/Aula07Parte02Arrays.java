package teste.maratonajava.introducao;

public class Aula07Parte02Arrays {

    public static void main(String[] args) {

        // byte, short, int, long, float, double = 0
        // char = '\u0000'
        // boolean = false
        // String = null

        String[] nomes = new String[3];
        nomes[0] = "Teste1";
        nomes[1] = "Teste2";
        nomes[2] = "Teste3";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[5];
        System.out.println(nomes[1]);

    }

}
