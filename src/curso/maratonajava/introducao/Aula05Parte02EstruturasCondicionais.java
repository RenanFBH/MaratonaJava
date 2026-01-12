package curso.maratonajava.introducao;

public class Aula05Parte02EstruturasCondicionais {

    public static void main(String[] args) {

        double salary = 5000;
        String messageOk = "Doar dinheiro";
        String messageNot = "Não doar dinheiro";
        String result = salary > 5000 ? messageOk : messageNot;
        boolean canBuy = salary > 4000;
        System.out.println(result);

    }

}
