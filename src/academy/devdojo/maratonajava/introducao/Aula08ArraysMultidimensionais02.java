package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][]; // o array j é de tamanho indefinido

        arrayInt[0] = new int[2];  // esse new int[2] significa que é um array j que tem 2 posições
        arrayInt[1] = new int[]{1,2,3};  // array j tem 3 posições
        arrayInt[2] = new int[6];  // array j tem 6 posições

        for(int[] arrBase: arrayInt){
            System.out.println("\n --------");
            for(int num: arrBase){
                System.out.print(num+ " ");  // imprimir os valores do array j na mesma linha
            }
        }
    }
}
