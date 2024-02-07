package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome = "Luffy";
        String nome2 = "    Cida   ";
        String numeros = "012345";
        // analisando retorno do métodos
        System.out.println(nome.charAt(0)); // retorna o valor que está no índice informado
        System.out.println(nome.length());  // retorna o tamanho da string, ou seja, a quantidade de caracteres do valor da String
        System.out.println(nome.replace("L", "M")); // troca valor antigo por um valo novo
        System.out.println(nome.toLowerCase()); // transforma tudo em minúsculo
        System.out.println(nome.toUpperCase()); // trasnforma tudo em maiúsculo
        System.out.println(" --- Substring ---");
        System.out.println(numeros.substring(0,2)); // indice de começo e o índice final só que menos 1
        System.out.println(nome.substring(0,2));    // indice de começo e o índice final só que menos 1
        System.out.println(numeros.substring(0,numeros.length())); // retorna tudo, de zero até o final da string
        System.out.println(numeros.substring(3,numeros.length())); // retorna da posição 3 até o final da string
        System.out.println(" ---------------");
        System.out.println(nome2.trim()); // remove os espaços em branco do começo e do fim da string
    }
}
