package model;

public class Equipamento {
    private int id;
    private String patrimonio;
    private String descricao;
    private String fabricante;
    private String laboratorio;

    public Equipamento(){

    }
    public void setDescricao(){
        this.descricao = descricao;
    }
    public void setId(){
        this.id = id;
    }
    public void setFabricante(){
        this.fabricante = fabricante;
    }
    public void setLaboratorio(){
        this.laboratorio = laboratorio;
    }
    public void setPatrimonio(){
        this.patrimonio = patrimonio;
    }
    public String getPatrimonio(String patrimonio){
      return patrimonio;
    }
    public String getDescricao(String descricao){
        return descricao;
    }
    public String getFabricante(String fabricante){
        return fabricante;
    }
    public String getLaboratorio(String laboratorio){
        return laboratorio;
    }
    public int getId(int id){
        return id;
    }

}
