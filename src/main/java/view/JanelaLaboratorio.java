package view;

import controller.GerenciarController;
import javax.swing.*;

public class JanelaLaboratorio extends JFrame {
    private GerenciarController controller = new GerenciarController();
    private JLabel labelNome;
    private JLabel labelCapacidade;
    private JLabel labelBloco;
    private JButton botaoSalvar;
    private JButton botaoExcluir;
    private JTextField textoNome;
    private JTextField textoBloco;
    private JTextField textoCapacidade;
    private JTextArea textoResultado;

    public JanelaLaboratorio(){
        initComponents();
    }

    private void initComponents() {
        labelNome = new JLabel();
        labelCapacidade = new JLabel();
        labelBloco = new JLabel();

        textoNome = new JTextField();
        textoCapacidade = new JTextField();
        textoBloco = new JTextField();

        botaoSalvar = new JButton();
        botaoExcluir = new JButton();
        textoResultado = new JTextArea();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("GERENCIAMENTO DE LABORATÓRIOS");

        setLayout(null);

//CAMPO NOME
        labelNome.setText("Nome: ");
        labelNome.setBounds(50, 45, 40, 25);
        add(labelNome);

        textoNome.setColumns(20);
        textoNome.setBounds(90, 50, 180, 20);
        add(textoNome);

//CAMPO CAPACIDADE
        labelCapacidade.setText("Capacidade: ");
        labelCapacidade.setBounds(50, 45, 40, 25);
        add(labelCapacidade);

        textoCapacidade.setColumns(20);
        textoCapacidade.setBounds(90, 50, 180, 20);
        add(textoCapacidade);

//CAMPO BLOCO

        labelBloco.setText("Capacidade: ");
        labelBloco.setBounds(50, 45, 40, 25);
        add(labelBloco);

        textoBloco.setColumns(20);
        textoBloco.setBounds(90, 50, 180, 20);
        add(textoBloco);


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
