package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // interface carregador de dados
    // é como se fosse um contrato

    public abstract void load();  // não precisava declarar o public abstract pois na interface isso já é o padrão (redundante)

    // médoto concreto utilizamos a palvra default
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

}
