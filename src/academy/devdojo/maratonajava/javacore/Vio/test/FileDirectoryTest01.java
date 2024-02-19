package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileDirectoryTest01 {
    public static void main(String[] args) throws IOException {

        File fileDirectory = new File("pastaCida");
        boolean isCreated = fileDirectory.mkdir();
        System.out.println("Pasta criada ? "+isCreated);

        // como criar um arquivo dentro do diretorio
        File fileArquivoDiretorio = new File(fileDirectory,"teste.txt");
        boolean isfileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado ? "+isfileCreated);

        // renomear um arquivo
        File fileRenamed = new File(fileDirectory, "arquivo_renomeado.txt"); // diretorio e novo nome do arquivo
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado ? "+isRenamed);

        // renomear o diretório
        File diretorioRenamed = new File("arquivosCida");
        boolean renamedDir = fileDirectory.renameTo(diretorioRenamed);
        System.out.println("Diretório renomeado ? "+renamedDir);
    }
}
