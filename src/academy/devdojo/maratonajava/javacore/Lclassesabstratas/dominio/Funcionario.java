package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario {
    // classe abstrata foi criada para ser uma super classe
    // não podemos criar objetos de uma classe abstrata, ou seja,
    // os objetos criados nao podem ter new Funcionario, e sim, devem ter o new da classe filha
    // e não podemos ter o final abstract pois são coisas opostas
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
