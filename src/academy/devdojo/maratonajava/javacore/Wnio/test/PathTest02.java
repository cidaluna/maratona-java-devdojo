package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        // criando pasta
        Path pastaPrincipal = Paths.get("pasta-Cida-Luna-Dev");
        if(Files.notExists(pastaPrincipal)){
            Path pastaDirectory = Files.createDirectory(pastaPrincipal);
        }
        // criando sub pastas
        Path subPasta = Paths.get("pasta-Cida-Luna-Dev/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPasta);

        // criando arquivo
        Path filePath = Paths.get(subPasta.toString(), "arquivo-teste-Java-Cida-Luna.txt");
        if(Files.notExists(filePath)){
            Path filePathCreated = Files.createFile(filePath);
        }

        // renomear arquivo
        Path sourceOrigem = filePath;
        Path targetDestino = Paths.get(filePath.getParent().toString(),"renamed-arquivo-teste-Java-Cida-Luna.txt"); // getParent retorna a pasta (pais) do arquivo
        Files.copy(sourceOrigem,targetDestino, StandardCopyOption.REPLACE_EXISTING);  // se o arquivo for alterado ele faz o replace

    }
}
