package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {

        Date date = new Date();  // a maioria dos métodos da Classe Date() estão depreciados
        // Date trabalha com milisegundos desde 1970
        System.out.println(date); // imprime hoje
        date = new Date(1_000_000_000_000L);
        // add 1 hora
        // date.setTime((date.getTime() + 3_600_000));
        System.out.println(date);
    }
}
