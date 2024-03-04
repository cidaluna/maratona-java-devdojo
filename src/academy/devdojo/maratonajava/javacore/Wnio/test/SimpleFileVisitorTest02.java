package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        // o Java chama esse método através do polimorfismo
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;    // segue imprimindo todos os arquivos
        //return FileVisitResult.SKIP_SIBLINGS; // pula o nome dos arquivos irmãos
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Pre visit: " + dir.getFileName());  // iniciando a navegação de pastas e arquivos
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Post visit: " + dir.getFileName());  // saindo da navegação de pastas e arquivos
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        // Definir o diretório e navegar por ele
        Path root = Paths.get("pastaCida");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
