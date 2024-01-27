package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos  + - * /
        int numero01 = 10;
        int numero02 = 20;
        double soma = numero01 + numero02;
        double divisao = numero01 / (double) numero02;
        System.out.println("Soma: " + soma);
        System.out.println("Divisão: " + divisao);

        //  % resto
        int resto = 21 % 7;
        System.out.println("Resto: " +resto);

        // Operadores relacionais do Java  <> <= >= == !=
        boolean isDezMaiorDoQueVinte = 10 > 20;
        boolean isDezMenorDoQueVinte = 10 < 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;

        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;

        System.out.println("isDezMaiorDoQueVinte: "+isDezMaiorDoQueVinte);
        System.out.println("isDezMenorDoQueVinte: "+isDezMenorDoQueVinte);
        System.out.println("isDezMaiorIgualVinte: "+isDezMaiorIgualVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezIgualDez: "+isDezIgualDez);

        int idade = 29;
        float salario = 3380F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " +isDentroDaLeiMenorQueTrinta);

        // Operadores Lógicos:
        // Temos o (AND) && , (OR) || e (NO) !
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);



    }
}
