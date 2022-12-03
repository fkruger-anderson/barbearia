/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.TableModel;

import Model.Servico;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ander
 */
public class ReServicoTableModel extends AbstractTableModel {
    
    private final Object[][] relatorio;
    private final String[] colunas = {"Serviço", "Total"};

    public ReServicoTableModel(Map<Servico, Double> relatorio) {
        this.relatorio = relatorio.entrySet()
                                  .stream()
                                  .map(e -> new Object[]{e.getKey(), e.getValue()})
                                  .toArray(Object[][]::new);
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return relatorio.length;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return relatorio[rowIndex][columnIndex];
    }    
}