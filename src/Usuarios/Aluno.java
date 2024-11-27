package Usuarios;

public class Aluno extends Usuario {
    String nome;

    public Aluno (int matricula, String nome) {
        super(matricula);
        this.nome = nome;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }   
     
}
