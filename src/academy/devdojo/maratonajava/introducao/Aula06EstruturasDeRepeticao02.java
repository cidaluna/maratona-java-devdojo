package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 até 1 000 000
        int inicio = 1;
        int fim = 1000000;
        for(int i=inicio; i<= fim; i++){
            if(i % 2 == 0){
                System.out.print(i+ ", ");
            }
        }
    }
}
