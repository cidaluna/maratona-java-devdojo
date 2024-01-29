package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(Funcionario funcionario) {
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        for (int i = 0; i < (funcionario.salario).length; i++) {
            System.out.println(funcionario.salario[i]);
        }
    }

    public double mediaSalarios(Funcionario funcionario) {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < (funcionario.salario).length; i++) {
            soma += funcionario.salario[i];
            media = (soma / 3);
        }
        return media;
    }
}
