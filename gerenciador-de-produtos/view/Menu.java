package view;

public class Menu {

    public void exibirHeaderMenu() {
        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("*      GERENCIADOR DE PRODUTOS      *");
        System.out.println("*                                   *");
        System.out.println("*************************************\n");
    }

    public void exibirMenuPrincipal() {
        System.out.println("[1] Cadastrar produto");
        System.out.println("[2] Listar produto");
        System.out.println("[3] Remover produto");
        System.out.println("[0] Sair\n");
    }

    public void exibirMenuOpcao01 () {
        System.out.println("[1] Cadastrar procesador");
        System.out.println("[2] Cadastrar placa de video");
        System.out.println("[3] Cadastrar disco rigido\n");
    }
}
