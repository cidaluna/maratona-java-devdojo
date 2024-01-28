package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // primeiro array representa os meses
        // segundo array representa os dias
        // 1,2,3,4,5 meses
        // 31,28,31,30 dias

        int[][] dias = new int[3][3];
        dias[0][0] = 31;  // Exemplo Janeiro
        dias[0][1] = 28;  // Feveiro
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 30;
        dias[1][2] = 30;

        dias[2][0] = 31;
        dias[2][1] = 31;
        dias[2][2] = 31;

        for(int i = 0; i < dias.length; i++){
        // imprime os valores do for de dentro (j)
        // depois incrementa o for de fora (i) e vai imprimindo
        // exemplo: valor de i0 j0, i0 j1, i0 j2, em seguida, i1 j0, i1 j1, i1, j2,
        // por fim, i2 j0, i2 j1, i2 j3
            for(int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("----------------------------");
        // criando uma variavel de referencia (array base) que aponta para o array dias
        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }

    }
}
