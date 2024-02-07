package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    // a perfomance do sistema conforme vou criando strings vai demorando cada vez mais
    // sistemas governamentais, sistemas como a amazom, não podem esperar esse tempo alto
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        // concatString(100);   // para executar 100 iterações, o programa retornou 23 milisegundos
        concatString(10_000);  // para executar 10 mil iterações, o programa retornou 3305 milisegundos
        //concatString(100_000);  // para executar 100 mil iterações, o programa retornou 316157 milisegundos (5 minutos)
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " +(fim-inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(10_000);  // para executar 10 mil iterações com StringBuilder, o programa retornou 4 ms
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " +(fim-inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(10_000);  // para executar 10 mil iterações com StringBuffer, o programa retornou 8 ms
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " +(fim-inicio) + " ms");
    }

    private static void concatString(int tamanho){
        // colocar dentro do pool de strings
        String texto = "";
        for(int i=0; i<tamanho; i++){
            texto += i;  // 0,01,012,0123, 01234...
            //System.out.println(texto+ ", ");
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i=0; i<tamanho; i++){
            sb.append(i);  // 0,01,012,0123, 01234...
            //System.out.println(sb+ ", ");
        }
    }

    // em cenários de múltiplas threads (N pessoas) tentando acessar o mesmo recurso, utilizamos o Buffer
    private static void concatStringBuffer(int tamanho){
        StringBuffer sf = new StringBuffer(tamanho);
        for(int i=0; i<tamanho; i++){
            sf.append(i);  // 0,01,012,0123, 01234...
            //System.out.println(sf+ ", ");
        }
    }
}
