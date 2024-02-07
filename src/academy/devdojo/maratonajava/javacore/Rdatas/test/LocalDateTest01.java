package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        // Atualmente é recomendado a utilização da classe LocalDate ao invés da Date.
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY);
        System.out.println(Month.JANUARY.getValue());  // retorna 1

        // Jtime é similar a Java Time
        System.out.println("-----------------  "); // Niver Cida Luna Dev
        LocalDate date = LocalDate.of(1987,Month.APRIL, 18); // só trabalha com data, não tem a hora
        System.out.println("Ano-Mês-Dia: "+ date);  // permite salvar dessa forma no Banco de Dados
        System.out.println("Ano: "+ date.getYear());  // retorna o ano
        System.out.println("Mês: "+ date.getMonth());
        System.out.println("Nº do Mês: "+ date.getMonthValue());
        System.out.println("Dia da semana: "+ date.getDayOfWeek());
        System.out.println("Dia no mês: "+ date.getDayOfMonth());
        System.out.println("Qtd de dias no mês: "+ date.lengthOfMonth());  // qtos dias tem o mês 30, 31, 28
        System.out.println("É ano bissexto: "+ date.isLeapYear());  // retorna true se for ano bissexto ou false se não for
        System.out.println("Busca o ano: "+ date.get(ChronoField.YEAR));  //  busca o ano
        System.out.println("Busca o dia do mês: "+ date.get(ChronoField.DAY_OF_MONTH));  // busca o dia do mês

        System.out.println("\n------ AGORA ------");
        LocalDate agora = LocalDate.now(); // recupera a data de agora
        System.out.println("Ano-Mês-Dia: "+ agora);  // permite salvar dessa forma no Banco de Dados
        System.out.println("Ano: "+ agora.getYear());  // retorna o ano
        System.out.println("Mês: "+ agora.getMonth());
        System.out.println("Nº do Mês: "+ agora.getMonthValue());
        System.out.println("Dia da semana: "+ agora.getDayOfWeek());
        System.out.println("Dia no mês: "+ agora.getDayOfMonth());
        System.out.println("Qtd de dias no mês: "+ agora.lengthOfMonth());  // qtos dias tem o mês 30, 31, 28
        System.out.println("É ano bissexto: "+ agora.isLeapYear());  // retorna true se for ano bissexto ou false se não for
        System.out.println("Busca o ano: "+ agora.get(ChronoField.YEAR));  //  busca o ano
        System.out.println("Busca o dia do mês: "+ agora.get(ChronoField.DAY_OF_MONTH));  // busca o dia do mês

        //Data máxima e Data mínima permitida
        //System.out.println(LocalDate.MAX);
        //System.out.println(LocalDate.MIN);
    }
}
