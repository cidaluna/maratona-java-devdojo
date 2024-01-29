package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {

    public String nome;  // o método abaixo (imprime) acessa esse atributo nome
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println(this.nome);  // utilizando a palavra reservada this (como se fosse "esse".nome dessa classe)
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

}
