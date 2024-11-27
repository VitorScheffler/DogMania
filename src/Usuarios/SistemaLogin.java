package Usuarios;

import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo! Digite sua matrícula:");
        int matricula = scanner.nextInt();

        if (isAdmin(matricula)) {
            System.out.println("Digite sua senha de administrador:");
            String senha = scanner.next();
            Administrador admin = new Administrador(matricula, senha, 1);
            System.out.println("Bem-vindo, Administrador de nível " + admin.getNivel() + "!");
        } else {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();
            Aluno aluno = new Aluno(matricula, nome);
            System.out.println("Bem-vindo, " + aluno.getNome() + "!");
        }

        scanner.close();
    }

    private static boolean isAdmin(int matricula) {
        return matricula < 1000;
    }
}
