package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            // ao lançar a exceção do tipo checked, precisamos declará-la na assinatura do método
            throw new LoginInvalidoException("Usuário ou senha inválidos!");
        }

        System.out.println("Usuário logado com sucesso!!");
    }
}
