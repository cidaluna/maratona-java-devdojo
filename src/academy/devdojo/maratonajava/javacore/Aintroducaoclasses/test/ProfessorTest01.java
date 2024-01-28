package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Silvana";
        professor.idade = 50;
        professor.sexo = 'F';

        System.out.println("Nome: "+professor.nome+ ", idade: " +professor.idade+ ", sexo: "+professor.sexo);

    }
}
