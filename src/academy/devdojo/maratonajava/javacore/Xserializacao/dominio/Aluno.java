package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 739959230178355186L;
    private Long id;
    private String nome;
    private transient String password;  // o transient vai ignorar este campo na hora de serializar

    // adicionando um atributo estatico, ele pertence a CLASSE e nao ao objeto, logo eu consigo ver no retorno da deserialização
    private static String NOME_ESCOLA = "Cida Luna DevDojo";

    private transient Turma turma;  // nao vai serializar este campo

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){
        // como a turma é transient, ou seja, é ignorada, mas queremos ter o valor da turma
        // devemos escrever todos os atributos de turma e no proximo método fazer a leitura
        // de todos os atributos de turma na mesma ordem da escrita
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());  // escreve String
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois){
        // a turma não foi serializada, mas a String turma foi
        try{
            // ler o default e ler a String
            ois.defaultReadObject();  // le o padrão
            String nomeTurma = ois.readUTF();   // le a String da turma
            turma = new Turma(nomeTurma);  // monta o objeto
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    // add getter and setter da turma
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA ='" + NOME_ESCOLA + '\'' +
                ", turma ='" + turma + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
