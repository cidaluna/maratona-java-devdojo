package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {

    private String serailNumber;
    private String marca;

    public Smartphone(String serailNumber, String marca) {
        this.serailNumber = serailNumber;
        this.marca = marca;
    }

    public String getSerailNumber() {
        return serailNumber;
    }

    public void setSerailNumber(String serailNumber) {
        this.serailNumber = serailNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
