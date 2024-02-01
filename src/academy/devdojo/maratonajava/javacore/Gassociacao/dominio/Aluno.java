package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    // Relacionamento:
    // Um aluno poderá estar em apenas um seminário
    // Um seminário poderá ter nenhum ou vários alunos
    // Um professor poderá ministrar vários seminários
    // Um seminário deve ter um local

    private String nome;
    private int idade;
    private Seminario seminario;
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
