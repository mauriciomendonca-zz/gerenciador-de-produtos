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
            FileWriter fileWriter = new FileWriter(filePath.toString());

            if (file.isFile() && file.exists()) {
                fileWriter.write("hahahahaha\n");
                fileWriter.close();
            }
            else {
                fileWriter.write("NOME;VALOR;TIPO");
                fileWriter.close();
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo para o banco de dados");
        }
    }

    public void remove() {
        System.out.println("remover");
    }

    public void sort() {
        System.out.println("ordenar");
    }
}
