package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        // Instant trabalha com nanosegundos desde 1970

        Instant now = Instant.now(); // retorna o Z no final, representa o zulutime (horário neutro do mundo)
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        // quando salvamos data e hora no Banco de Dados, é importante saber a zona (região) onde o dado foi salvo
        // geralmente salvamos na zona UTC

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());  // 999.999.999
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));
    }
}
