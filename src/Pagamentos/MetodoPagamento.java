// package Pagamentos;

// import Produtos.Produto;
// import java.util.List;

// public class MetodoPagamento {
//     private Pagamento pagamento;

//     public MetodoPagamento(List<Produto> produtos, String tipoPagamento, Object... parametros) {
//         if (tipoPagamento.equalsIgnoreCase("Cartao")) {
//             if (parametros.length < 2) {
//                 throw new IllegalArgumentException("Parâmetros insuficientes para pagamento com cartão.");
//             }
//             String numeroCartao = (String) parametros[0];
//             Cartao.TipoCartao tipoCartao = (Cartao.TipoCartao) parametros[1];
//             this.pagamento = new Cartao(produtos, numeroCartao, tipoCartao);
//         } else if (tipoPagamento.equalsIgnoreCase("Dinheiro")) {
//             if (parametros.length < 1) {
//                 throw new IllegalArgumentException("Parâmetros insuficientes para pagamento em dinheiro.");
//             }
//             double valorRecebido = (double) parametros[0];
//             this.pagamento = new Dinheiro(produtos, valorRecebido);
//         } else {
//             throw new IllegalArgumentException("Tipo de pagamento inválido.");
//         }
//     }

//     public boolean processarPagamento(double valorPago) {
//         if (pagamento == null) {
//             System.out.println("Nenhum pagamento configurado.");
//             return false;
//         }
//         return pagamento.processarPagamento(valorPago);
//     }

//     public Pagamento getPagamento() {
//         return pagamento;
//     }
// }
