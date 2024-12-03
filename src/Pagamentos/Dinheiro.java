package Pagamentos;

import java.util.List;
import Produtos.Produto;

public class Dinheiro extends Pagamento {
    private double valorRecebido;

    public Dinheiro(List<Produto> produtos, double valorRecebido) {
        super(produtos);
        this.valorRecebido = valorRecebido;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double troco() {
        return valorRecebido - getValorTotal();
    }

    @Override
    public boolean processarPagamento(double valorPago) {
        if (valorPago >= getValorTotal()) {
            System.out.println("Troco: " + troco());
            return true;
        } else {
            System.out.println("Erro: valor insuficiente!");
            return false;
        }
    }
}
