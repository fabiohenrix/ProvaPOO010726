package app;

import view.JanelaEquipamento;
import view.JanelaLaboratorio;

public class Main {
    public static void main(String[] args){
        JanelaLaboratorio janelalab = new JanelaLaboratorio();
        JanelaEquipamento janelaequip = new JanelaEquipamento();
        janelaequip.setVisible(true);
        janelalab.setVisible(true);
    }

}
