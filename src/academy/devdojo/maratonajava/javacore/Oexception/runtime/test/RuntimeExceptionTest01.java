package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked (IOExceptiom, SQLException, ...)
        // Unchecked - Runtime - (IllegalArgumentException, NullPointerException,NumberFormatException,...) erro do Dev rs

        Object obj = null;
        //System.out.println(obj.toString()); // Causando um NullPointerException

        int[] numeros = {1,2};
        System.out.println(numeros[2]);  // Causando um ArrayIndexOutOfBoundsException


    }
}
