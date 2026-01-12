package curso.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {

    public static void main(String[] args) {

        String nome = "Teste";
        nome.concat(" Teste2 ");
        nome = nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder stringBuilder = new StringBuilder("Teste1");
        stringBuilder.append(" Teste3").append(" Teste4");
        stringBuilder.reverse();
        stringBuilder.reverse();
        stringBuilder.delete(0, 3);

        System.out.println(stringBuilder);

    }

}
