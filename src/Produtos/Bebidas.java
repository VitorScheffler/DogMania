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
    
    @Override
    public String toString() {
        return super.toString() + ", Tamanho: " + tamanho + " ml";
    }
}