package Pedidos;

import java.util.List;
import Produtos.Produto;

public class ValorTotalPedido {
    private double valorTotal;
    private List<Produto> produtos;

    public ValorTotalPedido(List<Produto> produtos) {
        this.produtos = produtos;
        this.valorTotal = calcularValorTotal();
    }

    private double calcularValorTotal() {
        return produtos.stream().mapToDouble(Produto::getValor).sum();
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
