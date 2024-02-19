package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
    // A classe Scanner

        String texto = "Levi, Eren, Mikasa";
        String nomes[] = texto.split(",");
        for(String nome: nomes){
            System.out.println(nome.trim()); // trim para remover os espaços em branco
        }
        System.out.println("------------------");
        String texto2 = "Levi5Eren1Mikasa";
        String nomes2[] = texto2.split("\\d");  // delimitador será os dígitos
        for(String nome: nomes2){
            System.out.println(nome);
        }
        System.out.println("------------------");
        System.out.println("Classe Scanner:");
        System.out.println("------------------");

        String texto3 = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto3);
        scanner.useDelimiter(",");  // é como se tivesse 2 ponteiros
        // 1 ponteiro verifica e o outro ponteiro anda
        while(scanner.hasNext()){
           // System.out.println(scanner.next());
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int "+i);
            }else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean "+b);
            }else{
                System.out.println(scanner.next());
            }
        }

    }
}
