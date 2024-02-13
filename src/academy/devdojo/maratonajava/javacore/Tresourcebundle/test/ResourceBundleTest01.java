package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        // é uma forma de internacionalizar a mensagem
        //alterar o idioma, traduzir os recursos da página, baseado no Local

        System.out.println(Locale.getDefault());  // retorna o padrão do meu Sistema Operacional: pt_BR

        // na pasta src, temos que criar um arquivo (messages_pt_BR.properties)
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        // posso verificar se uma determinada chave existe no arquivo
        boolean sasa = bundle.containsKey("sasa");
        System.out.println(sasa);

        boolean texto = bundle.containsKey("hello");
        System.out.println(texto);

        // dado a chave, para retornar o valor podemos fazer
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println("--------------");
        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        // dado a chave, para retornar o valor podemos fazer
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));

        // Atenção com fallback, quando vc procura uma coisa e não tem, e o programa vai procurar em outro lugar
        // Exemplo: busca pelo arquivo Frances, Canadá e vai seguindo caso não encontre até o arquivo "base"
        // Locale("fr","CA")
        // messages_fr_CA.properties
        // messages_fr.properties
        // messages_pt_BR.properties
        // messages_pt.properties
        // messages.properties
        System.out.println(bundle.getString("hi"));  // retorno do arquivo messages.properties
    }
}
