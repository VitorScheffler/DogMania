package Produtos;
public class Agua extends Bebidas {
    private String marca;

    public Agua(double tamanho, double valor, String marca) {
        super(tamanho, valor);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
