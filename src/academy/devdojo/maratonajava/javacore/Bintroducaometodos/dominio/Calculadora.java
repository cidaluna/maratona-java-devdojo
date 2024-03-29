package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    // modificador de acesso public, private
    // retorno é diferente de saída, tem métodos que não tem saída embora tenha sido executado
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisMetodos(){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;  // William prefere dessa forma, pois para a execução logo no começo do método
        }
        return num1 / num2;
    }

    // formas diferentes de fazer o método de divisão
    public double divideDoisNumeros02(double num1, double num2){
        if(num2 == 0){
            return 0;
        }else{
            return num1 / num2;
        }
    }

    public double divideDoisNumeros03(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public void divideDoisNumeros04(double num1, double num2){ // método void sem retorno
        if(num2 == 0){
            System.out.println("Não existe divisão por zero!");
        }else{
            System.out.println(num1/num2);
        }
    }

    public void divideDoisNumeros05(double num1, double num2){ // método void sem retorno
        if(num2 == 0){
            System.out.println("Não existe divisão por zero!");
            return;   // funciona como se fosse o break; dentro do laço de repetição, ele para a execução
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){ // recebe como parâmetro uma cópia (e não uma ref) de num1=1 e num2=2
        // altera os dados da variavel do tipo primitivo que entraram com valor 1, 2 para 99, 33
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois números");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){  // argumento é um array
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
