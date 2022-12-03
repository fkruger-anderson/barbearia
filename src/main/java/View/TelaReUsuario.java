/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ReUsuarioController;
import javax.swing.JRadioButton;
import javax.swing.JTable;

/**
 *
 * @author ander
 */
public class TelaReUsuario extends javax.swing.JFrame {

    private final ReUsuarioController controller;
    /**
     * Creates new form ReServico
     */
    public TelaReUsuario() {
        initComponents();
        controller = new ReUsuarioController(this);
        controller.relatorioAlfabetica();
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

        bgOrdenacao = new javax.swing.ButtonGroup();
        rbDesempenho = new javax.swing.JRadioButton();
        rbAlfabetica = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRelatorioUsuarios = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgOrdenacao.add(rbDesempenho);
        rbDesempenho.setForeground(new java.awt.Color(255, 255, 255));
        rbDesempenho.setText("Desempenho");
        getContentPane().add(rbDesempenho, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        bgOrdenacao.add(rbAlfabetica);
        rbAlfabetica.setForeground(new java.awt.Color(255, 255, 255));
        rbAlfabetica.setText("Alfabética");
        getContentPane().add(rbAlfabetica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jtRelatorioUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Barbeiro", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtRelatorioUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 388, 275));

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 180, 330));

        jLabel11.setBackground(new java.awt.Color(0, 43, 80));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOrdenacao;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtRelatorioUsuarios;
    private javax.swing.JRadioButton rbAlfabetica;
    private javax.swing.JRadioButton rbDesempenho;
    // End of variables declaration//GEN-END:variables

    public JTable getJtRelatorioUsuarios() {
        return jtRelatorioUsuarios;
    }

    public JRadioButton getRbAlfabetica() {
        return rbAlfabetica;
    }

    public JRadioButton getRbDesempenho() {
        return rbDesempenho;
    }
    
    private void iniciarBotoes() {
        getRbAlfabetica().addActionListener(e -> {
            controller.relatorioAlfabetica();
        });
        
        getRbDesempenho().addActionListener(e -> {
            controller.relatorioDesempenho();
        });
    }
}