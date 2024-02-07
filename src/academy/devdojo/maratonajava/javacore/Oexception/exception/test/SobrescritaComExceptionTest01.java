package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.File;
import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario func = new Funcionario();

        try {
            func.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) { // posso declarar 1 ou as 2 exceptions
            e.printStackTrace();
        }
    }

}
