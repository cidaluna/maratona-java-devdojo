package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        // causando uma ArithmeticException, divisão por zero
        System.out.println(divisao(1,0));

    }

    private static int divisao(int a, int b){
        // tenta fazer algo (bloco try), se não der certo, realiza o tratamento definido no bloco catch da exception
        // e retorna um int zero
        try{
            return a/b;
        }catch(RuntimeException e){
            // nao podemos deixar esse bloco em branco NUNCA
            // evite colocar aqui as regras de negócio
            // nesse exemplo, vamos
            e.printStackTrace();
        }
        return 0; // neste caso, a JVM irá imprimir a stack do bloco catch e em seguida retornara zero.
    }
}
