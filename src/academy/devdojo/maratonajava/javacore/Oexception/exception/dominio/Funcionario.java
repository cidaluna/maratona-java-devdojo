package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    // ao sobrescrever posso lançar 1 ou + exceções, posso lançar exceção runtime
    // nao posso colocar exceção do tipo checked se ela nao foi declarada no método original
    public void salvar() throws LoginInvalidoException, FileNotFoundException {  // posso declarar 1 ou as 2 exceptions
        System.out.println("Salvando funcionário");
    }
}
