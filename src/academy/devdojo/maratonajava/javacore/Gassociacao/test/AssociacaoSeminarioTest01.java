package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoSeminarioTest01 {
    public static void main(String[] args) {

        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno1 = new Aluno("Luffy", 17);
        Aluno aluno2 = new Aluno("Sanji", 19);
        Professor prof = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosSeminario = {aluno1,aluno2};
        Seminario seminario = new Seminario("Onde achar One Piece", alunosSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        prof.setSeminarios(seminariosDisponiveis);
        prof.imprime();

    }
}
