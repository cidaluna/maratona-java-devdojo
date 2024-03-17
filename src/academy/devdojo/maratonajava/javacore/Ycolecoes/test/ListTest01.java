package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Cida");
        nomes.add("Jose");
        nomes.add("Maria");

        for(String n : nomes){
            System.out.println(n);
        }
        nomes.add("Joao");

        System.out.println("-------------------");
        for(int i=0;i<nomes.size();i++){
            System.out.println(nomes.get(i));  // outra forma de recuperar os dados ordenados da Lista
        }
    }
}
