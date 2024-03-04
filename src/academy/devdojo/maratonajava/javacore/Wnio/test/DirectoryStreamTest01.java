package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        // meu diretório atual chama maratona-java-devdojo, para pegar esse diretório atual, passo o ponto
        Path dir = Paths.get(".");
        // criar um path DirectoryStream pra cada arquivo encontrado
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            // fluxo podendo ser iterado
            for(Path path: stream){
                System.out.println(path.getFileName()); // lista todos os arquivos dentro deste projeto, incluindo os arquivos ocultos
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
