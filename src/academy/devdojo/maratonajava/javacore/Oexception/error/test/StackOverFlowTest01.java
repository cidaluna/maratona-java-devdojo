package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        // Causando um erro onde a JVM não consegue recuperar
        // Throwable (Lançável)
        // Throwable tem 2 filhos: Error != Exception
        recursividade();
    }

    // método chama ele mesmo, sem limites, o que faz a pilha stack estourar causando StackOverflowError
    public static void recursividade(){
        recursividade();
    }
}
