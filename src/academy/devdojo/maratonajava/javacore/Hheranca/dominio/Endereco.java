package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco {

    private String rua;
    private String cep;


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // exemplo que essa subclasse consegue acessar os atributos da super classe Pessoa
    public void imprime(){
        Pessoa p = new Pessoa();
        p.nome = "sasa";
    }

}
