package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        switch(dayOfWeek){
            case THURSDAY: addDays = 4; break;
            case FRIDAY: addDays = 3; break;
            case SATURDAY: addDays = 2; break;
            default: addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        // Dado data seg, retorna terça, terça retorna quarta, quarta retorna quinta
        // Dado quinta ou sexta ou sábado ou domingo, deve retornar segunda-feira

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDate now2 = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now2);
        System.out.println(now2.getDayOfWeek());
        System.out.println("------------------------------");

        // Dado quarta 31/01/2024 retorna quinta 01/02/2024
        LocalDate now3 = LocalDate.of(2024, Month.JANUARY, 31).with(new ObterProximoDiaUtil());
        System.out.println("Próximo dia útil definido: "+ now3);
        System.out.println(now3.getDayOfWeek());
        System.out.println("------------------------------");


        // Dado sábado 03/02/2024 retorna segunda 05/02/2024
        LocalDate now4 = LocalDate.of(2024, Month.FEBRUARY, 3).with(new ObterProximoDiaUtil());
        System.out.println("Próximo dia útil definido: "+ now4);
        System.out.println(now4.getDayOfWeek());


    }
}
