package controller;

import dao.GerenciarDao;
import model.Equipamento;
import model.Laboratorio;

public class GerenciarController {

    private GerenciarDao dao = new GerenciarDao();


    public void salvarLaboratorio(Laboratorio laboratorio) {
        dao.salvarLaboratorio(laboratorio);
    }

    public boolean excluirLaboratorio(int id) {

        if (dao.laboratorioTemEquipamentos(id)) {
            return false;
        }

        dao.deletarLaboratorio(id);
        return true;
    }

    public boolean salvarEquipamento(Equipamento equipamento) {

        if (dao.patrimonioExiste(equipamento.getPatrimonio())) {
            return false;
        }

        dao.salvarEquipamento(equipamento);
        return true;
    }

    public void excluirEquipamento(int id) {
        dao.deletarEquipamento(id);
    }

}