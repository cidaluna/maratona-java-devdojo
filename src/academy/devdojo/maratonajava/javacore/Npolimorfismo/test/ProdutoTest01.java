package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    // modelo = dominio
    // regra de negocio = servico
    // visual = test
    public static void main(String[] args) {

        Computador c1 = new Computador("NUC10", 11000);
        Tomate t1 = new Tomate("salada", 10 );
        Televisao tv = new Televisao("Samsung 50\" ", 4000);

        CalculadoraImposto.calcularImposto(c1);
        System.out.println(" -------------------------- ");
        CalculadoraImposto.calcularImposto(t1);
        System.out.println(" -------------------------- ");
        CalculadoraImposto.calcularImposto(tv);

    }
}
