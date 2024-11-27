package Pagamentos;

import java.util.List;

import Produtos.Produto;

public class Dinheiro extends Pagamento {

    public Dinheiro(List<Produto> produtos) {
        super(produtos);
    }

    @Override
    public boolean processarPagamento(double valorPago) {
        if (valorPago >= getValorTotal()) {
            double troco = valorPago - getValorTotal();
            System.out.println("Pagamento com dinheiro processado com sucesso! Troco: " + troco);
            return true;
        }
        System.out.println("Pagamento com dinheiro falhou: valor insuficiente.");
        return false;
    }
}
