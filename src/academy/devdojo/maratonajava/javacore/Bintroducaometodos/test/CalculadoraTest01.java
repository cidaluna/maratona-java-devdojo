package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        // criando a variavel de referencia e o objeto
        Calculadora calculadora = new Calculadora();
        // utilizando a variavel de referencia e chamando o método soma
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");

        calculadora.subtraiDoisMetodos();
        calculadora.multiplicaDoisNumeros(5,7);
    }
}
