package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    // String no Java são imutáveis
    public static void main(String[] args) {
        // String constant pool, piscina constante de string
        String nome = "Cida";
        String nome2 = "Cida";

        // validar a referência de um objeto, usamos o ==
        System.out.println("Nome: " + nome);
        System.out.println(nome == nome2);  // retorna true

        System.out.println("------------------------");
        nome.concat(" Luna");  // cria nova string em outro lugar dentro do string pool
        System.out.println("Nome: " + nome);
        System.out.println(nome == nome2);  // retorna true porque a concatenação criou o Luna em outro lugar no pool de strings

        System.out.println("------------------------");
        nome = nome.concat(" Luna");
        System.out.println("Nome: " + nome);
        //  == comparar referências e não o valor em si
        System.out.println(nome == nome2);  // retorna falso, porque a concatenação do Luna foi feita no mesmo lugar no pool de strings

        System.out.println("------------------------");
        String nome3 = new String("Cida");  // criando um novo objeto dentro da String pool
        System.out.println(nome2 == nome3); // retorna falso porque o objeto está em outro lugar que é o heap de memória
        System.out.println(nome2 == nome3.intern()); // retorna true porque olha para o valor que está dentro do objeto
        System.out.println("Nome2 = " +nome2);
        System.out.println("Nome3 = " +nome3);
        System.out.println("Nome3 Intern = " +nome3.intern());

        // String são imutáveis, tomar cuidado quando alterar uma variável de referência, pois pode não retornar
        // resultado de acordo com o esperado na aplicação
    }
}
