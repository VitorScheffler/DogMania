package Pagamentos;

import java.util.List;
import Produtos.Produto;

public abstract class Pagamento {
    private double valorTotal;

    public Pagamento(List<Produto> produtos) {
        this.valorTotal = produtos.stream().mapToDouble(Produto::getValor).sum();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract boolean processarPagamento(double valorPago);
}

