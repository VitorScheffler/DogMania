package Pedidos;

import java.util.List;
import Produtos.Produto;
import Usuarios.Aluno;
import Usuarios.Usuario;

public class Pedido {
    private int numeroPedido;
    private List<Produto> produtos;
    private double valorTotal;
    private String meioPagamento;
    private Usuario usuario;

    public Pedido(int numeroPedido, List<Produto> produtos, String meioPagamento, Usuario usuario) {
        this.numeroPedido = numeroPedido;
        this.produtos = produtos;
        this.meioPagamento = meioPagamento;
        this.usuario = usuario;
        this.valorTotal = calcularValorTotal();
    }

    private double calcularValorTotal() {
        return produtos.stream().mapToDouble(Produto::getValor).sum();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getMeioPagamento() {
        return meioPagamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Pedido #" + numeroPedido +
               "\nUsuário: " + usuario.getMatricula() +
               (usuario instanceof Aluno ? ", Nome: " + ((Aluno) usuario).getNome() : "") +
               "\nProdutos: " + produtos +
               "\nValor Total: R$ " + String.format("%.2f", valorTotal) +
               "\nMeio de Pagamento: " + meioPagamento;
    }
}