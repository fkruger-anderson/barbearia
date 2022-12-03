/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MenuPrincipalController;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class TelaMenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    /**
     * Creates new form MenuPrincipal
     */
    public TelaMenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);
        controller.nivelAcesso();
        iniciarBotoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        miCliente = new javax.swing.JMenuItem();
        miServico = new javax.swing.JMenuItem();
        miUsuario = new javax.swing.JMenuItem();
        jmOperacao = new javax.swing.JMenu();
        miAgenda = new javax.swing.JMenuItem();
        jmRelatórios = new javax.swing.JMenu();
        miReServico = new javax.swing.JMenuItem();
        miReUsuario = new javax.swing.JMenuItem();
        miClientesPeriodo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 43, 80));

        jLabel1.setBackground(new java.awt.Color(0, 43, 80));
        jLabel1.setOpaque(true);

        jMenuBar1.setBackground(new java.awt.Color(255, 197, 84));

        jmCadastro.setBackground(new java.awt.Color(255, 197, 84));
        jmCadastro.setForeground(new java.awt.Color(0, 43, 80));
        jmCadastro.setText("Cadastro");

        miCliente.setBackground(new java.awt.Color(255, 197, 84));
        miCliente.setForeground(new java.awt.Color(0, 43, 80));
        miCliente.setText("Cliente");
        jmCadastro.add(miCliente);

        miServico.setBackground(new java.awt.Color(255, 197, 84));
        miServico.setForeground(new java.awt.Color(0, 43, 80));
        miServico.setText("Serviço");
        jmCadastro.add(miServico);

        miUsuario.setBackground(new java.awt.Color(255, 197, 84));
        miUsuario.setForeground(new java.awt.Color(0, 43, 80));
        miUsuario.setText("Usuário");
        jmCadastro.add(miUsuario);

        jMenuBar1.add(jmCadastro);

        jmOperacao.setBackground(new java.awt.Color(255, 197, 84));
        jmOperacao.setForeground(new java.awt.Color(0, 43, 80));
        jmOperacao.setText("Operação");

        miAgenda.setBackground(new java.awt.Color(255, 197, 84));
        miAgenda.setForeground(new java.awt.Color(0, 43, 80));
        miAgenda.setText("Agenda");
        jmOperacao.add(miAgenda);

        jMenuBar1.add(jmOperacao);

        jmRelatórios.setBackground(new java.awt.Color(255, 197, 84));
        jmRelatórios.setForeground(new java.awt.Color(0, 43, 80));
        jmRelatórios.setText("Relatórios");

        miReServico.setText("Serviço");
        jmRelatórios.add(miReServico);

        miReUsuario.setText("Barbeiro");
        jmRelatórios.add(miReUsuario);

        miClientesPeriodo.setText("Clientes - Período");
        jmRelatórios.add(miClientesPeriodo);

        jMenuBar1.add(jmRelatórios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmOperacao;
    private javax.swing.JMenu jmRelatórios;
    private javax.swing.JMenuItem miAgenda;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miClientesPeriodo;
    private javax.swing.JMenuItem miReServico;
    private javax.swing.JMenuItem miReUsuario;
    private javax.swing.JMenuItem miServico;
    private javax.swing.JMenuItem miUsuario;
    // End of variables declaration//GEN-END:variables

    public JMenuItem getMiAgenda() {
        return miAgenda;
    }

    public JMenuItem getMiCliente() {
        return miCliente;
    }

    public JMenuItem getMiClientesPeriodo() {
        return miClientesPeriodo;
    }

    public JMenuItem getMiServico() {
        return miServico;
    }

    public JMenuItem getMiServicoAlf() {
        return miReServico;
    }

    public JMenuItem getMiUsuario() {
        return miUsuario;
    }

    public JMenuItem getMiUsuarioAlf() {
        return miReUsuario;
    }

    public void exibeMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    private void iniciarBotoes() {
        miServico.addActionListener(e -> {
            this.controller.navegarParaCadastroServico();
        });
        
        miAgenda.addActionListener(e -> {
            this.controller.navegarParaAgenda();
        });
        
        miCliente.addActionListener(e -> {
            this.controller.navegarParaCadastroCliente();
        });
        
        miUsuario.addActionListener(e -> {
            this.controller.navegarParaCadastroUsuario();
        });
        
        miReServico.addActionListener(e -> {
            this.controller.navegarParaReServico();
        });
        
        miReUsuario.addActionListener(e -> {
            this.controller.navegarParaReUsuario();
        });
        
        miClientesPeriodo.addActionListener(e ->{
            this.controller.navegarParaReCliente();
        });
    }
}