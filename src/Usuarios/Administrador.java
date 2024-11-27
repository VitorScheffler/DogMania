package Usuarios;

public class Administrador extends Usuario {
    private int nivel;
    private String senha;

    public Administrador(int matricula, String senha, int nivel) {
        super(matricula);
        this.senha = senha;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
