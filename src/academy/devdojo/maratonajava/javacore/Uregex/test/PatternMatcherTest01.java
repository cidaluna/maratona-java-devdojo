package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // Regex é utilizado para validações, para buscar dados em arquivos, etc
        String regex = "ab";
        String texto = "abaaba";

        // Pattern encontra o padrão e a Matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posições encontradas");
        // Enquanto encontrar ele retorna o primeiro índice
        // Porém ele dá o matcher e continua a varredura da próxima posição em diante, ele não volta pra tras
        while(matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
        System.out.println("-------------------");
        String regex2 = "aba";
        String texto2 = "abababa";

        // Pattern encontra o padrão e a Matcher
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("Texto:  "+texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+regex2);
        System.out.println("Posições encontradas");
        // Enquanto encontrar ele retorna o primeiro índice
        // Porém ele dá o matcher e continua a varredura da próxima posição em diante, ele não volta pra tras
        while(matcher2.find()){
            System.out.print(matcher2.start()+ " " +matcher2.group()+"\n"); // retorna a posicao 0 e a 4 somente, ou seja, encontra, da match e anda pra frente
        }

        // Dado um valor, encontre todos os dígitos e os retorne
        System.out.println("-------------------");
        //  \d = Todos os dígitos
        //  \D = Tudo o que não for dígito
        //  \s = Espaços em branco \t \n \f \r
        //  \S = Todos os caracteres excluindo os espaços em branco
        //  \w = Todas as letras de a-ZA-Z, dígitos, _ underscore
        //  \W = Tudo o que nao for incluso no \w
        //  []
        // Quantificadores:
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // | exemplo o(v|c)o retorna ovo ou oco
        // $ final da linha

        //String regex3 = "\\d";
        //String regex3 = "\\D";
        //String regex3 = "[a-zA-C];
        String regex3 = "\\w";
        String texto3 = "a#__@ade f12swxv    99rp7li661";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(texto3);
        System.out.println("Texto:  "+texto3);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+regex3);
        System.out.println("Posições encontradas");
        // Enquanto encontrar ele retorna o primeiro índice
        // Porém ele dá o matcher e continua a varredura da próxima posição em diante, ele não volta pra tras
        while(matcher3.find()){
            System.out.print("Na posição "+matcher3.start()+ " encontrou: " +matcher3.group()+"\n"); // retorna a posicao 0 e a 4 somente, ou seja, encontra, da match e anda pra frente
        }

        System.out.println("--- Hexadecimal -------------------");
        String regex4 = "0[xX]([0-9a-fA-F])+(\\s|$)";   // Aula 134 regex parte 4 devDojo
        String texto4 = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(texto4);
        System.out.println("Texto:  "+texto4);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+regex4);
        System.out.println("Posições encontradas");
        // Enquanto encontrar ele retorna o primeiro índice
        // Porém ele dá o matcher e continua a varredura da próxima posição em diante, ele não volta pra tras
        while(matcher4.find()){
            System.out.print("Na posição "+matcher4.start()+ " encontrou: " +matcher4.group()+"\n"); // retorna a posicao 0 e a 4 somente, ou seja, encontra, da match e anda pra frente
        }

        System.out.println("--- E-mail -------------------");
        String regex5 = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";   // Aula 135 regex parte 5 devDojo
        String texto5 = "luffy@hotmail.com, 123jotaro@gmail.com, #!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido ?");
        System.out.println("#@!zoro@mail.br".matches(regex5));
        System.out.println(Arrays.toString(texto5.split(",")));
        //System.out.println(texto5.split(",")[1].trim());
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(texto5);
        System.out.println("Texto:  "+texto5);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+regex5);
        System.out.println("Posições encontradas");
        // Enquanto encontrar ele retorna o primeiro índice
        // Porém ele dá o matcher e continua a varredura da próxima posição em diante, ele não volta pra tras
        while(matcher5.find()){
            System.out.print("Na posição "+matcher5.start()+ " encontrou: " +matcher5.group()+"\n"); // retorna a posicao 0 e a 4 somente, ou seja, encontra, da match e anda pra frente
        }
    }
}
