package view;

import java.util.Scanner;

public class MenuRemover {
    private Scanner scanner;

    public MenuRemover() {
        scanner = new Scanner(System.in);
    }

    public String removerProcessador() {
        System.out.print("Digite o nome do processador que você deseja remover: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public String removerPlacaDeVideo() {
        System.out.print("Digite o nome da placa de video que você deseja remover: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public String removerDiscoRigido() {
        System.out.print("Digite o nome do disco rigido que você deseja remover: ");
        String nome = scanner.nextLine();
        return nome;
    }
}