package Pagamentos;

import java.util.Scanner;
public class Pagamento {

    public static String selecionarMeioPagamento(Scanner scanner) {
        System.out.println("Selecione o meio de pagamento:");
        System.out.println("1 - Cartão de Débito");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Dinheiro");
        int opcao = scanner.nextInt();

        return switch (opcao) {
            case 1 -> "Cartão de Débito";
            case 2 -> "Cartão de Crédito";
            case 3 -> "Dinheiro";
            default -> {
                System.out.println("Opção inválida! Pagamento em dinheiro por padrão.");
                yield "Dinheiro";
            }
        };
    }
}