package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Classes utilitárias são classes que vão melhorar o desempenho de nossas aplicações
        // Wrappers são objetos que vão encapsular os
        // 8 tipos primitivos (byte, short, int, long, float, double, char, boolean) e transformá-los em objeto
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // Pra virar wrapper colocar a primeira letra em Maiúsculo, exceto int que vira Integer e char que vira Character
        // Agora trabalhando com os objetos wrappers abaixo, é aplicado a regra de polimorfismo
        // auto boxing é quando vc tem o tipo primitivo e transforma em Wrapper
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;  // auto boxing ou boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;


        // unboxing, é quando vc tem o wrapper e volta ele para tipo primitivo
        int i = intW;

        Integer intW2 = Integer.parseInt("1"); // faz o parse de um valor String para um Integer
        System.out.println(intW2);

        boolean verdadeiro = Boolean.parseBoolean("TrUE");  // é case insensitive, ou seja, ignora o case
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('?'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A')); // é maiúsculo ?
        System.out.println(Character.isLowerCase('a')); // é minúsculo ?
        System.out.println(Character.toUpperCase('s')); // transforme em maiúsculo
        System.out.println(Character.toLowerCase('U')); // transforme em minúsculo

    }
}
