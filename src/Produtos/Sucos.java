package Produtos;
public class Sucos extends Bebidas {
    String sabor;

    public Sucos(double tamanho, double valor, String sabor){
    super (tamanho, valor);
    this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void getSabor(String sabor) {
        this.sabor = sabor;
    }

}
