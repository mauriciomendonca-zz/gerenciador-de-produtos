package controller;

public class PlacaDeVideo extends Produto {
    private int memoria;

    public PlacaDeVideo(String nome, String fabricante, double valor, int memoria) {
        super(nome, fabricante, valor);
        this.memoria = memoria;
    }
}
