package curso.maratonajava.exercicios.test;

import curso.maratonajava.exercicios.dominio.Departamento;
import curso.maratonajava.exercicios.dominio.Pessoa;
import curso.maratonajava.exercicios.dominio.Universidade;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Albert Eistein", "14/03/1879");
        Pessoa pessoa2 = new Pessoa("Isaac Newton", "04/01/1643");
        Universidade universidade1 = new Universidade("Universidade de Nova Jersey", "Estados Unidos da América");
        Universidade universidade2 = new Universidade("Universidade de Cambridge", "Estados Unidos da América");
        pessoa1.setUniversidade(universidade1);
        pessoa2.setUniversidade(universidade2);
        pessoa1.informacoes();
        pessoa2.informacoes();
        Departamento departamento1 = new Departamento("Tecnologia");
        Departamento departamento2 = new Departamento("Administração");
        Departamento[] departamentos = {departamento1, departamento2};
        universidade1.setDepartamentos(departamentos);
        universidade2.setDepartamentos(departamentos);
        pessoa1.setDepartamento(departamento1);
        pessoa2.setDepartamento(departamento2);
        System.out.println();
        pessoa1.informacoes();
        pessoa2.informacoes();
    }
}
