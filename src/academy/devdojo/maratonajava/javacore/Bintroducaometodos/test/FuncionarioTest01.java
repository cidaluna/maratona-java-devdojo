package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //double[] salarios = {5000,6000,1500};
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Jorge");
        funcionario1.setIdade(55);
        funcionario1.setSalarios(new double[] {5000,6000,1500});
        System.out.println("-------- Cida ----------");
        funcionario1.imprimeSolucaoCidaLuna(funcionario1);
        System.out.println("-------- Suane ---------");
        funcionario1.imprimeSolucaoWilliamSuane(funcionario1);
        System.out.println("----------");
        funcionario1.mediaSalariosSuane();


        System.out.println("Média eh: "+ funcionario1.getMedia());
    }
}
