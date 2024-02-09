package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {

        // Trabalha com intervalo entre 2 datas, baseada em segundos e nanosegundos
        // A Duration não aceita LocalDate (porque a LocalDate não tem segundos)
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(d1);  // 09/02/2024 retorna 17544horas, ISO 8601, P é período, T é tempo
        System.out.println(d2);
        System.out.println(d3);
        Duration d4 = Duration.ofDays(20);  // 20 dias em horas equivale a 480 horas
        System.out.println(d4);             // retorna PT 480H
        Duration d5 = Duration.ofMinutes(3);
        System.out.println(d5);
        Duration d6 = Duration.of(3, ChronoUnit.HOURS); // não utilizar, pois pode ser que n ChronoUnit não dê suporte
        System.out.println(d6);
    }
}
