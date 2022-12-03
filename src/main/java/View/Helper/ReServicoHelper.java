/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Servico;
import Model.TableModel.ReServicoTableModel;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ander
 */
public class ReServicoHelper {
    private final View.TelaReServico view;

    public ReServicoHelper(View.TelaReServico view) {
        this.view = view;
    }

    public void preencherTabela(Map<Servico, Double> relatorio) {
        view.getJtRelatorioServicos().setModel(new ReServicoTableModel(relatorio));
        
//        DefaultTableModel tableModel = (DefaultTableModel) view.getJtRelatorioServicos().getModel();
//        tableModel.setNumRows(0);
//        
//        for (Map.Entry<Servico, Double> servico : relatorio.entrySet()) {
//            tableModel.addRow(new Object[] {
//                servico.getKey().getDescricao(),
//                String.format("R$ %.2f", servico.getValue())
//            });           
//        }
    }
}