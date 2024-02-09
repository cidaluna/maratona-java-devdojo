package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        // Trabalha com Data, ano, mês, dia, período, nanosegundos...

        LocalDateTime aniversario = LocalDateTime.of(1987, Month.APRIL,18,10,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now)); // quantas semanas eu tenho de vida
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println("Idade: "+ChronoUnit.YEARS.between(aniversario, now));
    }
}
