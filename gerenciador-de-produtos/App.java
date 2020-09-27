import java.io.IOException;
import java.util.Scanner;

import model.Database;
import controller.Processador;
import view.Menu;


class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Database database = new Database();

        menu.exibirHeaderMenu();
        while (true) {
            menu.exibirMenuPrincipal();

            System.out.print("Selecione a opção desejada: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                menu.exibirMenuOpcao01();
                System.out.print("Selecione a opção desejada: ");
                int opcao1 = scanner.nextInt();

                if (opcao1 == 1) {
                    System.out.print("Digite o nome do processador: ");
                    String nome = scanner.next();

                    System.out.print("Digite a fabricante do processador: ");
                    String fabricante = scanner.next();

                    // System.out.print("Digite o valor do processador: ");
                    // double valor = scanner.nextDouble();

                    // Processador processador = new Processador(nome, fabricante, valor);
                }
                break;
            }
        }

    }
}