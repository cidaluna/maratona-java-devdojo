package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // interface carregador de dados
    // é como se fosse um contrato

    // modificadores de acesso
    // private -> default -> protected -> public
    public abstract void load();  // não precisava declarar o public abstract pois na interface isso já é o padrão (redundante)

    public static final int MAX_DATA_SIZE = 10;

    // médoto concreto utilizamos a palvra default
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }

}
