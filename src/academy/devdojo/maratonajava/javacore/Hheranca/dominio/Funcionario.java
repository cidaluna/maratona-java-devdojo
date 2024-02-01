package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    // Funcionário é uma pessoa, logo ele herda os atributos e métodos de Pessoa
    // Herança é acoplamento muito forte

    private double salario;

    // protected é um modificador que dá acesso a todas as variáveis(atributos), subclasses

    // sobrescrita de método
    public void imprime(){
        super.imprime();  // super se refere ao objeto super classe, nesse caso o método imprime da classe Pessoa
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        //System.out.println("Eu "+this.getNome()+ " recebi um salario de R$ "+this.salario);
        System.out.println("Eu "+this.nome+ " recebi um salario de R$ "+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
