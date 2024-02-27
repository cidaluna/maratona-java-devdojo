package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {

        String diretorioLuna = "pasta-Cida-Luna-Dev/subpasta/subsubpasta";
        String arquivoLuna = "../../arquivo-teste-Java-Cida-Luna.txt";
        Path path1 = Paths.get(diretorioLuna, arquivoLuna);
        System.out.println(path1); // retorna pasta-Cida-Luna-Dev\subpasta\subsubpasta\..\..\arquivo-teste-Java-Cida-Luna.txt

        System.out.println(path1.normalize()); //retorna pasta-Cida-Luna-Dev\arquivo-teste-Java-Cida-Luna.txt

    }
}
