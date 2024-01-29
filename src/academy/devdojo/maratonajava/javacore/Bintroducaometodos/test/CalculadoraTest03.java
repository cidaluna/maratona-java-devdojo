package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(10,2.5);
        double resultado02 = calculadora.divideDoisNumeros02(10,2.5);
        double resultado03 = calculadora.divideDoisNumeros03(10,2.5);
        System.out.println(resultado);
        System.out.println(resultado02);
        System.out.println(resultado03);
        System.out.println("---------");
        System.out.println("Método void exemplo 1: ");
        calculadora.divideDoisNumeros04(10,2.5);
        calculadora.divideDoisNumeros04(10,0);  // entrou no else
        System.out.println("---------");
        System.out.println("Método void exemplo 2: ");
        // abaixo, utilizando o return; é como se fosse um break; dentro de um laço, ele para a execução
        calculadora.divideDoisNumeros05(20,2.5);
        calculadora.divideDoisNumeros05(20,0);  // entrou return;
    }
}
