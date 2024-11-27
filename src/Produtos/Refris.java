package Produtos;
public class Refris extends Bebidas {
    String marca;

    public Refris(double tamanho, double valor, String marca){
    super (tamanho, valor);
    this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}