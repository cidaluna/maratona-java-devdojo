package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;
    private double soma = 0;

    public void imprimeSolucaoCidaLuna(Funcionario funcionario) {
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        for (int i = 0; i < (funcionario.salarios).length; i++) {
            System.out.println(funcionario.salarios[i]);
        }
    }

    public void imprimeSolucaoWilliamSuane(Funcionario funcionario) {
        // adicionando if como boa pratica para checar se existe salário
        if(salarios == null){
            return; // se for null, cai aqui e já sai fora desse método!
        }
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        for(double cada: salarios) {
            System.out.println(cada);
        }
    }

    public void mediaSalariosSuane(){  // solucao metodo VOID
        // adicionando if como boa pratica para checar se existe salário
        if(salarios == null){
            return; // se for null, cai aqui e já sai fora desse método!
        }
        for(double item: salarios) {
            media += item;
        }
        media /= salarios.length;
        System.out.println("Média salarial Suane:: "+ media);
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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
