package Pagamentos;

import java.util.List;

import Pedidos.ValorTotalPedido;
import Produtos.Produto;

public abstract class Pagamento extends ValorTotalPedido {
    
    public Pagamento(List<Produto> produtos) {
        super(produtos);
    }

    public abstract boolean processarPagamento(double valorPago);
}
