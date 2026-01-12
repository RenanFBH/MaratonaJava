package curso.maratonajava.javacore.Oexception.exception.test;

import curso.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import curso.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import curso.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
