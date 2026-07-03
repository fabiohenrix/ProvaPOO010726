package model;

public class Laboratorio {

    private int id;
    private String nome;
    private String bloco;
    private int capacidade;

    public Laboratorio() {
    }

    public Laboratorio(int id, String nome, String bloco, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.bloco = bloco;
        this.capacidade = capacidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}