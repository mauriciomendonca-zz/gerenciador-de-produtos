import java.io.IOException;

import model.DatabaseProduto;
import model.DatabaseProcessador;
import controller.Processador;
import view.Cadastro;
import view.Menu;


class App {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        Cadastro cadastro = new Cadastro();
        DatabaseProduto databaseProduto = new DatabaseProduto();
        DatabaseProcessador databaseProcessador = new DatabaseProcessador();

        menu.exibirMenuHeader();

        while (true) {
            int opcaoPrincipal = menu.exibirMenuPrincipal();

            if (opcaoPrincipal == 1) {
                int opcaoCadastrar = menu.exibirMenuCadastrarProduto();
                if (opcaoCadastrar == 1)
                    cadastro.cadastrarProcessador();
                else if (opcaoCadastrar == 2)
                    cadastro.cadastrarPlacaDeVideo();
                else if (opcaoCadastrar == 3)
                    cadastro.cadastrarDiscoRigido();
            } else if (opcaoPrincipal == 2) {
                System.out.println("Listar produtos");
            } else if (opcaoPrincipal == 3) {
                System.out.println("Remover produto");
            } else if (opcaoPrincipal == 4) {
                System.out.println("Obrigado por utilizar o Gerenciador de Produtos!");
                break;
            }
        }
    }
}