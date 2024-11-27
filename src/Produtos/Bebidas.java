package Produtos;
public class Bebidas extends Produto {
    protected double tamanho;

    public Bebidas(double tamanho, double valor) {
        super(valor);
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

}
