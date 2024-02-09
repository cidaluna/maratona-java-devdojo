package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        // Trabalha com manipulação de datas através do método with()
        // método withDayOfMonth irá trocar o dia (somente o dia) para o dia passado como parâmetro, mantendo os demais campos
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);
        System.out.println(now);
        System.out.println("-------------------------------------------");

        // método withMonth irá trocar o mês (somente o mês) para o mês passado como parâmetro, mantendo os demais campos
        LocalDate now2 = LocalDate.now();
        now2 = now2.withMonth(10);
        System.out.println("Alterando somente o mês de uma determinada data: ");
        System.out.println(now2);
        System.out.println("-------------------------------------------");

        // pego o dia de hoje que é sexta dia 09/02/2024 e quero saber quando será a próxima sexta-feira
        // utilizando o método next
        LocalDate now3 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("Retorna quando será a próxima sexta-feira, dado que hoje é 09/02/2024: ");
        System.out.println(now3);  // retorna a próxima sexta que é 16/02/2024
        System.out.println(now3.getDayOfWeek());
        System.out.println("-------------------------------------------");

        // pego o dia de hoje que é sexta dia 09/02/2024 e quero saber quando foi a última sexta-feira
        // utilizando o método previous
        LocalDate now4 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println("Retorna quando foi a última sexta-feira, dado que hoje é 09/02/2024: ");
        System.out.println(now4);  // retorna a última sexta que foi 02/02/2024
        System.out.println(now4.getDayOfWeek());
        System.out.println("-------------------------------------------");

        // quero saber o primeiro dia do mês
        // utilizando o método firstDayOfMonth
        LocalDate now5 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Retorna o primeiro dia do mês, dado que hoje é 09/02/2024: ");
        System.out.println(now5);
        System.out.println(now5.getDayOfWeek());
        System.out.println("-------------------------------------------");

        // quero saber qual é o último dia do mês
        // utilizando o método lastDayOfMonth
        LocalDate now6 = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Retorna o último dia do mês, dado que hoje é 09/02/2024: ");
        System.out.println(now6);
        System.out.println(now6.getDayOfWeek());
        System.out.println("-------------------------------------------");

        // quero saber o primeiro dia do próximo mês
        // utilizando o método firstDayOfNextMonth
        LocalDate now7 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("Retorna o primeiro dia do próximo mês, dado que hoje é 09/02/2024: ");
        System.out.println(now7);
        System.out.println(now7.getDayOfWeek());
        System.out.println("-------------------------------------------");

    }
}
