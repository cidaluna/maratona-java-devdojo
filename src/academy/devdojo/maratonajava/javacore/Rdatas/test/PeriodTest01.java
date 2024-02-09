package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    // ctrl F + ctrl R (atalho para substituição)
    public static void main(String[] args) {

        // Trabalha com tempo, baseada somente na DATA.
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
        Period p1 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1);
        Period p2 = Period.ofDays(10);
        System.out.println(p2);
        Period p3 = Period.ofWeeks(58);
        System.out.println(p3); // retorna quantos dias da 58 semanas
        Period p4 = Period.ofMonths(3);
        System.out.println(p4);
        Period p5 = Period.ofYears(3);
        System.out.println(p5);
        // Como pegar 58 semanas em meses, devemos usar a classe ChronoUnit.
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
    }
}
