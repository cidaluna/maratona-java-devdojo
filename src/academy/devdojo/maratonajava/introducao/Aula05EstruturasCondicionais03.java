package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        // Doar se o salario for maio do que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo!";
        String mensagemNaoDoar = "Ainda nao tenho condições, mas vou ter!!";
        String resultado01;

        if(salario > 5000){
            resultado01 = mensagemDoar;
        }else{
            resultado01 = mensagemNaoDoar;
        }
        System.out.println(resultado01);

        // operador ternario, (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println("Utilizando operador ternário: "+resultado);

    }
}
