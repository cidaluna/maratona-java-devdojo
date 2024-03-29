package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        // NumberFormat é uma classe abstrata ou seja, nao posso instanciar, pego o dado com getInstance();

        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        System.out.println("--- Formatação de números ---");
        nfa[0] = NumberFormat.getInstance();  // padrão no meu sistema operacional
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;
        for(NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1_000.21";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
