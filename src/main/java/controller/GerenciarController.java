package controller;

import dao.GerenciarDao;
import model.Laboratorio;

public class GerenciarController {
    private GerenciarDao = new GerenciarDao;


    public void excluirEquipamento(int id, String laboratorio){
        dao.deletarEquipamento();
        return null;
    }
    public void excluirLaboratorio(int id){
        dao.deletarLaboratorio();
        return null;
    }

    public void salvarLaboratorio(String nome, String bloco, int capacidade, int id){
        Laboratorio lab = new Laboratorio();
        lab.setNome();

    }




}
