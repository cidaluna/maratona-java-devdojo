package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = inicializa por padrão com 0 zero
        // char    = '\u0000'
        // boolean = false
        // String  = null

        char[] ab = new char[3];
        // imprimindo o valor em cada posição do array
        System.out.println(ab[0]);
        System.out.println(ab[1]);
        System.out.println(ab[2]);

        System.out.println("-----------------");
        float[] abc = new float[3];
        // imprimindo o valor em cada posição do array
        System.out.println(abc[0]);
        System.out.println(abc[1]);
        System.out.println(abc[2]);

        System.out.println("-----------------");
        boolean[] abcd = new boolean[3];
        // imprimindo o valor em cada posição do array
        System.out.println(abcd[0]);
        System.out.println(abcd[1]);
        System.out.println(abcd[2]);

        System.out.println("-----------------");
        String[] nomes = new String[4];
        nomes[0] = "Luna";
        nomes[1] = "Batista";
        nomes[2] = "Silva";
        nomes[3] = "Peres";

        // imprimindo o valor em cada posição do array
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
