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
            return 0;
        }
        return num1 / num2;
    }
}
