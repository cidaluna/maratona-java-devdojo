package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;

    // constante
    public static final double VELOCIDADE_LIMITE = 250;

    // a referência que temos de comprador nunca poderá ser alterada, proém, os dados podem ser alterados.
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
