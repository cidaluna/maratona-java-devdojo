package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        // é da classe Java.util
        // nao posso instanciar a classe Calendar, aqui no Brasil utilizamos o calendar do tipo gregoriano
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date); // formatando através da classe Date, mas existem outras formas que iremos abordar

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão é o primeiro dia da semana");
        }
        System.out.println("Dia na semana: "+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia no mês: "+ c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia no ano: "+ c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Dia da semana no mês: "+ c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Semana no mês: "+ c.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana no ano: "+ c.get(Calendar.WEEK_OF_YEAR));

        // acrescenta horas no mesmo dia, sem virar o dia
        c.roll(Calendar.HOUR, 6);
        Date date2 = c.getTime();
        System.out.println("Acrescentando 6 horas = "+ date2);
    }
}
