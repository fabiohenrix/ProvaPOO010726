package model;

public class Equipamento {

    private int id;
    private String patrimonio;
    private String descricao;
    private String fabricante;
    private int laboratorioID;

    public Equipamento() {
    }

    public Equipamento(int id, String patrimonio, String descricao, String fabricante, int laboratorioID) {

        this.id = id;
        this.patrimonio = patrimonio;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.laboratorioID = laboratorioID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getLaboratorioId() {
        return laboratorioID;
    }

    public void setLaboratorioId(int laboratorioID) {
        this.laboratorioID = laboratorioID;
    }
}