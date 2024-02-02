package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    // todas as sub-classes filhas de Pessoa, agora conseguem acessar essa classe Pessoa
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }
    {
        System.out.println("Bloco de inicialização não estático pessoa 1!");
    }
    {
        System.out.println("Bloco de inicialização não estático pessoa 2!");
    }

    // construtores
    //public Pessoa(){}

    public Pessoa(String nome){
        super();
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    public Pessoa(){
        super();  // todas as classes são filhas de Object
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    // métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " "+ this.endereco.getCep());
    }
}
