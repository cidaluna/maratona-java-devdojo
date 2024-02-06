package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        // método main também poderá lançar uma IOException
        // útil por exemplo quando o pagamento de uma compra online falhar
        // captura a exceção, lança, imprime no console, e re-lança (throw e )pra quem chamou
        criarNovoArquivo();
    }


    // método privado e aviso na assinatura do método que ele poderá lançar uma IOException e
    // dessa forma, joga a responsabilidade pra quem chamar esse método
    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");
        // tenta fazer algo (bloco try), se não der certo, realiza o tratamento definido no bloco catch da exception
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+ isCriado);
        }catch(IOException e){
            // nao podemos deixar esse bloco em branco NUNCA
            // evite colocar aqui as regras de negócio
            // nesse exemplo, vamos somente imprimir a exceção no console
            e.printStackTrace(); // imprime a exceção no console
            throw e; // re-lança,por exemplo, depois de um tempo um outro método pode fazer uma nova tentativa
        }

        // removi da pasta arquivo a permissão de gravação
        // logo, obtive a IOException de acesso negado
    }
}
