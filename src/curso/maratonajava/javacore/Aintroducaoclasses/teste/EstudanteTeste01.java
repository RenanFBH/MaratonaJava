package curso.maratonajava.javacore.Aintroducaoclasses.teste;

import curso.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Teste";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }

}
