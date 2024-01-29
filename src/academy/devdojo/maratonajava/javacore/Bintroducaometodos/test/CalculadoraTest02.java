package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        // criando a variavel de referencia e o objeto
        Calculadora calculadora = new Calculadora();
        // utilizando a variavel de referencia e chamando o método multiplica passando 2 parâmetros
        // ou seja,  num1 = 5 e num2 = 7
        calculadora.multiplicaDoisNumeros(5,7);
    }
}
