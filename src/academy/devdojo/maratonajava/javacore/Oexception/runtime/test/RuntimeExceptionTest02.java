package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        // tratar aqui no main, a exception que o método divisao (throw new) poderá lançar
        try{
            // causando uma IllegalArgumentException, argumento inválido zero
            System.out.println(divisao(1,0));
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código finalizado."); // se remover o tratamento da exceção, deixando só divisao, essa linha nunca será chamada
    }


    // ao descrever esse método, eu posso já avisar que
    // esse método tem a possibilidade de lançar um IllegalArgumentException, ou eu posso deixar no comentário documentado

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero.
     */
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
