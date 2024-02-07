package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        // A SimpleDateFormat oferece um pouco mais de flexibilidade do que a DateFormat, olhar na documentação
        // y representa Year
        // Y representa Week year
        // a representa am/pm
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";  // o que esta entre aspas simples o SimpleDateFormat ignora
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String dataFormatada1 = sdf.format(new Date());
        System.out.println(dataFormatada1);

        System.out.println("-------------");
        String pattern2 = "'Amsterdam' dd 'de' MMMM 'de' yyyy";  // o que esta entre aspas simples o SimpleDateFormat ignora
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        String dataFormatada2 = sdf2.format(new Date());
        System.out.println(dataFormatada2);

        // fazendo um parse passando o resultado desejado, e ele irá retornar um Date
        System.out.println("-------------");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MMMM-yyyy", Locale.ENGLISH);
        String pattern3 = "07-February-2024";
        try {
            Date date = sdf3.parse(pattern3);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
