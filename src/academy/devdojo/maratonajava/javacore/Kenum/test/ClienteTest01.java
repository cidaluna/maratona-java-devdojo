package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente c2 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente c3 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
