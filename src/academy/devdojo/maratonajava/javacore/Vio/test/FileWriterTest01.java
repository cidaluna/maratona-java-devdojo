package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        // ao trabalhar com recursos do Sistema Operacional, devemos fechar o que foi aberto
        // para deixar isso implicito, podemos neste caso passar o FileWriter como parâmetro no bloco try
        // qdo estamos escrevendo no arquivo o Sist Operacional vai armazenando em buffer
        // existe a possibilidade de fecharmos o arquivo sem que antes o SO tenha terminado de gravar dados no arquivo
        // antes de fechar o arquivo, devemos utilizar o flush
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter("file.txt", true)) { // o true significa que quero ir adicionando dados no arquivo, ao inves de excluir e criar do zero.
            fw.write("O DevDojo é o melhor curso de Java do Brasillll");
            fw.flush();
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}
