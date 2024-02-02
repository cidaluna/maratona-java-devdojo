package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
   // private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    private static int[] episodios2;
    // 0- Bloco de inicialização estático é executado quando a JVM carregar a classe
    // 1- é alocado um espaço em memória para o objeto
    // 2- cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3- bloco de inicialização {} (se existir) é executado
    // 4- o construtor é executado
    static {
        episodios2 = new int[100];
        for(int i = 0; i < Anime.episodios2.length; i++){
            episodios2[i] = i+1;
            System.out.print(episodios2[i] + " ");
        }
        System.out.println("\nDentro do bloco de inicialização estático 1."); // os estáticos são executados apenas 1 vez
        System.out.println("-------------");
    }

    static{
        System.out.println("\nDentro do bloco de inicialização estático 2.");
    }

    static{
        System.out.println("\nDentro do bloco de inicialização estático 3.");
    }

    {
        System.out.println("\nDentro do bloco de inicialização NÃO estático!!!"); // não estático é impresso de acordo com a qtd de objetos criados
    }
    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(){
        System.out.println("\n-------------");
        for(int episodio: Anime.episodios2){
            System.out.print(episodio +" ");
        }
    }

    public String getNome() {
        return nome;
    }

    public static int[] getEpisodios2() {
        return episodios2;
    }
}
