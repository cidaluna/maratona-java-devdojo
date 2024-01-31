package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        System.out.println("Teste de modificador de acesso estático: " + Carro.velocidadeLimite);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180); // vai afetar sobrescrever todos os objetos da classe Carro
        // mesmo se nao existir nenhum objeto instanciado, Carro.velocidadeLimite existe e pode ser impresso se desejar
        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("--------------");
        System.out.println("Teste de modificador de acesso estático: " + Carro.velocidadeLimite);
    }
}
