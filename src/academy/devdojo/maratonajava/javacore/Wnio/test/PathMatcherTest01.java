package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {

        Path path1 = Paths.get("pastaCida/subpasta2/teste1.txt");
        Path path2 = Paths.get("pastaCida/subpasta2/teste2.java"); // java tem 4 letras retorna false na linha 20
        Path path3 = Paths.get("pastaCida/subpasta2/testeABCD.bkp");
        // quero ver se o arquivo da match com extensao .bkp
        matches(path3, "glob:*.bkp");   // um * asteriscos não considera os diretórios
        matches(path3, "glob:**/*.bkp");  // dois ** asteriscos consideram os diretórios
        matches(path3, "glob:**/*.{bkp,txt,java}");  // ignorar os diretórios atras e busca N extensoes
        System.out.println("----------------------------");
        matches(path1, "glob:**/*.???");  // buscar pela quantidade de letras 3 = ??? ou 4 letras = ????
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");
        matches(path3, "glob:**/*.????"); // 4 letras
        matches(path3, "glob:**/testeABCD.???");
        matches(path3, "glob:**/teste1.???");
    }

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println("GLOB: "+ matcher.matches(path));
    }
}
