package models;

public class DiscoRigido extends Produto {
    private int capacidade;
    private String tipo;

    public DiscoRigido(String nome, String fabricante, double valor, int capacidade, String tipo) {
        super(nome, fabricante, valor);
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
