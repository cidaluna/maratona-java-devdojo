package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeSolucaoCidaLuna(Funcionario funcionario) {
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        for (int i = 0; i < (funcionario.salario).length; i++) {
            System.out.println(funcionario.salario[i]);
        }
    }

    public void imprimeSolucaoWilliamSuane(Funcionario funcionario) {
        // adicionando if como boa pratica para checar se existe salário
        if(salario == null){
            return; // se for null, cai aqui e já sai fora desse método!
        }
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        for(double cada: salario) {
            System.out.println(cada);
        }
    }

    public double mediaSalariosCida(Funcionario funcionario) {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < (funcionario.salario).length; i++) {
            soma += funcionario.salario[i];
            media = (soma / 3);
        }
        return media;
    }

    public void mediaSalariosSuane(){  // solucao metodo VOID
        // adicionando if como boa pratica para checar se existe salário
        if(salario == null){
            return; // se for null, cai aqui e já sai fora desse método!
        }
        double media = 0;
        for(double item: salario) {
            media += item;
        }
        media /= salario.length;
        System.out.println("Média salarial Suane: "+ media);
    }
}
