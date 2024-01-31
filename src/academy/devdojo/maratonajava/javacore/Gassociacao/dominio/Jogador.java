package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {

    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(time != null) {  // verifica se existe o objeto em memória pra chamar o getNome, caso contrário, temos NullPointerException
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
