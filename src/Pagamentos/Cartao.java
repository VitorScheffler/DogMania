// Se o pagamento for no cartão, receber o valor total do pedido, receber se vai ser no credito ou no debito e receber a bandeira do cartão

package Pagamentos;

import java.util.List;
import Produtos.Produto;

public class Cartao extends Pagamento {

    public enum TipoCartao {
        CREDITO,
        DEBITO;
    }

    private String numeroCartao;
    private TipoCartao tipoCartao;

    public Cartao(List<Produto> produtos, String numeroCartao, TipoCartao tipoCartao) {
        super(produtos);
        this.numeroCartao = numeroCartao;
        this.tipoCartao = tipoCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(TipoCartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    @Override
    public boolean processarPagamento(double valorPago) {
        if (valorPago >= getValorTotal()) {
            System.out.println("Pagamento com cartão " + tipoCartao + " processado com sucesso!");
            return true;
        }
        System.out.println("Pagamento com cartão " + tipoCartao + " falhou: valor insuficiente.");
        return false;
    }

}
