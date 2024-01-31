package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        // associação é o relacionamento entre dois objetos
        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Romário");
        Jogador j3 = new Jogador("Cafu");

        Jogador[] jogadores = new Jogador[]{j1, j2, j3};

        for(Jogador jogador: jogadores){
            jogador.imprime();
        }

    }
}
