package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1aa", "iPhone");
        Smartphone s2 = new Smartphone("1aa", "iPhone");
        // embora os dados sejam iguais, a variavel s1 faz referencia para um objeto na memoria
        // e a variavel s2 faz referencia pra outro objeto da memoria
        System.out.println("Antes: "+ s1.equals(s2)); // retorna false

        s2 = s1;  // a variavel s2 passou a apontar para o mesmo objeto que s1 aponta
        System.out.println("Depois: "+ s1.equals(s2)); // retorna true, pq o serialNumber é o mesmo, embora os demais atributos possam estar com valores diferentes


    }
}
