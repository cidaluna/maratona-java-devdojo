package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    // 1 escola tem N professores
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println("Nome da Escola: "+ this.nome);  // nome dad escola
        if(professores == null){
            return;
        }
        System.out.println("Nome dos Professor(es): ");
        for(Professor professor: professores){
            System.out.print(professor.getNome() + ", ");
        }
    }

    // construtor nome da escola e os nomes dos professores
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    // construtor só com nome da escola
    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
