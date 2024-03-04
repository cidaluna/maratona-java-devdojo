package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        // pegar um objeto em memoria e persistir em algum destino (um arquivo)

        Aluno aluno1 = new Aluno(1L, "Cida Luna", "1234"); // objeto
        //serializar(aluno1);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        // trabalhando em baixo nível, geralmente temos Stream,
        // InputStream para leitura, e OutputStream para escrita(saida)
        Path path = Paths.get("pastaCida/aluno.ser");  // onde quero salvar
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    // deserializando o arquivo, preciso ler, nao preciso ter argumento Aluno pois ele já existe
    private static void deserializar() {
        // Obs. o construtor não é chamado no momento da deserialização! O que pode ser um problema
        // caso esteja sendo utilizado Herança.
        Path path = Paths.get("pastaCida/aluno.ser");  // objeto serializado
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
           // ois.readObject();  // como eu sei que o tipo é aluno eu posso fazer o cast abaixo
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
