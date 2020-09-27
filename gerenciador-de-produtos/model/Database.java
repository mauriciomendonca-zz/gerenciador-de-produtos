package model;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Database {

    public void insert() {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "gerenciador-de-produtos", "db", "produto.csv");

        try {
            File file = new File(filePath.toString());

            if (!file.exists()) {
                FileWriter fileWriter = new FileWriter(filePath.toString(), true);
                fileWriter.write("NOME;VALOR;TIPO\n");
                fileWriter.close();
            } else {
                FileWriter fileWriter = new FileWriter(filePath.toString(), true);
                fileWriter.write("LIXO;LIXO;LIXO\n");
                fileWriter.close();
            }
        } catch (Exception e) {
            //TODO: handle exception
        }

    }

    public void remove() {
        System.out.println("remover");
    }

    public void sort() {
        System.out.println("ordenar");
    }
}
