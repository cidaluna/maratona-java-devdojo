package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {

        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4};
        calculadora.somaArray(numeros);

        // utilizar o varArgs somente como ultimo argumento passado, ou somente ele, considerando um array de
        // dados do mesmo tipo
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
