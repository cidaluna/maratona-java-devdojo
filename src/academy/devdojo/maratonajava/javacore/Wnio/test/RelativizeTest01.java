package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {

        Path dir = Paths.get("/home/cida");
        Path clazz = Paths.get("/home/cida/devdojo/OlaMundo.java");
        // do diretorio fictício dir quer chegar na classe OlaMundo.java
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);
        System.out.println("-----------------------");
        Path absoluto1 = Paths.get("/home/cida");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/cida/devdojo/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.27022024");

        // supondo que estou no dir /home/cida irá retornar o caminho que falta para chegar no arq devdojo/OlaMundo.java
        System.out.println("1: "+ absoluto1.relativize(absoluto3));
        System.out.println("2: "+ absoluto3.relativize(absoluto1));
        System.out.println("3: " + absoluto1.relativize(absoluto2));
        System.out.println("4: " + relativo1.relativize(relativo2));
        System.out.println("5: " + relativo2.relativize(relativo1));
        System.out.println("6: " + absoluto1.relativize(relativo1)); // o Java nao consegue chegar nesse lugar, gera exception
    }
}
