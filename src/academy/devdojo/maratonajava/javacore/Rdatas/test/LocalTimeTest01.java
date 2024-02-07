package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        // LocalTime trabalha com horas
        LocalTime hora = LocalTime.of(23,32,11);  // hora( de 0 que é meia-noite até 23), minutos e segundos
        System.out.println(hora);
        System.out.println("Hora: "+hora.getHour());
        System.out.println("Minuto: "+hora.getMinute());
        System.out.println("Segundo: "+hora.getSecond());
        System.out.println("Hora do Dia: "+ hora.get(ChronoField.HOUR_OF_DAY));  // vem da TemporalField

        System.out.println("----------------------");
        // pegar a hora de agora
        LocalTime horaAgora = LocalTime.now();
        System.out.println(horaAgora);  // retorna inclusive o nanosegundo
        System.out.println("Hora: "   + horaAgora.getHour());
        System.out.println("Minuto: " + horaAgora.getMinute());
        System.out.println("Segundo: "+ horaAgora.getSecond());
        System.out.println("Hora do Dia: "   + horaAgora.get(ChronoField.HOUR_OF_DAY));  // vem da TemporalField
        System.out.println("AM/PM: "   + horaAgora.get(ChronoField.CLOCK_HOUR_OF_AMPM));

        System.out.println("----------------------");
        // se precisar pegar a hora meia-noite
        System.out.println("Pegar meia-noite:    " +LocalTime.MIDNIGHT);
        System.out.println("Pegar começo do dia: " +LocalTime.MIN); // pegando o começo do dia que tbm é meia-noite mas usa o MIN
        System.out.println("Pegar o fim do dia:  " +LocalTime.MAX); // fim do dia, util para gerar relatórios diários

    }
}
