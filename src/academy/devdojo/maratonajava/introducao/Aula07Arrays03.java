package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{10,20,30,40,50};
        int[] numeros4 = new int[]{110,220,330,440,550};

        for(int i=0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        System.out.println("------------");
        for(int i=0; i < numeros3.length; i++){
            System.out.println(numeros3[i]);
        }

        System.out.println("------------");
        for(int num:numeros4){  // este for nao da os índices, a variavel local (num) percorre cada posicao e exibe o valor
            System.out.println(num);
        }
    }
}
