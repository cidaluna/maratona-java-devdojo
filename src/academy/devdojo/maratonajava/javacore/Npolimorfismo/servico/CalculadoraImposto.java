package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    // um único método atende a diversos objetos (uso de polimorfismo e regras de herança)
    public static void calcularImposto(Produto produto){
        System.out.println("-----------------------------");
        System.out.println("*** Relatório de Imposto ***");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);

        if(produto instanceof Tomate){
            // solucao para quando receber um tomate, que possui propriedade data de validade
            // porém, é preciso estar dentro de um if para verificar se a instância vinda no produto é Tomate
            Tomate tomate = (Tomate) produto; // como se fosse um cast forçando o tipo
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }

    }
}
