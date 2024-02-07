package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01{
    public static void main(String[] args) {

        lerArquivo();
    }

    public static void lerArquivo(){
        // Realizando um try com recursos desde que a variável implemente a interface Closeable
        // Ou seja, o Java se encarrega de fazer a chamada e fechar
        // Neste caso podemos nao definir o bloco catch
        // try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2(); // O java fecha na ordem inversa (2 e 1)
        ){

        }catch(IOException e){

        }
    }

    public static void lerArquivo2() {
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
