package teste.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.60;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
