package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        // Stream geralmente trabalha com dados binários, baixo nível

        Path arquivoZip = Paths.get("pastaCida/subpasta2/arquivo.zip"); // nome do arquivo zip que sera criado
        Path arquivosParaZipar = Paths.get("pastaCida/subpasta1/subsubpasta1"); // quais arquivos iremos zipar
        zip(arquivoZip, arquivosParaZipar);

    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        // Output Stream tem o Closeable que é fechar os arquivos e tratar exceptions
        // usando a DirectoryStream navega até o local desejado
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar) ){

            for(Path file: directoryStream){ // pega o nome de cada arquivo
                System.out.println(file.getFileName()); // imprime o nome do arquivo
                // prepara a entrada, pega arquivos e coloca no zip e depois manda o arquivo
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString()); // preparando o objeto
                zipOutputStream.putNextEntry(zipEntry); // preparando a entrada
                Files.copy(file, zipOutputStream); // copia o conteudo da origem e grava o conteúdo no arquivo que sera zipado
                zipOutputStream.closeEntry(); // fechando a entrada
            }
            System.out.println("Arquivo criado com sucesso!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
