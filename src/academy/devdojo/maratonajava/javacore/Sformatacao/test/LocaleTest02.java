package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {

        // saber como meu computador está configurado
        System.out.println(Locale.getDefault());  // retorna pt_BR
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        // todas as línguas
        for(String isoLanguage: isoLanguages){
            System.out.print(isoLanguage+ " ");
        }
        System.out.println();

        // todos os países
        for(String isoCountry: isoCountries){
            System.out.print(isoCountry+ " ");
        }
    }
}
