package view;

import controller.GerenciarController;
import model.Equipamento;

import javax.swing.*;

public class JanelaEquipamento extends JFrame {

    private GerenciarController controller = new GerenciarController();

    private JLabel labelId;
    private JLabel labelPatrimonio;
    private JLabel labelDescricao;
    private JLabel labelFabricante;
    private JLabel labelLaboratorio;

    private JTextField textoId;
    private JTextField textoPatrimonio;
    private JTextField textoDescricao;
    private JTextField textoFabricante;
    private JTextField textoLaboratorio;

    private JButton botaoSalvar;
    private JButton botaoExcluir;

    public JanelaEquipamento() {
        initComponents();
    }

    private void initComponents() {

        labelId = new JLabel();
        labelPatrimonio = new JLabel();
        labelDescricao = new JLabel();
        labelFabricante = new JLabel();
        labelLaboratorio = new JLabel();

        textoId = new JTextField();
        textoPatrimonio = new JTextField();
        textoDescricao = new JTextField();
        textoFabricante = new JTextField();
        textoLaboratorio = new JTextField();

        botaoSalvar = new JButton();
        botaoExcluir = new JButton();



        setTitle("GERENCIAMENTO DE EQUIPAMENTOS");

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// CAMPO ID

        labelId = new JLabel();

        labelId.setText("ID:");
        labelId.setBounds(30, 20, 100, 25);
        add(labelId);

        textoId = new JTextField();

        textoId.setColumns(20);
        textoId.setBounds(140, 20, 150, 25);
        add(textoId);

// CAMPO PATRIMÔNIO

        labelPatrimonio = new JLabel();

        labelPatrimonio.setText("Patrimônio:");
        labelPatrimonio.setBounds(30, 60, 100, 25);
        add(labelPatrimonio);

        textoPatrimonio = new JTextField();

        textoPatrimonio.setColumns(20);
        textoPatrimonio.setBounds(140, 60, 150, 25);
        add(textoPatrimonio);

// CAMPO DESCRIÇÃO

        labelDescricao = new JLabel();

        labelDescricao.setText("Descrição:");
        labelDescricao.setBounds(30, 100, 100, 25);
        add(labelDescricao);

        textoDescricao = new JTextField();

        textoDescricao.setColumns(20);
        textoDescricao.setBounds(140, 100, 150, 25);
        add(textoDescricao);

// CAMPO FABRICANTE

        labelFabricante = new JLabel();

        labelFabricante.setText("Fabricante:");
        labelFabricante.setBounds(30, 140, 100, 25);
        add(labelFabricante);

        textoFabricante = new JTextField();

        textoFabricante.setColumns(20);
        textoFabricante.setBounds(140, 140, 150, 25);
        add(textoFabricante);

// CAMPO LABORATÓRIO

        labelLaboratorio = new JLabel();

        labelLaboratorio.setText("ID Laboratório:");
        labelLaboratorio.setBounds(30, 180, 100, 25);
        add(labelLaboratorio);

        textoLaboratorio = new JTextField();

        textoLaboratorio.setColumns(20);
        textoLaboratorio.setBounds(140, 180, 150, 25);
        add(textoLaboratorio);

// BOTÃO SALVAR

        botaoSalvar = new JButton();

        botaoSalvar.setText("Salvar");

        botaoSalvar.addActionListener(evt -> {

            try {

                Equipamento equipamento = new Equipamento();

                equipamento.setPatrimonio(textoPatrimonio.getText());
                equipamento.setDescricao(textoDescricao.getText());
                equipamento.setFabricante(textoFabricante.getText());
                equipamento.setLaboratorioId(Integer.parseInt(textoLaboratorio.getText()));

                if (controller.salvarEquipamento(equipamento)) {

                    JOptionPane.showMessageDialog(null,
                            "Equipamento cadastrado com sucesso!");

                } else {

                    JOptionPane.showMessageDialog(null,
                            "Já existe um equipamento com esse patrimônio.");

                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,
                        "Erro: " + e.getMessage());

            }

        });

        botaoSalvar.setBounds(30, 230, 120, 30);
        add(botaoSalvar);

// BOTÃO EXCLUIR

        botaoExcluir = new JButton();

        botaoExcluir.setText("Excluir");

        botaoExcluir.addActionListener(evt -> {

            try {

                int id = Integer.parseInt(textoId.getText());

                controller.excluirEquipamento(id);

                JOptionPane.showMessageDialog(null,
                        "Equipamento excluído com sucesso.");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,
                        "Erro: " + e.getMessage());

            }

        });

        botaoExcluir.setBounds(170, 230, 120, 30);
        add(botaoExcluir);

        setSize(360, 340);
        setLocationRelativeTo(null);
    }
}