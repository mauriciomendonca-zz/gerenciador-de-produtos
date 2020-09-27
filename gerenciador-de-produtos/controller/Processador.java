package controller;

public class Processador extends Produto {
    private double frequencia;

    public Processador(String nome, String fabricante, double valor, double frequencia) {
        super(nome, fabricante, valor);
        this.frequencia = frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
}
