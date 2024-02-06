package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

        criarNovoArquivo();

    }


    public static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        // tenta fazer algo (bloco try), se não der certo, realiza o tratamento definido no bloco catch da exception
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+ isCriado);
        }catch(IOException e){
            // nao podemos deixar esse bloco em branco NUNCA
            // evite colocar aqui as regras de negócio
            // nesse exemplo, vamos somente imprimir a exceção no console
            e.printStackTrace();
        }
    }
}
