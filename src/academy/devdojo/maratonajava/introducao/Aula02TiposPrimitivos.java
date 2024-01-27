package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    // Atalhos:
    // psvm + tab
    // sout + tab
    public static void main(String[] args) {
        // Existem 8 tipos de dados primitivos, que guardam em memória um valor simples
        // int, double, float, char, byte, short, long, boolean (sempre com letras minúsculas)
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 33;  // traduz o que está aqui para o valor que está na tabela ASCII
        char caractere2 = '\u0041';

        System.out.println("A idade é " +idade+ " anos.");
        System.out.println(falso);
        System.out.println("Char "+caractere);
        System.out.println("Char "+caractere2);
    }
}
