package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Cida Luna";
        nome.concat(" Maratona Java ");
        //System.out.println(nome); // foi criado no pool de strings e nao foi concatenado nada

        // Trabalhando com a classe StringBuilder
        StringBuilder sb = new StringBuilder("Cida"); // por padrão se vazio o tamanho é 16, transforma o valor numa string
        sb.append(" DevDojo");
        sb.reverse();
        sb.delete(0,4);
        System.out.println(sb);
    }
}
