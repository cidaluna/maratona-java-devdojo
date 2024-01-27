package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero01 = 10;
        int numero02 = 20;
        double soma = numero01 + numero02;
        double divisao = numero01 / (double) numero02;
        System.out.println("Soma: " + soma);
        System.out.println("Divisão: " + divisao);

        //  % resto
        int resto = 21 % 7;
        System.out.println("Resto: " +resto);

        // <> <= >= == !=
        boolean isDezMaiorDoQueVinte = 10 > 20;
        boolean isDezMenorDoQueVinte = 10 < 20;

        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;

        System.out.println("isDezMaiorDoQueVinte: "+isDezMaiorDoQueVinte);
        System.out.println("isDezMenorDoQueVinte: "+isDezMenorDoQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezIgualDez: "+isDezIgualDez);

    }
}
