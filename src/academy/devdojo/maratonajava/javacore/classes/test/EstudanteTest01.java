package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // criando uma variavel de referência do tipo Estudante
        // utilizando o new eu estou criando um novo objeto
        Estudante estudante = new Estudante();
        estudante.nome = "Cida Luna";
        estudante.idade = 36;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);  // imprime o endereço de memória

    }
}
