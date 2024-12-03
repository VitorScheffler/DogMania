package Pagamentos;

import java.util.List;
import Produtos.Produto;

public class Cartao extends Pagamento {

    public enum TipoCartao {
        CREDITO, DEBITO;
    }

    public enum BandeiraCartao {
        VISA, MASTERCARD, ELO;
    }

    private TipoCartao tipoCartao;
    private BandeiraCartao bandeiraCartao;

    public Cartao(List<Produto> produtos, TipoCartao tipoCartao, BandeiraCartao bandeiraCartao) {
        super(produtos);
        this.tipoCartao = tipoCartao;
        this.bandeiraCartao = bandeiraCartao;
    }

    public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(TipoCartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public BandeiraCartao getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void serBandeiraCartao(BandeiraCartao bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    @Override
    public boolean processarPagamento(double valorPago) {
        if (valorPago >= getValorTotal()) {
            System.out.println("Pagamento com cartão " + bandeiraCartao + " processado com sucesso!");
            return true;
        }
        System.out.println("Pagamento com cartão " + bandeiraCartao + " falhou!");
        return false;
    }

}
