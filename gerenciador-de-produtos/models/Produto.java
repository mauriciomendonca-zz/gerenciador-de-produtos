package models;

public abstract class Produto {
    private String nome;
    private String fabricante;
    private double valor;

    public Produto(String nome, String fabricante, double valor) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}