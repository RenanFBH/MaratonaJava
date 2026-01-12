package curso.maratonajava.javacore.Qstring.test;

public class StringTest01 {

    public static void main(String[] args) {

        String nome = "Teste"; // String constant pool
        String nome2 = "Teste";
        nome = nome.concat(" Teste02");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Teste"); // 1 variável de referência, 2 objeto do tipo String, 3 uma String no pool de Strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());


    }

}
