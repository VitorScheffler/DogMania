package Produtos;

public class Lanches extends Produto {
    private String nome;
    private double peso;
    private String descricao;

    public Lanches(String nome, double peso,String descricao, double valor) {
        super(valor);
        this.nome = nome;
        this.peso = peso;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
