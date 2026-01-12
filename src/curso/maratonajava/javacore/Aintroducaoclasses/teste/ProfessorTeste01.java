package curso.maratonajava.javacore.Aintroducaoclasses.teste;

import curso.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {

    static void main() {

        Professor professor = new Professor();
        professor.name = "Teste";
        professor.age = 18;
        professor.gender = 'M';

        System.out.println("Nome: " + professor.name + ", idade: " + professor.age + ", gênero " + professor.gender);

    }

}
