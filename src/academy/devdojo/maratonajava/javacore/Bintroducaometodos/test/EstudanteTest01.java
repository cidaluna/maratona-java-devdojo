package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        // variavel de refencia para o objeto
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Pedro";
        estudante1.sexo = 'M';
        estudante1.idade = 28;

        estudante2.nome = "Joana";
        estudante2.sexo = 'F';
        estudante2.idade = 49;

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
        System.out.println("##############");
        // cuidado, como no método existe uma alteração no nome, alterando o estado do objeto, a proxima impressao sofre isso
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}
