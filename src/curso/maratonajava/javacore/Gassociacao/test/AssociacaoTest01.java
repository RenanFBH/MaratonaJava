package curso.maratonajava.javacore.Gassociacao.test;

import curso.maratonajava.javacore.Gassociacao.dominio.Aluno;
import curso.maratonajava.javacore.Gassociacao.dominio.Local;
import curso.maratonajava.javacore.Gassociacao.dominio.Professor2;
import curso.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Brasil");
        Professor2 p1 = new Professor2("Teste", "Desenvolvimento de Software");
        Aluno a1 = new Aluno("Teste2", 18);
        Aluno alunos[] = {a1};
        Seminario s1 = new Seminario("Teste3", alunos, local);
        Seminario seminarios[] = {s1};
        p1.setSeminarios(seminarios);
        a1.setSeminario(s1);
        p1.imprime();
    }
}
