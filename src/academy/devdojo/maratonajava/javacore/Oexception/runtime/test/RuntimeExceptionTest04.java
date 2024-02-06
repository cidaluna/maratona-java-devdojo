package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        // existem casos onde 1 método pode lançar mais de 1 exceção
        // exemplo spring lança diversos http status code
        // para tratamento podemos ter N catchs

        try{
            // lançando uma exception
            // o Java tenta encontrar qual das exceções ele consegue fazer associação (essas sao filhas de RuntimeException)
            // exemplo, throw new ArrayIndexOutOfBoundsException();
            // procurando pelo catch que melhor atende
            // qdo nao encontrar o catch específico, cai na generica, exemplo NullPointerException
            throw new IndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch(IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch(ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }


        System.out.println("----------------------------------- ");
        //ou
        try{
            // chamando método
            talvezLanceException();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }


    private static void talvezLanceException() throws SQLException, FileNotFoundException{
        System.out.println("teste");
    }
}
