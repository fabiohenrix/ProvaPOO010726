package app;

import view.JanelaEquipamento;
import view.JanelaLaboratorio;

public class Main {
    public static void main(String[] args) {

        JanelaLaboratorio janelaLab = new JanelaLaboratorio();
        JanelaEquipamento janelaEquip = new JanelaEquipamento();

        janelaLab.setLocation(100, 100);
        janelaEquip.setLocation(470, 100);

        janelaLab.setVisible(true);
        janelaEquip.setVisible(true);

    }

}