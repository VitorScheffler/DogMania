// Precisa receber o valor total do pedido. Buscar na classe Pedido [X]

// Precisa receber o metodo de pagamento, cartão ou dinheiro. Utilizando a classe MetodoPagamento

// Caso o pagamento for em cartão, receber se é no credito ou no debito e receber a bandeira do cartão. Utilizando a classe Cartao

// Caso o pagamento for em dinheiro: receber valor total recebido no pagemento, troco. Utilizaqndo a classe Dinheiro

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

