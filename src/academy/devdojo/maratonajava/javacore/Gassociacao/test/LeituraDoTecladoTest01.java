package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {

        // entrada de dados
        Scanner input = new Scanner(System.in); // inputStream
        System.out.println("Digite seu nome abaixo: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = input.next().charAt(0);
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Sexo: " +sexo);
    }
}
