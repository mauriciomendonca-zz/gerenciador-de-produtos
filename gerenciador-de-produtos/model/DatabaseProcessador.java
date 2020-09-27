package model;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DatabaseProcessador {

    public void insert(String nome, String fabricante, double valor, double frequencia) {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = Paths.get(currentPath.toString(), "gerenciador-de-produtos", "db", "processador.csv");

        try {
            File file = new File(filePath.toString());

            if (!file.exists()) {
                FileWriter fileWriter = new FileWriter(filePath.toString(), true);
                fileWriter.write("nome;fabricante;valor;frequencia\n");
                fileWriter.write(nome + ";" + fabricante + ";" + valor + ";" + frequencia + "\n");
                fileWriter.close();
            } else {
                FileWriter fileWriter = new FileWriter(filePath.toString(), true);
                fileWriter.write(nome + ";" + fabricante + ";" + valor + ";" + frequencia + "\n");
                fileWriter.close();
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o banco de dados Processador");
        }
    }
}
