package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condicao o valor da parcela tem que ser maior ou igual a mil
        double valorCarro = 133459;
        double parcelaMinima = 1000;
        int qtdParcela;
        double valorCadaParcela = 0;
        System.out.println("---- Solução Cida Luna ----");
        qtdParcela = (int)valorCarro / (int)parcelaMinima;
        valorCadaParcela = valorCarro / qtdParcela;
        System.out.println("Valor do carro: "+valorCarro);
        System.out.println("Parcela mínima: "+parcelaMinima);
        System.out.println("Total de parcela(s): "+qtdParcela);
        System.out.println("Valor de Cada parcela: R$ "+valorCadaParcela);
        System.out.println("--------------------------------");

        System.out.println("---- Solução William Suane ----");
        for(int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela >= 1000){
                System.out.println(parcela+ " parcela(s) de R$ "+valorParcela);
            }else{
                break;
            }
            System.out.println("Fora do if, mas dentro do for "+parcela); // solucao ok por conta do uso do break
        }


    }
}
