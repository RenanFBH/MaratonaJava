package curso.maratonajava.javacore.Kenum.test;

import curso.maratonajava.javacore.Kenum.dominio.Cliente;
import curso.maratonajava.javacore.Kenum.dominio.TipoCliente;
import curso.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Teste1", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2= new Cliente("Teste2", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("a Física");
        System.out.println(tipoCliente2);
    }
}
