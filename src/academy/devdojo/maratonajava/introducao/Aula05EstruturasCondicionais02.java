package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 15;
        String categoria;
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

    }
}
