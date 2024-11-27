import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Pagamentos.*;
import Produtos.*;
import Pedidos.*;
import Usuarios.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua matrícula:");
        int matricula = scanner.nextInt();
        Usuario usuario;

        if (matricula < 1000) {
            System.out.println("Digite sua senha:");
            String senha = scanner.next();
            usuario = new Administrador(matricula, senha, 1);
        } else {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();
            usuario = new Aluno(matricula, nome);
        }

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Lanches(100, 8.50));
        produtos.add(new Sucos(500, 5.00, "Laranja"));

        String meioPagamento = Pagamento.selecionarMeioPagamento(scanner);

        Pedido pedido = new Pedido(1, produtos, meioPagamento, usuario);
        System.out.println("Resumo do Pedido:");
        System.out.println(pedido);

        scanner.close();
    }
}
