package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {

        // caminho relativo
        Path dir = Paths.get("pasta-Cida-Luna-Dev");
        Path arquivo = Paths.get("abcd/arquivo-teste-Java-Cida-Luna.txt");

        Path resolve = dir.resolve(arquivo); // o método resolve vai juntar os paths
        System.out.println(resolve);
        System.out.println("------------------------------");

        // caminho absoluto começa com barra
        Path absoluto = Paths.get("/pasta-Cida-Luna-Dev/subpasta");
        Path relativo = Paths.get("aeiou");
        Path file = Paths.get("testeArquivo.txt");

        System.out.println("1: " + absoluto.resolve(relativo)); // retorna /pasta-Cida-Luna-Dev/subpasta/aeiou
        System.out.println("2: " + absoluto.resolve(file)); // retorna /pasta-Cida-Luna-Dev/subpasta/testeArquivo.txt
        System.out.println("3: " + relativo.resolve(absoluto)); // nao funciona pois parte que ja tem um caminho absoluto, retorna /pasta-Cida-Luna-Dev/subpasta
        System.out.println("4: " + relativo.resolve(file));  // retorna aeiou/testeArquivo.txt
        System.out.println("5: " + file.resolve(absoluto));  // retorna /pasta-Cida-Luna-Dev/subpasta
        System.out.println("6: " + file.resolve(relativo));  // retorna textArquivo.txt/aeiou

    }
}
