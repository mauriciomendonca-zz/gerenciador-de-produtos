import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.Database;
import view.Menu;

class App {
    public static void main(String[] args) throws IOException {
        Database database = new Database();
        database.insert();
        // Menu menu = new Menu();

        // while (true) {
        //     menu.exibirMenuPrincipal();
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite algo:");
        // String a = scanner.nextLine();
        // System.out.println(a);
        // scanner.close();

        // FileWriter fileWriter = new FileWriter(teste);
        // fileWriter.write("çççççãããã");
        // fileWriter.close();
    }
}