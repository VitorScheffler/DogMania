package Produtos;
public abstract class Produto {
    protected double valor;

    public Produto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    @Override
    public String toString() {
        return "Produto: R$" + String.format("%.2f", valor);
    }
}