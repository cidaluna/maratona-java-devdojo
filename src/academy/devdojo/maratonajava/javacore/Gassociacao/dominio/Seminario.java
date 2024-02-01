package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {

    private String titulo;
    private Aluno[] alunos; // seminario pode ter nenhum ou vários alunos
    private Local local;    // seminario só pode ter um local

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }
    // construtor sobrecarregado com os 3 argumentos
    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
