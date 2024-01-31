package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        // criando os dois objetos (jogador e time)
        Jogador j1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        // relaçionando (associando) jogador ao time
        j1.setTime(time);

        // imprime
        j1.imprime();

    }
}
