package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private String genero;
    private int episodios;

    // no momento da criação do objeto, quero que seja obrigatório o preenchimento dos atributos, no construtor
    // caso não existisse essa regra, não precisaria criar o construtor, pq o Java cria um vazio por debaixo dos panos
   public Anime(String nome, String tipo, int episodios, String genero){  // construtor da classe
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
    }
}
