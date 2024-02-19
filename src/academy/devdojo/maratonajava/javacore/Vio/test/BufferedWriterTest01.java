package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
    // BufferedWriter encapsula a FileWriter
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter("file.txt", true);  // o true significa que quero ir adicionando dados no arquivo, ao inves de excluir e criar do zero.
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Teste com BufferedWriter O DevDojo é o melhor curso de Java do Brasillll");
            bw.newLine();  // busca pelo separador de linha do sistema operacional
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
