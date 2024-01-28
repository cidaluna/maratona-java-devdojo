package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor, por exemplo 50.
        int valorMax = 50;
        for(int i = 1; i <= valorMax; i++){
            if(i <= 25){
                System.out.println(i);
            }
            System.out.println("i = "+i); // solucao não ok, pois o i esta rodando até o 50
        }
    }
}
