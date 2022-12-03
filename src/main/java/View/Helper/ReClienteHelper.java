/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Cliente;
import Model.TableModel.ReClienteTableModel;
import View.TelaReCliente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ander
 */
public class ReClienteHelper {
    public final TelaReCliente view;
    
    public ReClienteHelper(TelaReCliente view) {
        this.view = view;
    }
    
    public void preencherTabela(Set<Cliente> relatorio) {
        view.getTaClientes().setModel(new ReClienteTableModel(relatorio));
        
//        DefaultTableModel tableModel = (DefaultTableModel) view.getTaClientes().getModel();
//        tableModel.setNumRows(0);
//            for (Cliente cliente : relatorio) {
//                tableModel.addRow(new Object[] {
//                cliente.getNome(),
//                cliente.getSexo(),
//                cliente.getDataNascimento().format(dtf),
//                cliente.getTelefone(),
//                cliente.getEmail(),
//                cliente.getRG(),
//                cliente.getEndereco(),
//                cliente.getCEP()
//            });
//        }
    }
    
    public final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Map<String, LocalDate> obterDatas() {
        LocalDate dataInicio = LocalDate.parse(view.getTfDataInicio().getText(), dtf);
        LocalDate dataFim = LocalDate.parse(view.getTfDataFim().getText(), dtf);
 
        Map<String, LocalDate> datas = new HashMap<>();
        datas.put("dataInicio", dataInicio);
        datas.put("dataFim", dataFim);
        return datas;
    }
    
    public void mostrarMensagem(String msg) {
        view.exibeMensagem(msg);
    }
}