package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        // Trabalha com datas e horas
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 29);
        LocalDate date2 = LocalDate.parse("2022-08-29");
        LocalTime time = LocalTime.of(15,45,55);
        LocalTime time2 = LocalTime.parse("15:45:55");  // tomar cuidado para não receber valor acima de 23 e gerar uma exceção

        System.out.println(ldt);
        System.out.println(date);
        //System.out.println(date2);
        System.out.println(time);
        //System.out.println(time2);
        System.out.println("---------------------");

        // existe a possibilidade de realizarmos uma junção entre essas classes
        LocalDateTime ldt2 = date.atTime(time);  // temos o dia e adicionamos a ele a hora
        LocalDateTime ldt3 = time.atDate(date);  // temos a hora e adicionamos a ela o dia
        System.out.println("LocalDateTime: "+ ldt2);
        System.out.println("LocalDateTime: "+ ldt3);


        /*
        System.out.println("Dia do mês: "+ldt.getDayOfMonth());
        System.out.println("Mês: "+ ldt.getMonth());
        System.out.println("Nº do Mês: "+ ldt.getMonthValue());
        System.out.println("Dia da semana: "+ ldt.getDayOfWeek());
        System.out.println("Dia no mês: "+ ldt.getDayOfMonth());
        System.out.println("Hora: "+ldt.getHour());
        System.out.println("Minuto: " + ldt.getMinute());
        System.out.println("Segundo: "+ ldt.getSecond());
         */

    }
}
