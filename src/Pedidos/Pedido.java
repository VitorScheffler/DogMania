package Pedidos;

import java.util.List;
import Produtos.Produto;
import Usuarios.Usuario;

public class Pedido {
    private int numeroPedido;
    private List<Produto> produtos;
    private double valorTotal;
    private String meioPagamento;
    private Usuario usuario;
    private String descricaoPedido;

    public Pedido(int numeroPedido, List<Produto> produtos, String meioPagamento, Usuario usuario, String descricaoPedido) {
        this.numeroPedido = numeroPedido;
        this.produtos = produtos;
        this.meioPagamento = meioPagamento;
        this.usuario = usuario;
        this.valorTotal = calcularValorTotal();
        this.descricaoPedido = descricaoPedido;
    }

    private double calcularValorTotal() {
        return produtos.stream().mapToDouble(Produto::getValor).sum();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutor(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = calcularValorTotal();
    }

    public String getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

}
