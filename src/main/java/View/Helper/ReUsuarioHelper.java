/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.TableModel.ReUsuarioTableModel;
import Model.Usuario;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ander
 */
public class ReUsuarioHelper {
    private final View.TelaReUsuario view;

    public ReUsuarioHelper(View.TelaReUsuario view) {
        this.view = view;
    }

    public void preencherTabela(Map<Usuario, Double> relatorio) {
        view.getJtRelatorioUsuarios().setModel(new ReUsuarioTableModel(relatorio));
        
//        DefaultTableModel tableModel = (DefaultTableModel) view.getJtRelatorioUsuarios().getModel();
//        tableModel.setNumRows(0);
//        
//        for (Map.Entry<Usuario, Double> servico : relatorio.entrySet()) {
//            tableModel.addRow(new Object[] {
//                servico.getKey().getNome(),
//                String.format("R$ %.2f", servico.getValue())
//            });           
//        }
    }
}