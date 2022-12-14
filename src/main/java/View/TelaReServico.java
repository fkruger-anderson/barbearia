/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ReServicoController;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTable;

/**
 *
 * @author ander
 */
public class TelaReServico extends javax.swing.JFrame {

    private final ReServicoController controller;
    /**
     * Creates new form ReServico
     */
    public TelaReServico() {
        initComponents();
        controller = new ReServicoController(this);
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
        jtRelatorioServicos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bgOrdenacao.add(rbDesempenho);
        rbDesempenho.setForeground(new java.awt.Color(255, 255, 255));
        rbDesempenho.setText("Desempenho");

        bgOrdenacao.add(rbAlfabetica);
        rbAlfabetica.setForeground(new java.awt.Color(255, 255, 255));
        rbAlfabetica.setText("Alfabética");

        jtRelatorioServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Serviço", "Total"
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
        jScrollPane1.setViewportView(jtRelatorioServicos);

        jLabel11.setBackground(new java.awt.Color(0, 43, 80));
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(rbAlfabetica)
                        .addGap(18, 18, 18)
                        .addComponent(rbDesempenho)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDesempenho)
                    .addComponent(rbAlfabetica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOrdenacao;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtRelatorioServicos;
    private javax.swing.JRadioButton rbAlfabetica;
    private javax.swing.JRadioButton rbDesempenho;
    // End of variables declaration//GEN-END:variables

    public JTable getJtRelatorioServicos() {
        return jtRelatorioServicos;
    }

    public JRadioButton getRbAlfabetica() {
        return rbAlfabetica;
    }

    public JRadioButton getRbDesempenho() {
        return rbDesempenho;
    }

    public ButtonGroup getBgOrdenacao() {
        return bgOrdenacao;
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
