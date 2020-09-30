package view;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;

    public MenuPrincipal() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenuHeader() {
        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("*      GERENCIADOR DE PRODUTOS      *");
        System.out.println("*                                   *");
        System.out.println("*************************************\n");
    }

    public int exibirMenuPrincipal() {
        System.out.println("[1] Cadastrar produto");
        System.out.println("[2] Listar produto");
        System.out.println("[3] Remover produto");
        System.out.println("[0] Sair\n");
        
        System.out.print("Selecione a opção desejada: ");
        int opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
    }

    public int exibirMenuCadastrarProduto () {
        System.out.println("[1] Cadastrar procesador");
        System.out.println("[2] Cadastrar placa de video");
        System.out.println("[3] Cadastrar disco rigido\n");

        System.out.print("Selecione a sub-opção desejada: ");
        int opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
    }
}