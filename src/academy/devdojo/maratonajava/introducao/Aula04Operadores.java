package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Aula 15 Operadores aritméticos  + - * /
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

        // Aula 18 Operadores Lógicos:
        // Temos o (AND) && , (OR) || e (NO) !
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);


        // Aula 19 Operadores de atribuição
        // = += *= /= %=
        double bonus = 1800;
        double resultadoMais = bonus += 1000;         //equivalente a bonus = bonus + 1000;
        double resultadoMenos = bonus -= 1000;         //equivalente a bonus = bonus - 1000;
        double resultadoVezes = bonus *= 2;         //equivalente a bonus = bonus * 2;
        double resultadoDividir = bonus /= 2;         //equivalente a bonus = bonus / 2;
        double resultadoResto = bonus %= 2;         //equivalente a bonus = bonus % 2;
        System.out.println("bonusMais: " +resultadoMais);
        System.out.println("bonusMenos: " +resultadoMenos);
        System.out.println("bonusVezes: " +resultadoVezes);
        System.out.println("bonusDividir: " +resultadoDividir);
        System.out.println("bonusResto: " +resultadoResto);

        // Operadores de decremento e incremento
        int contador = 0;
        contador += 1;  // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(++contador2);
    }
}
