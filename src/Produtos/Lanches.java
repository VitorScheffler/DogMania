package Produtos;
public class Lanches extends Produto {
    private double peso;

    public Lanches(double peso, double valor) {
        super(valor);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
