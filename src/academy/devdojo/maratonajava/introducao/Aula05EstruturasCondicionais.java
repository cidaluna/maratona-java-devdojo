package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        String categoria;
        boolean isAutorizadoTerHabilitacao = idade >= 18;
        if(isAutorizadoTerHabilitacao){
            System.out.println("Idade "+idade+" anos, está autorizado(a) a tirar CNH");
        }

        if(!isAutorizadoTerHabilitacao){
            System.out.println("Não autorizado(a) a tirar CNH!");
        }

        if(idade <15){
            categoria = "Categoria Infantil";
            System.out.println(categoria);
        }else if(idade >= 15 && idade < 18){
            categoria = "Catergoria Juvenil";
            System.out.println(categoria);
        }else{
            categoria = "Categoria Adulto";
            System.out.println(categoria);
        }

        System.out.println("Fora do IF");
    }
}
