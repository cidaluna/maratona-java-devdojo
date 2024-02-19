package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            //  método read retorna um integer que representa o primeiro caracter do arquivo file.txt
            // tabela ascii
            // -1 representa o fim do arquivo
            br.readLine();  // faz a leitura da linha inteira, se acabar a leitura retorna null
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
