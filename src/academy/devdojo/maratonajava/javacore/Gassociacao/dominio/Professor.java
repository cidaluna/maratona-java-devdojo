package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;  // um professor pode ministrar vários seminários


    public Professor(String nome) {
        this.nome = nome;
    }
    public Professor(String nome, String especialidade) {

        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Professor: " +this.nome);
        if(this.seminarios == null ) return;
        System.out.println("### Seminários Cadastrados ###");
        for(Seminario seminario: this.seminarios){
            System.out.println(seminario.getTitulo());
            System.out.println("Local: "+ seminario.getLocal().getEndereco());
            // nao quero que execute caso os alunos nao existam
            if(seminario.getAlunos() == null) continue; // ignora as 3 linhas abaixo e retorna para o for
            System.out.println(" *** Alunos ***");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+aluno.getNome()+ " Idade: "+aluno.getIdade());
            }

        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
