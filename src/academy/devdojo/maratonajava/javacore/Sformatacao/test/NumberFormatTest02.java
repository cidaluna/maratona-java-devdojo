package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        // NumberFormat é uma classe abstrata ou seja, nao posso instanciar, pego o dado com getInstance();

        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        System.out.println("--- Formatação de moedas ---");
        nfa[0] = NumberFormat.getCurrencyInstance(); // padrão no meu sistema operacional (Real) Brasil
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);  // obs. o Japão não retornou dígitos
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);  // nosso Real no BR
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 100_000_000.2130;
        for(NumberFormat numberFormat: nfa){
            // caso queria fixar a qtd de dígitos a serem retornados
            // numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        // nao é possível fazer o parse de número, e sim, de moeda
        String valorString = "100.000.000,21 €";  // moeda da Itália
        try {
            System.out.println("------------------------");
            System.out.println(nfa[3].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
