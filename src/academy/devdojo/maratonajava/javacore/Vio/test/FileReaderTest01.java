package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)){
            //  método read retorna um integer que representa o primeiro caracter do arquivo file.txt
            // tabela ascii
            // System.out.println(fr.read());
            char[] in = new char[13]; // passa a quantidade de posições desejada
            fr.read(in);
            for(char c: in){
                System.out.print(c);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("\n---------------------");
        try(FileReader fr = new FileReader(file)){
            //  método read retorna um integer que representa o primeiro caracter do arquivo file.txt
            // tabela ascii
            // -1 representa o fim do arquivo
            int i;
            while((i=fr.read()) != -1 ) {
                System.out.print((char)i);  // faz cast caso contrário retorna integer do código ascii de cada posição
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
