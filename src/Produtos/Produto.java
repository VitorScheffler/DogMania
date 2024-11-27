package Produtos;

public abstract class Produto {
    protected double valor;

    public Produto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
