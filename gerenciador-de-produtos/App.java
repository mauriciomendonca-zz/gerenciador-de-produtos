import java.io.IOException;

import model.DatabaseProduto;
import model.DatabaseProcessador;
import controller.PlacaDeVideo;
import controller.Processador;
import view.MenuCadastro;
import view.MenuPrincipal;


class App {
    public static void main(String[] args) throws IOException {
        MenuPrincipal menu = new MenuPrincipal();
        MenuCadastro cadastro = new MenuCadastro();
        DatabaseProduto databaseProduto = new DatabaseProduto();
        DatabaseProcessador databaseProcessador = new DatabaseProcessador();

        menu.exibirMenuHeader();

        while (true) {
            int opcaoPrincipal = menu.exibirMenuPrincipal();

            if (opcaoPrincipal == 1) {
                int opcaoCadastrar = menu.exibirMenuCadastrarProduto();
                if (opcaoCadastrar == 1) {
                    String[] dadosProcessador = cadastro.cadastrarProcessador();
                    Processador processador = new Processador(dadosProcessador[0], dadosProcessador[1], Double.parseDouble(dadosProcessador[2]), Double.parseDouble(dadosProcessador[3]));
                    databaseProcessador.insert(processador.getNome(), processador.getFabricante(), processador.getValor(), processador.getFrequencia());
                    databaseProduto.insert(processador.getNome(), processador.getFabricante(), processador.getValor());
                }
                else if (opcaoCadastrar == 2) {
                    String[] dadosPlacaDeVideo = cadastro.cadastrarPlacaDeVideo();
                    PlacaDeVideo placaDeVideo = new PlacaDeVideo(dadosPlacaDeVideo[0], dadosPlacaDeVideo[1], Double.parseDouble(dadosPlacaDeVideo[2]), Integer.parseInt(dadosPlacaDeVideo[3]));
                }
                else if (opcaoCadastrar == 3)
                    cadastro.cadastrarDiscoRigido();
            } else if (opcaoPrincipal == 2) {
                System.out.println("Listar produtos");
                databaseProduto.sort();
            } else if (opcaoPrincipal == 3) {
                System.out.println("Remover produto");
            } else if (opcaoPrincipal == 0) {
                System.out.println("Obrigado por utilizar o Gerenciador de Produtos!");
                break;
            }
        }
    }
}