package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {

    private String serialNumber;
    private String marca;

    public Smartphone(String serailNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true , logo y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true; // se a ref dos 2 objetos sao iguais
        if(this.getClass() != obj.getClass()) return false;  // verifica se é um smartphone
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true, x.hashCode() == y.hashCode();
    // y.hashCode() == x.hashCode, nao necessariamente o y.equals(x) tem que ser true;
    // x.equals(y) == false, os hashCode serão diferentes;
    // y.hashCode() != x.hashCode(), x.equals(y) deverá ser false (Atenção: caso esteja utilizando o valor de
    // serialNumber com equals, também terá que utilizar o serialNumber para gerar o hashCode());
    @Override
    public int hashCode() {
        // é um número que será gerado de preferência único para cada Objeto
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerailNumber() {
        return serialNumber;
    }

    public void setSerailNumber(String serailNumber) {
        this.serialNumber = serailNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
