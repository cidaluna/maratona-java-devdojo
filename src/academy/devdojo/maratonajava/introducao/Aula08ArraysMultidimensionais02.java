package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] novoArray = {11,220,33,440};
        int[][] arrayInt = new int[4][]; // o array j é de tamanho indefinido

        arrayInt[0] = new int[2];  // esse new int[2] significa que é um array j que tem 2 posições
        arrayInt[1] = new int[]{1,2,3};  // array j tem 3 posições
        arrayInt[2] = new int[6];  // array j tem 6 posições
        arrayInt[3] = novoArray;   // declarado novo array com 4 posições


        for(int[] arrBase: arrayInt){
            System.out.println("\n-----");
            for(int num: arrBase){
                System.out.print(num+ " ");  // imprimir os valores do array j na mesma linha
            }
        }

        System.out.println("\n-----------------------------");
        System.out.print("Novo ArrayInt2: ");
        int[][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6,7}, {9,8,7}};
        for(int[] arrBase: arrayInt2){
            System.out.println("\n");
            for(int num: arrBase){
                System.out.print(num+ " ");  // imprimir os valores do array j na mesma linha
            }
        }
    }
}
