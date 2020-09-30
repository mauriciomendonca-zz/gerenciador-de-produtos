package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DatabasePlacaDeVideo {
    private Path currentPath;
    private Path filepath;

    public DatabasePlacaDeVideo() {
        currentPath = Paths.get(System.getProperty("user.dir"));
        filepath = Paths.get(currentPath.toString(), "gerenciador-de-produtos", "db", "placa-de-video.csv");
    }

    public void insert(String nome, String fabricante, double valor, int memoria) {
        try {
            File file = new File(filepath.toString());

            if (!file.exists()) {
                FileWriter fileWriter = new FileWriter(filepath.toString(), true);
                fileWriter.write("nome;fabricante;valor;memoria\n");
                fileWriter.write(nome + ";" + fabricante + ";" + valor + memoria + "\n");
                fileWriter.close();
            } else {
                FileWriter fileWriter = new FileWriter(filepath.toString(), true);
                fileWriter.write(nome + ";" + fabricante + ";" + valor + ";" + memoria + "\n");
                fileWriter.close();
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o banco de dados Produto");
        }
    }

    public void delete(String nome) {
        Path temporaryFilepath = Paths.get(currentPath.toString(), "gerenciador-de-produtos", "db", "temp-placa-de-video.csv");

        File originalFile = new File(filepath.toString());
        File temporaryFile = new File(temporaryFilepath.toString());

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(originalFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(temporaryFile));

            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                if (currentLine.contains(nome)) continue;
                bufferedWriter.write(currentLine + System.getProperty("line.separator"));
            }
            bufferedReader.close();
            bufferedWriter.close();
            temporaryFile.renameTo(originalFile);
        } catch (Exception e) {
            System.out.println("Erro ao deletar a(s) linha(s) do arquivo!");
        }
    }

    public void sort() {
        System.out.println("ordenar");
    }
}