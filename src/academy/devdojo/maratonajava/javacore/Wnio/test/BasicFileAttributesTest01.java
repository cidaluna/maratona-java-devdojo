package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.io.File;
import java.time.ZoneOffset;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicFileAttributesTest01 {

    public static void main(String[] args) throws IOException {
        // Basic File Attributes, interface mais geral
        // DOSFileAttribute interface para Windows
        // PosixFileAttributes interface para Linux

        // alterando a data que um arquivo foi modificado
        LocalDateTime date = LocalDateTime.now().minusDays(10); // data de hoje 27/02/24 menos 10 dias
        File file = new File("arquivosCida/novoArquivo01.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());  // pede um long e temos um date

        Path path = Paths.get("arquivosCida/novoArquivo02.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));

    }
}
