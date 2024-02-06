package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        // fazendo N requisições ao Sistema Operacional, ou ao Banco de Dados
        // é comum N pessoas estar fazendo essas requisições, pedindo os recursos e depois temos que fechar os recursos

        abreConexao();
        //abreConexao2();

    }

    public static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo 1");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta!";
            //throw new RuntimeException();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            // o finally SEMPRE é executado, independente de sucesso, ou erro
            // em casos específicos, onde os recursos precisam ser fechados, a melhor parte é fazer isso no finally
            System.out.println("Fechando recurso liberado pelo S.O.");
        }
        return null;
    }

    // Obs.: o ideal sempre é ter o bloco catch para tratar a exceção
    public static void abreConexao2(){
        try{
            System.out.println("Abrindo arquivo 2");
            System.out.println("Escrevendo dados no arquivo");
        }finally {
            // o finally SEMPRE é executado, independente de sucesso, ou erro
            // em casos específicos, onde os recursos precisam ser fechados, a melhor parte é fazer isso no finally
            System.out.println("Fechando recurso liberado pelo S.O.");
        }
    }

}
