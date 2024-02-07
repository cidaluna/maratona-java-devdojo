package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{
    // forçando a fazer o tratamento da exceção

    public LoginInvalidoException(){
        super("Login Inválido");
    }

    public LoginInvalidoException(String message){
        super(message);
    }
}
