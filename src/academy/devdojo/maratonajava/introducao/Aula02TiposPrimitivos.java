package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    // Atalhos:
    // psvm + tab
    // sout + tab
    public static void main(String[] args) {
        // Existem 8 tipos de dados primitivos, que guardam em memória um valor simples
        // int, double, float, char, byte, short, long, boolean (sempre com letras minúsculas)

        // Obs. a string NÃO é um tipo primitivo, String é uma classe, deve começar com letra maiúscula
        int idade = 10;
        long numeroGrande = 100000L;
        // cast é forçar colocar por exemlo um long dentro de um int, o problema é que na impressao sai cortado
        int castIdade = (int)10000000000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 33;  // traduz o que está aqui para o valor que está na tabela ASCII
        char caractere2 = '\u0041';

        String nome = "Cida Luna";
        // A partir do nível 10 da linguagem Java é possível declarar uma variável como var
        // exemplo var nome = "Cida"; (configura em module settings language level)
        System.out.println("A idade é " +idade+ " anos.");
        System.out.println(falso);
        System.out.println("Casting: " +castIdade); // nao recomendado
        System.out.println("Char: "+caractere);
        System.out.println("Char2: "+caractere2);
        System.out.println("String não é tipo primitivo!!");
        System.out.println("String é uma classe: " +nome);
    }
}
