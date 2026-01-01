package teste.maratonajava.introducao;

public class Aula05Parte01EstruturasCondicionais {

    public static void main(String[] args) {

        int age = 20;
        boolean isAuthorizedCNH = age >= 18;

        if (isAuthorizedCNH) {
            System.out.println("Autorizado a tirar CNH");
        }
        if (!isAuthorizedCNH) {
            System.out.println("Não autorizado");
        }

        boolean c = false;

        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

    }

}
