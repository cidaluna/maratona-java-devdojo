package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.*;

public class TryWithResourcesTest01{
    public static void main(String[] args) {


    }


    public static void lerArquivo() {
        // Classe Reader para leitura de arquivos
        // BufferedReader é mais otimizado por ser um buffer
        // FileReader trabalha com a exception FileNotFoundException
        // se eu colocar na assinatura desse método throws FileNotFoundException eu jogo o problema pra quem chamar esse método tratar
        // se eu quiser tratar, eu implemento aqui o try catch
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(reader != null){
                    reader.close(); // boa prática sempre fechar o arquivo no bloco que sempre será executado
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }
}
