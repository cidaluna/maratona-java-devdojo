package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 18");
        endereco.setCep("012354-67");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        // Obs aqui nesta classe main, por ela estar fora do pacote de Pessoa, não é possível acessar direto, pessoa.nome

        System.out.println("-----------------");
        Funcionario func = new Funcionario("Oda Nobunaga");
        func.setCpf("2222222");
        func.setEndereco(endereco);
        func.setSalario(8000);
        func.imprime();
    }
}
