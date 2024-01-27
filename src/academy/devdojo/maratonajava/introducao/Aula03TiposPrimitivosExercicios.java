package academy.devdojo.maratonajava.introducao;

import java.util.Date;

/*
Prática: Crie variáveis para os campos descritos entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Cida Luna";
        String endereco = "Rua das Flores";
        float salario = 10000.0F;
        String dataRecebimento = "27/01/2024";

        String relatorio = "Eu "+nome+ ", morando no endereço " +endereco+ ", confirmo que recebi" +
                " o salário de "+salario+ ", na data " +dataRecebimento;

        System.out.println(relatorio);

    }
}
