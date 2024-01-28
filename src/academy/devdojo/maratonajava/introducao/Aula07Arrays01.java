package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // somente tipos de referência podem ser inicializados com null
        // no Java quando declaramos um Array precisamos informar o tamanho do array
        // aqui o índice sempre inicia na posição em zero
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
