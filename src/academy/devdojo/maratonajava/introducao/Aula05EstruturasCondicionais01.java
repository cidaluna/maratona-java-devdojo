package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;

        boolean isAutorizadoTerHabilitacao = idade >= 18;
        if(isAutorizadoTerHabilitacao){
            System.out.println("Idade "+idade+" anos, está autorizado(a) a tirar CNH");
        }

        if(!isAutorizadoTerHabilitacao){
            System.out.println("Não autorizado(a) a tirar CNH!");
        }

        System.out.println("Fora do IF");
    }
}
