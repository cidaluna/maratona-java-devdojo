package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor, por exemplo 50.
        int valorMax = 50;
        for(int i = 1; i <= valorMax; i++){
            if(i > 25){
                break;  // solução que vai parar o FOR no ponto desejado.
            }
            System.out.println("i = "+i);
        }
    }
}
