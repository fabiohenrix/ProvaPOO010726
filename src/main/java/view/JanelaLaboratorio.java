package view;

import controller.GerenciarController;
import model.Laboratorio;

import javax.swing.*;

public class JanelaLaboratorio extends JFrame {
    private GerenciarController controller = new GerenciarController();
    private JLabel labelNome;
    private JLabel labelId;
    private JLabel labelCapacidade;
    private JLabel labelBloco;
    private JButton botaoSalvar;
    private JButton botaoExcluir;
    private JTextField textoNome;
    private JTextField textoId;
    private JTextField textoBloco;
    private JTextField textoCapacidade;
    private JTextArea textoResultado;

    public JanelaLaboratorio() {
        initComponents();
    }

    private void initComponents() {
        labelNome = new JLabel();
        labelCapacidade = new JLabel();
        labelBloco = new JLabel();
        labelId = new JLabel();
        textoNome = new JTextField();
        textoCapacidade = new JTextField();
        textoBloco = new JTextField();
        textoId = new JTextField();
        botaoSalvar = new JButton();
        botaoExcluir = new JButton();
        textoResultado = new JTextArea();


        setTitle("GERENCIAMENTO DE LABORATÓRIOS");

        setLayout(null);
        setSize(340, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// CAMPO ID

        labelId = new JLabel();

        labelId.setText("ID:");
        labelId.setBounds(30, 20, 80, 25);
        add(labelId);

        textoId = new JTextField();

        textoId.setColumns(20);
        textoId.setBounds(110, 20, 180, 25);
        add(textoId);

//CAMPO NOME

        labelNome = new JLabel();

        labelNome.setText("Nome:");
        labelNome.setBounds(30, 60, 80, 25);
        add(labelNome);

        textoNome = new JTextField();

        textoNome.setColumns(20);
        textoNome.setBounds(110, 60, 180, 25);
        add(textoNome);

//CAMPO CAPACIDADE

        labelCapacidade = new JLabel();

        labelCapacidade.setText("Capacidade:");
        labelCapacidade.setBounds(30, 140, 80, 25);
        add(labelCapacidade);

        textoCapacidade = new JTextField();

        textoCapacidade.setColumns(20);
        textoCapacidade.setBounds(110, 140, 180, 25);
        add(textoCapacidade);

//CAMPO BLOCO

        labelBloco = new JLabel();

        labelBloco.setText("Bloco:");
        labelBloco.setBounds(30, 100, 80, 25);
        add(labelBloco);

        textoBloco = new JTextField();

        textoBloco.setColumns(20);
        textoBloco.setBounds(110, 100, 180, 25);
        add(textoBloco);


//BOTÕES
        botaoSalvar = new JButton();

        botaoSalvar.setText("Salvar");

        botaoSalvar.addActionListener(evt -> {

            try {

                Laboratorio laboratorio = new Laboratorio();

                laboratorio.setNome(textoNome.getText());
                laboratorio.setBloco(textoBloco.getText());
                laboratorio.setCapacidade(Integer.parseInt(textoCapacidade.getText()));

                controller.salvarLaboratorio(laboratorio);

                JOptionPane.showMessageDialog(null,
                        "Laboratório cadastrado com sucesso!");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,
                        "Erro: " + e.getMessage());

            }

        });

        botaoSalvar.setBounds(30, 190, 120, 30);
        add(botaoSalvar);


        botaoExcluir = new JButton();

        botaoExcluir.setText("Excluir");

        botaoExcluir.addActionListener(evt -> {

            try {

                int id = Integer.parseInt(textoId.getText());

                if (controller.excluirLaboratorio(id)) {

                    JOptionPane.showMessageDialog(null,
                            "Laboratório excluído com sucesso.");

                } else {

                    JOptionPane.showMessageDialog(null,
                            "Não é possível excluir.\nExistem equipamentos vinculados.");

                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,
                        "Erro: " + e.getMessage());

            }

        });

        botaoExcluir.setBounds(170, 190, 120, 30);
        add(botaoExcluir);


    }
}
