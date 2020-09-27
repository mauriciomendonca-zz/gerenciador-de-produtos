package view;

import java.util.Scanner;

public class Cadastro {
    private Scanner scanner;

    public Cadastro() {
        scanner = new Scanner(System.in);
    }

    public String[] cadastrarProcessador() {
        String[] dadosProcessador = new String[4];
        System.out.print("Digite o nome do processador: ");
        dadosProcessador[0] = scanner.nextLine();;
        System.out.print("Digite o fabricante do processador: ");
        dadosProcessador[1] = scanner.nextLine();
        System.out.print("Digite o valor do processador: ");
        dadosProcessador[2] = scanner.nextLine();
        System.out.print("Digite a frequencia do processador: ");
        dadosProcessador[3] = scanner.nextLine();
        return dadosProcessador;
    }

    public String[] cadastrarPlacaDeVideo() {
        String[] dadosPlacaDeVideo = new String[4];
        System.out.print("Digite o nome da placa de video: ");
        dadosPlacaDeVideo[0] = scanner.nextLine();;
        System.out.print("Digite o fabricante da placa de video: ");
        dadosPlacaDeVideo[1] = scanner.nextLine();
        System.out.print("Digite o valor da placa de video: ");
        dadosPlacaDeVideo[2] = scanner.nextLine();
        System.out.print("Digite a memoria da placa de video: ");
        dadosPlacaDeVideo[3] = scanner.nextLine();
        return dadosPlacaDeVideo;
    }

    public String[] cadastrarDiscoRigido() {
        String[] dadosDiscoRigido = new String[5];
        System.out.print("Digite o nome do disco rigido: ");
        dadosDiscoRigido[0] = scanner.nextLine();;
        System.out.print("Digite o fabricante do disco rigido: ");
        dadosDiscoRigido[1] = scanner.nextLine();
        System.out.print("Digite o valor do disco rigido: ");
        dadosDiscoRigido[2] = scanner.nextLine();
        System.out.print("Digite a capacidade do disco rigido: ");
        dadosDiscoRigido[3] = scanner.nextLine();
        System.out.print("Digite o tipo do disco rigido: ");
        dadosDiscoRigido[4] = scanner.nextLine();
        return dadosDiscoRigido;
    }
}
