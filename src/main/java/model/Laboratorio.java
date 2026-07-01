package model;

public class Laboratorio {

    private int id;
    private String nome;
    private int bloco;
    private int capacidade;

    public Laboratorio(String nome, int id, int bloco, int capacidade){
        this.nome = nome;
        this.id = id;
        this.bloco = bloco;
        this.capacidade = capacidade;
    }

    public void setNome(){
        this.nome = nome;
    }
    public void setId(){
        this.id = id;
    }
    public void setCapacidade(){
        this.capacidade = capacidade;
    }
    public void setBloco(){
        this.bloco = bloco;
    }
    public int getBloco(int bloco){
        return bloco;
    }
    public int getCapacidade(int capacidade){
        return capacidade;
    }
    public int getId(int id){
        return id;
    }
    public String getNome(String nome){
        return nome;
    }

}
