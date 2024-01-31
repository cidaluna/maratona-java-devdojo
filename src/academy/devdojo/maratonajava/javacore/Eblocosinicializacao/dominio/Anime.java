package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    private int[] episodios2;

    // 1- é alocado um espaço em memória para o objeto
    // 2- cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3- bloco de inicialização {} (se existir) é executado
    // 4- o construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização!");
        System.out.println("-------------");
    }

    public Anime(){
        episodios2 = new int[100];
        for(int i = 0; i < this.episodios2.length; i++){
            episodios2[i] = i+1;
            System.out.print(episodios2[i] + " ");
        }

        System.out.println("\n-------------");
        for(int episodio: this.episodios){
            System.out.print(episodio +" ");
        }
    }
}
