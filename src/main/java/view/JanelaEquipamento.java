package view;

import controller.GerenciarController;
import javax.swing.*;

public class JanelaEquipamento extends JFrame {
    private GerenciarController controller = new GerenciarController();
    private JLabel labelDescricao;
    private JLabel labelFabricante;
    private JLabel labelLaboratorio;
    private JLabel labelPatrimonio;
    private JButton botaoSalvar;
    private JButton botaoExcluir;
    private JTextField textoDescricao;
    private JTextField textoFabricante;
    private JTextField textoLaboratorio;
    private JTextField textoPatrimonio;
    private JTextArea textoResultado;

    public JanelaEquipamento(){
        initComponents();
    }

    private void initComponents() {
        labelPatrimonio = new JLabel();
        labelLaboratorio = new JLabel();
        labelDescricao = new JLabel();
        labelFabricante = new JLabel();

        textoDescricao = new JTextField();
        textoPatrimonio = new JTextField();
        textoFabricante = new JTextField();
        textoLaboratorio = new JTextField();

        botaoSalvar = new JButton();
        botaoExcluir = new JButton();
        textoResultado = new JTextArea();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("GERENCIAMENTO DE EQUIPAMENTOS");

        setLayout(null);

//CAMPO PATRIMONIO
        labelPatrimonio.setText("Nome: ");
        labelPatrimonio.setBounds(50, 45, 40, 25);
        add(labelPatrimonio);

        textoPatrimonio.setColumns(20);
        textoPatrimonio.setBounds(90, 50, 180, 20);
        add(textoPatrimonio);

//CAMPO DESCRIÇÃO
        labelDescricao.setText("Capacidade: ");
        labelDescricao.setBounds(50, 45, 40, 25);
        add(labelDescricao);

        textoDescricao.setColumns(20);
        textoDescricao.setBounds(90, 50, 180, 20);
        add(textoDescricao);
//CAMPO FABRICANTE

        labelFabricante.setText("Capacidade: ");
        labelFabricante.setBounds(50, 45, 40, 25);
        add(labelFabricante);

        textoFabricante.setColumns(20);
        textoFabricante.setBounds(90, 50, 180, 20);
        add(textoFabricante);
//CAMPO LABORATORIO

        labelLaboratorio.setText("Capacidade: ");
        labelLaboratorio.setBounds(50, 45, 40, 25);
        add(labelLaboratorio);

        textoLaboratorio.setColumns(20);
        textoLaboratorio.setBounds(90, 50, 180, 20);
        add(textoLaboratorio);


//BOTÕES
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(evt -> {



                }
        );

        botaoSalvar.setBounds(30, 120, 110, 30);
        add(botaoSalvar);


        textoResultado.setColumns(20);
        textoResultado.setRows(5);

        textoResultado.setBounds(30, 210, 240, 100);
        add(textoResultado);

        setSize(330, 450);
        setLocationRelativeTo(null);



        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(evt -> {



        );

            botaoExcluir.setBounds(30, 160, 110, 30);
            add(botaoExcluir);
        }



    }
