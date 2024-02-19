package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        // caso queira salvar numa pasta, utilizar o caminho absoluto
        // caso nao especifique ele cria o arquivo na raiz fora da pasta src
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();  // cria o arquivo
            System.out.println("Created "+isCreated);  // retorna true or false

            // imprimir o caminho (path) do arquivo
            // imprimir o caminho absoluto (path) do arquivo
            System.out.println("Path: "+file.getPath());
            System.out.println("Absolute path: "+file.getAbsolutePath());
            System.out.println("Is directory ? "+file.isDirectory());  // é um diretório ?
            System.out.println("Is file ? "+file.isFile());            // é um arquivo ?
            System.out.println("Is hidden ? "+file.isHidden());         // é oculto ?
            System.out.println("Can read file ? "+file.canRead());     // pode ler ?
            //System.out.println("Last modified: "+file.lastModified()); // última modificação retorna long (em milisegundos)
            System.out.println("Date last modified: "+ new Date(file.lastModified())); // data da última modificação
            System.out.println("Date last modified: "+ Instant.ofEpochMilli(file.lastModified())); // data da última modificação
            System.out.println("Date last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); // data da última modificação

            // verificar se o arquivo existe e excluir o arquivo
            boolean exists = file.exists();
            if(exists){
                System.out.println("Deleted "+file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
