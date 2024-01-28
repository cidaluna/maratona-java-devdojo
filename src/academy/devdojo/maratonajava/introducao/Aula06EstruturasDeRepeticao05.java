package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condicao o valor da parcela tem que ser maior ou igual a mil
        double valorTotal = 30000;
        for(int parcela = (int)valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            // considerar o if continue abaixo, caso contrário ele apresenta calculos desnecessários
            // como por exemplo 625 parcelas de R$ 48.0
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+parcela+ " de R$ "+valorParcela);
        }
    }
}
