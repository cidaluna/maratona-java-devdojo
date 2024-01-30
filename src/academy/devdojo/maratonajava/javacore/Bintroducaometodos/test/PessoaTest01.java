package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        // alta coesão = bom
        // baixo acoplamento = bom
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(-1);
        //pessoa.imprime();
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: "+ pessoa.getIdade());

    }
}
