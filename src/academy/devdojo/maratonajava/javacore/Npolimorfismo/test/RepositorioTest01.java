package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        // manter a variavel de referência sempre com o tipo mais GENÉRICO, nesse caso exemplo Repositorio repo.
        // se futuramente não for mais pra salvar em Banco de dados e sim em arquivo, é só trocar o objeto
        // exemplo ao inves de new RepositorioBancoDeDados() para new RepositorioArquivo()
        // ou seja, programe orientado a interface, isso torna seu código mais fácil para dar manutenção
        Repositorio repo = new RepositorioBancoDeDados();
        repo.salvar();

        // outros exemplos com a mesma ideia, tipo generico depois objeto do tipo específico
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);

        // a mesma ideia do exemplo anterior, trocado apenas o tipo específico do objeto
        List<String> list1 = new ArrayList<>();
        list1.add("Goku");
        list1.add("Vegeta");
        list1.add("Kuririn");
        System.out.println(list1);

    }
}
