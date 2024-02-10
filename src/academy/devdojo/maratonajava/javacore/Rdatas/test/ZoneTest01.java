package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.io.IOException;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.zone.ZoneRulesException;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {

        // O Java oferece suporte para diversas zonas, exemplo America/São Paulo, America/Los Angeles, etc
        // Map é uma coleção de chave e valor

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        // A zona do Java geralmente é diferente da zona do computador, no computador temos UTC-Brasilia
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.getAvailableZoneIds());
        // tenta fazer algo (bloco try), se não der certo, realiza o tratamento definido no bloco catch da exception
        try{
            ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
            System.out.println("Recuperando dados de Tokyo: "+ tokyoZone);
        }catch(ZoneRulesException e){
            // nao podemos deixar esse bloco em branco NUNCA
            // evite colocar aqui as regras de negócio
            // nesse exemplo, vamos somente imprimir a exceção no console
            e.printStackTrace(); // imprime a exceção no console
        }finally{
            System.out.println("Fim da execução!"); // o finally sempre é executado independente do cenário
        }

        System.out.println("-----------------------");
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zdt = nowInstant.atZone(tokyoZone);
        System.out.println(zdt);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = nowInstant.atOffset(offSetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offSetManaus);
        System.out.println(offsetDateTime2);

        JapaneseDate jd = JapaneseDate.from(LocalDate.now());
        System.out.println(jd);
        LocalDate meijiEraLD = LocalDate.of(1900,2,1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLD);
        System.out.println(meijiEra);
    }
}
